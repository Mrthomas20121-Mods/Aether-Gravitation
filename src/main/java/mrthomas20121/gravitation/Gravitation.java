package mrthomas20121.gravitation;

import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.block.wood.GraviWoodType;
import mrthomas20121.gravitation.block_entity.GraviBlockEntityTypes;
import mrthomas20121.gravitation.data.GraviBlockTags;
import mrthomas20121.gravitation.data.GraviBlockstateData;
import mrthomas20121.gravitation.data.GraviItemData;
import mrthomas20121.gravitation.data.GraviRegistrySets;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GraviItems;
import mrthomas20121.gravitation.loot.GlobalLootModifiers;
import mrthomas20121.gravitation.loot.LootDataProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod(Gravitation.MOD_ID)
public class Gravitation {

	public static final String MOD_ID = "gravitation";
	public static final Logger LOGGER = LogManager.getLogger();

	public Gravitation() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		bus.addListener(this::datagen);

		GraviBlockEntityTypes.BLOCK_ENTITY_TYPES.register(bus);
		GraviBlocks.BLOCKS.register(bus);
		GraviItems.ITEMS.register(bus);
		GraviEntityTypes.ENTITY_TYPES.register(bus);
		GlobalLootModifiers.LOOT_MODIFIERS.register(bus);

		GraviWoodType.registerWoodTypes();
	}

	public void datagen(GatherDataEvent event) {
		PackOutput packOutput = event.getGenerator().getPackOutput();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

		event.getGenerator().addProvider(event.includeServer(), new LootDataProvider(packOutput));
		event.getGenerator().addProvider(event.includeClient(), new GraviBlockstateData(packOutput, existingFileHelper));
		event.getGenerator().addProvider(event.includeClient(), new GraviItemData(packOutput, existingFileHelper));
		event.getGenerator().addProvider(event.includeServer(), new GraviRegistrySets(packOutput, lookupProvider));
		event.getGenerator().addProvider(event.includeServer(), new GraviBlockTags(packOutput, lookupProvider, existingFileHelper));
	}
}
