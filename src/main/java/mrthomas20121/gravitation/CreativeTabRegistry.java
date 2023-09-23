package mrthomas20121.gravitation;

import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.compat.ModCompat;
import mrthomas20121.gravitation.item.GraviCreativeTabs;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabRegistry {

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        GraviCreativeTabs.TOOLS = event.registerCreativeModeTab(new ResourceLocation(Gravitation.MOD_ID, "equipments"), (builder) -> builder
                .icon(() -> new ItemStack(GraviItems.NEPTUNE_PICKAXE.get()))
                .title(Component.translatable("itemGroup.gravitation.equipments"))
                .displayItems((parameters, output) -> {
                    output.accept(GraviItems.DIG_STONE.get());
                    output.accept(GraviItems.DENSE_STONE.get());
                    output.accept(GraviItems.POWER_STONE.get());
                    output.accept(GraviItems.RAINBOW_STONE.get());
                    output.accept(GraviItems.GREATER_HEALING_STONE.get());
                    output.accept(GraviItems.BRONZITE_ROCK.get());
                    output.accept(GraviItems.BRONZITE_INGOT.get());
                    output.accept(GraviItems.BRONZITE_NUGGET.get());
                    output.accept(GraviItems.BRONZITE_AXE.get());
                    output.accept(GraviItems.BRONZITE_BATTLEAXE.get());
                    output.accept(GraviItems.BRONZITE_HOE.get());
                    output.accept(GraviItems.BRONZITE_PICKAXE.get());
                    output.accept(GraviItems.BRONZITE_Shovel.get());
                    output.accept(GraviItems.BRONZITE_SWORD.get());
                    output.accept(GraviItems.BRONZITE_SHIELD.get());
                    output.accept(GraviItems.BRONZITE_HELMET.get());
                    output.accept(GraviItems.BRONZITE_CHESTPLATE.get());
                    output.accept(GraviItems.BRONZITE_LEGGING.get());
                    output.accept(GraviItems.BRONZITE_BOOTS.get());
                    output.accept(GraviItems.BRONZITE_GLOVES.get());
                    output.accept(GraviItems.BRONZITE_CAPE.get());
                    output.accept(GraviItems.BRONZITE_RING.get());
                    output.accept(GraviItems.BRONZITE_PENDANT.get());
                    output.accept(GraviItems.NEPTUNE_AXE.get());
                    output.accept(GraviItems.NEPTUNE_BATTLEAXE.get());
                    output.accept(GraviItems.NEPTUNE_CUTLASS.get());
                    output.accept(GraviItems.NEPTUNE_PICKAXE.get());
                    output.accept(GraviItems.NEPTUNE_SHOVEL.get());
                    output.accept(GraviItems.NEPTUNE_RING.get());
                    output.accept(GraviItems.NEPTUNE_PENDANT.get());
                    output.accept(GraviItems.VALKYRIE_BATTLEAXE.get());
                    output.accept(GraviItems.GRAVITITE_BATTLEAXE.get());
                    output.accept(GraviItems.ZANITE_BATTLEAXE.get());
                    output.accept(GraviItems.NETHERITE_BATTLEAXE.get());
                    output.accept(GraviItems.DIAMOND_BATTLEAXE.get());
                    output.accept(GraviItems.IRON_BATTLEAXE.get());
                    output.accept(GraviItems.GOLD_BATTLEAXE.get());

                    output.accept(GraviItems.BELADON_BOAT.get());
                    output.accept(GraviItems.BELADON_CHEST_BOAT.get());
                    output.accept(GraviItems.ENCHANTED_BOAT.get());
                    output.accept(GraviItems.ENCHANTED_CHEST_BOAT.get());

                    ModCompat.getCompatList().stream().filter(compat -> ModList.get().isLoaded(compat.getModID())).forEach(compat -> compat.addToCreativeTab(output));
                }));

        GraviCreativeTabs.BUILDING_BLOCKS = event.registerCreativeModeTab(new ResourceLocation(Gravitation.MOD_ID, "building_blocks"), (builder) -> builder
                .icon(() -> new ItemStack(GraviBlocks.STRIPPED_ENCHANTED_LOG.get()))
                .title(Component.translatable("itemGroup.gravitation.building_blocks"))
                .displayItems((parameters, output) -> {
                    output.accept(GraviBlocks.BRONZITE_ORE.get());
                    output.accept(GraviBlocks.BRONZITE_ICESTONE_ORE.get());
                    output.accept(GraviBlocks.BRONZITE_BLOCK.get());

                    output.accept(GraviBlocks.BELADON_SIGN.get());
                    output.accept(GraviBlocks.BELADON_WALL_SIGN.get());
                    output.accept(GraviBlocks.BELADON_BOOKSHELF.get());
                    output.accept(GraviBlocks.BELADON_LEAVES.get());
                    output.accept(GraviBlocks.BELADON_LOG.get());
                    output.accept(GraviBlocks.STRIPPED_BELADON_LOG.get());
                    output.accept(GraviBlocks.BELADON_WOOD.get());
                    output.accept(GraviBlocks.STRIPPED_BELADON_WOOD.get());
                    output.accept(GraviBlocks.BELADON_PLANKS.get());
                    output.accept(GraviBlocks.BELADON_STAIRS.get());
                    output.accept(GraviBlocks.BELADON_SLAB.get());
                    output.accept(GraviBlocks.BELADON_FENCE_GATE.get());
                    output.accept(GraviBlocks.BELADON_BUTTON.get());
                    output.accept(GraviBlocks.BELADON_DOOR.get());
                    output.accept(GraviBlocks.BELADON_TRAPDOOR.get());
                    output.accept(GraviBlocks.BELADON_FENCE.get());
                    output.accept(GraviBlocks.BELADON_SAPLING.get());

                    output.accept(GraviBlocks.ENCHANTED_SIGN.get());
                    output.accept(GraviBlocks.ENCHANTED_WALL_SIGN.get());
                    output.accept(GraviBlocks.ENCHANTED_BOOKSHELF.get());
                    output.accept(GraviBlocks.ENCHANTED_LEAVES.get());
                    output.accept(GraviBlocks.ENCHANTED_LOG.get());
                    output.accept(GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
                    output.accept(GraviBlocks.ENCHANTED_WOOD.get());
                    output.accept(GraviBlocks.STRIPPED_ENCHANTED_WOOD.get());
                    output.accept(GraviBlocks.ENCHANTED_PLANKS.get());
                    output.accept(GraviBlocks.ENCHANTED_STAIRS.get());
                    output.accept(GraviBlocks.ENCHANTED_FENCE.get());
                    output.accept(GraviBlocks.ENCHANTED_FENCE_GATE.get());
                    output.accept(GraviBlocks.ENCHANTED_BUTTON.get());
                    output.accept(GraviBlocks.ENCHANTED_SLAB.get());
                    output.accept(GraviBlocks.ENCHANTED_DOOR.get());
                    output.accept(GraviBlocks.ENCHANTED_TRAPDOOR.get());
                    output.accept(GraviBlocks.ENCHANTED_SAPLING.get());
                    output.accept(GraviBlocks.ENCHANTED_MOSS.get());

                }));
    }
}
