package mrthomas20121.gravitation.data;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.world.biome.GravitationBiomes;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class GravitationRegistrySets extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
    {
        public HolderLookup.Provider buildPatch(RegistryAccess registries, HolderLookup.Provider lookup)
        {
            RegistrySetBuilder.BuildState state = this.createState(registries);
            Map<ResourceKey<? extends Registry<?>>, RegistryContents<?>> map = new HashMap<>();
            state.collectReferencedRegistries().forEach((p_272339_) -> {
                map.put(p_272339_.key(), p_272339_);
            });
            this.entries.stream().map((RegistryStub<?> stub) -> stub.collectChanges(state)).forEach((contents) -> map.put(contents.key(), contents));
            Stream<HolderLookup.RegistryLookup<?>> stream = registries.registries().map((entry) -> entry.value().asLookup());
            HolderLookup.Provider holderlookup$provider = HolderLookup.Provider
                    .create(Stream.concat(stream, map.values().stream().map(RegistrySetBuilder.RegistryContents::buildAsLookup).peek(state::addOwner)));
            state.fillMissingHolders(lookup);
            // don't validate missing holder values
            state.throwOnError();
            return holderlookup$provider;
        }
    }
            .add(Registries.CONFIGURED_FEATURE, GravitationConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, GravitationPlacedFeatures::bootstrap)
            .add(Registries.BIOME, GravitationBiomes::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, GravitationBiomeModifiers::bootstrap);

    public GravitationRegistrySets(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Collections.singleton(Gravitation.MOD_ID));
    }
}