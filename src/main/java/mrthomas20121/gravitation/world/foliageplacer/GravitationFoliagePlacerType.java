package mrthomas20121.gravitation.world.foliageplacer;

import mrthomas20121.gravitation.Gravitation;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GravitationFoliagePlacerType {

    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS = DeferredRegister.create(ForgeRegistries.FOLIAGE_PLACER_TYPES, Gravitation.MOD_ID);

    public static final RegistryObject<FoliagePlacerType<AerfinFoliagePlacer>> AERFIN_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("aerfin_foliage_placer", () -> new FoliagePlacerType<>(AerfinFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<EnchantedFoliagePlacer>> ENCHANTED_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("enchanted_foliage_placer", () -> new FoliagePlacerType<>(EnchantedFoliagePlacer.CODEC));

}
