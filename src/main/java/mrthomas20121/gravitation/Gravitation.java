package mrthomas20121.gravitation;

import mrthomas20121.gravitation.block.GravitationBlocks;
import mrthomas20121.gravitation.block.wood.GraviWoodType;
import mrthomas20121.gravitation.block_entity.GraviBlockEntityTypes;
import mrthomas20121.gravitation.data.*;
import mrthomas20121.gravitation.data.loot.GlobalLootModifiers;
import mrthomas20121.gravitation.data.loot.LootDataProvider;
import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GravitationCreativeTab;
import mrthomas20121.gravitation.item.GravitationItems;
import mrthomas20121.gravitation.particle.GraviParticleTypes;
import mrthomas20121.gravitation.world.biome.GravitationRegion;
import mrthomas20121.gravitation.world.biome.GravitationSurfaceData;
import mrthomas20121.gravitation.world.foliageplacer.GravitationFoliagePlacerType;
import mrthomas20121.gravitation.world.treedecorator.GravitationDecoratorTypes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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
		GravitationBlocks.BLOCKS.register(bus);
		GravitationItems.ITEMS.register(bus);
		GraviEntityTypes.ENTITY_TYPES.register(bus);
		GlobalLootModifiers.LOOT_MODIFIERS.register(bus);
		GravitationEnchantments.ENCHANTING.register(bus);
		GravitationCreativeTab.CREATIVE_TABS.register(bus);
		GravitationFoliagePlacerType.FOLIAGE_PLACERS.register(bus);
		GravitationDecoratorTypes.TREE_DECORATORS.register(bus);
		GraviParticleTypes.PARTICLES.register(bus);

		GraviWoodType.registerWoodTypes();
	}

	public void setup(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GravitationBlocks.registerFlammability();
			GravitationBlocks.registerPots();
			GravitationBlocks.registerStripping();

			Regions.register(new GravitationRegion(new ResourceLocation(MOD_ID, "gravitation"), 20));

			SurfaceRuleManager.addSurfaceRules(AetherRuleCategory.THE_AETHER, MOD_ID, GravitationSurfaceData.rules());
		});
	}

	public void datagen(GatherDataEvent event) {
		PackOutput packOutput = event.getGenerator().getPackOutput();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

		// client
		event.getGenerator().addProvider(event.includeClient(), new GravitationBlockstateData(packOutput, existingFileHelper));
		event.getGenerator().addProvider(event.includeClient(), new GravitationItemData(packOutput, existingFileHelper));
		event.getGenerator().addProvider(event.includeClient(), new GravitationLanguageData(packOutput));

		// server
		event.getGenerator().addProvider(event.includeServer(), new GravitationAdvancementsData(packOutput, lookupProvider, existingFileHelper));
		event.getGenerator().addProvider(event.includeServer(), new GravitationRegistrySets(packOutput, lookupProvider));
		event.getGenerator().addProvider(event.includeServer(), new LootDataProvider(packOutput));
		GravitationBlockTags blockTags = new GravitationBlockTags(packOutput, lookupProvider, existingFileHelper);
		event.getGenerator().addProvider(event.includeServer(), blockTags);
		event.getGenerator().addProvider(event.includeServer(), GravitationLoot.create(packOutput));
		event.getGenerator().addProvider(event.includeServer(), new GravitationRecipes(packOutput));
		event.getGenerator().addProvider(event.includeServer(), new GravitationEntityTagsData(packOutput, lookupProvider, existingFileHelper));
		event.getGenerator().addProvider(event.includeServer(), new GravitationItemTags(packOutput, lookupProvider, blockTags.contentsGetter(), existingFileHelper));
		//event.getGenerator().addProvider(event.includeServer(), new GravitationBiomeTagsData(packOutput, lookupProvider, existingFileHelper));
	}
}
