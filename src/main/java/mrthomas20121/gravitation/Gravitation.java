package mrthomas20121.gravitation;

import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.block.wood.GraviWoodType;
import mrthomas20121.gravitation.block_entity.GraviBlockEntityTypes;
import mrthomas20121.gravitation.client.GraviModelPredicate;
import mrthomas20121.gravitation.compat.ModCompat;
import mrthomas20121.gravitation.data.*;
import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GraviItems;
import mrthomas20121.gravitation.data.loot.GlobalLootModifiers;
import mrthomas20121.gravitation.data.loot.LootDataProvider;
import mrthomas20121.gravitation.world.biome.GravitationRegion;
import mrthomas20121.gravitation.world.biome.GravitationSurfaceData;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import teamrazor.aeroblender.aether.AetherRuleCategory;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

import java.util.concurrent.CompletableFuture;

@Mod(Gravitation.MOD_ID)
public class Gravitation {

	public static final String MOD_ID = "gravitation";
	public static final Logger LOGGER = LogManager.getLogger();

	public Gravitation() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		bus.addListener(this::setup);
		bus.addListener(this::datagen);

		GraviBlockEntityTypes.BLOCK_ENTITY_TYPES.register(bus);
		GraviBlocks.BLOCKS.register(bus);
		GraviItems.ITEMS.register(bus);
		GraviEntityTypes.ENTITY_TYPES.register(bus);
		GlobalLootModifiers.LOOT_MODIFIERS.register(bus);
		GravitationEnchantments.ENCHANTING.register(bus);

		// register the compats to the game
		ModCompat.register();

		ModCompat.getCompatList().stream().filter(compat -> ModList.get().isLoaded(compat.getModID())).forEach(compat -> compat.register(bus));

		GraviWoodType.registerWoodTypes();

		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
			bus.addListener(this::clientSetup);
		});
	}

	public void clientSetup(FMLClientSetupEvent event) {
		event.enqueueWork(GraviModelPredicate::init);
	}

	public void setup(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GraviBlocks.registerFlammability();
			GraviBlocks.registerPots();
			GraviBlocks.registerStripping();

			Regions.register(new GravitationRegion(new ResourceLocation(MOD_ID, "gravitation"), 20));

			SurfaceRuleManager.addSurfaceRules(AetherRuleCategory.THE_AETHER, MOD_ID, GravitationSurfaceData.rules());
		});
	}

	public void datagen(GatherDataEvent event) {
		PackOutput packOutput = event.getGenerator().getPackOutput();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

		// client
		event.getGenerator().addProvider(event.includeClient(), new GraviBlockstateData(packOutput, existingFileHelper));
		event.getGenerator().addProvider(event.includeClient(), new GraviItemData(packOutput, existingFileHelper));
		event.getGenerator().addProvider(event.includeClient(), new GraviLanguageData(packOutput));

		// server
		event.getGenerator().addProvider(event.includeServer(), new LootDataProvider(packOutput));
		event.getGenerator().addProvider(event.includeServer(), new GraviRegistrySets(packOutput, lookupProvider));
		GraviBlockTags blockTags = new GraviBlockTags(packOutput, lookupProvider, existingFileHelper);
		event.getGenerator().addProvider(event.includeServer(), blockTags);
		event.getGenerator().addProvider(event.includeServer(), GraviLoot.create(packOutput));
		event.getGenerator().addProvider(event.includeServer(), new GraviRecipes(packOutput));
		event.getGenerator().addProvider(event.includeServer(), new GraviEntityTagsData(packOutput, lookupProvider, existingFileHelper));
		event.getGenerator().addProvider(event.includeServer(), new GraviItemTags(packOutput, lookupProvider, blockTags.contentsGetter(), existingFileHelper));
		event.getGenerator().addProvider(event.includeServer(), new GraviBiomeTagsData(packOutput, lookupProvider, existingFileHelper));
	}
}
