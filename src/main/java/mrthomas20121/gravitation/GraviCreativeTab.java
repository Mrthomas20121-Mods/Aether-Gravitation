package mrthomas20121.gravitation;

import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GraviCreativeTab {

    public static DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gravitation.MOD_ID);

    public static RegistryObject<CreativeModeTab> TOOLS = CREATIVE_TABS.register("tools", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(GraviItems.NEPTUNE_PICKAXE.get()))
            .title(Component.translatable("itemGroup.gravitation.equipments"))
            .withTabsBefore(new ResourceLocation(Gravitation.MOD_ID, "building_blocks"))
            .withTabsAfter(new ResourceLocation(Gravitation.MOD_ID, "misc"))
            .displayItems((parameters, output) -> {
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
            }).build()
    );

    public static RegistryObject<CreativeModeTab> MISC = CREATIVE_TABS.register("misc", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(GraviItems.AECHOR_STRING.get()))
            .title(Component.translatable("itemGroup.gravitation.misc"))
            .withTabsBefore(new ResourceLocation(Gravitation.MOD_ID, "tools"))
            .displayItems((parameters, output) -> {
                output.accept(GraviItems.AECHOR_STRING.get());
                output.accept(GraviItems.DIG_STONE.get());
                output.accept(GraviItems.DENSE_STONE.get());
                output.accept(GraviItems.POWER_STONE.get());
                output.accept(GraviItems.RAINBOW_STONE.get());
                output.accept(GraviItems.GREATER_HEALING_STONE.get());
                output.accept(GraviItems.BRONZITE_ROCK.get());
                output.accept(GraviItems.BRONZITE_INGOT.get());
                output.accept(GraviItems.BRONZITE_NUGGET.get());
                output.accept(GraviItems.BELADON_BOAT.get());
                output.accept(GraviItems.BELADON_CHEST_BOAT.get());
                output.accept(GraviItems.ENCHANTED_BOAT.get());
                output.accept(GraviItems.ENCHANTED_CHEST_BOAT.get());
            }).build()
    );

    public static RegistryObject<CreativeModeTab> BUILDING_BLOCKS = CREATIVE_TABS.register("building_blocks", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(GraviBlocks.STRIPPED_ENCHANTED_LOG.get()))
            .title(Component.translatable("itemGroup.gravitation.building_blocks"))
            .withTabsAfter(new ResourceLocation(Gravitation.MOD_ID, "tools"))
            .displayItems((parameters, output) -> {
                output.accept(GraviBlocks.BRONZITE_ORE.get());
                output.accept(GraviBlocks.BRONZITE_ICESTONE_ORE.get());
                output.accept(GraviBlocks.BRONZITE_BLOCK.get());

                output.accept(GraviBlocks.CONGLOMERATE.get());
                output.accept(GraviBlocks.CONGLOMERATE_WALLS.get());
                output.accept(GraviBlocks.CONGLOMERATE_STAIRS.get());
                output.accept(GraviBlocks.CONGLOMERATE_SLAB.get());

                output.accept(GraviBlocks.CONGLOMERATE_BRICKS.get());
                output.accept(GraviBlocks.CONGLOMERATE_BRICK_WALLS.get());
                output.accept(GraviBlocks.CONGLOMERATE_BRICK_STAIRS.get());
                output.accept(GraviBlocks.CONGLOMERATE_BRICK_SLAB.get());

                output.accept(GraviBlocks.POLISHED_CONGLOMERATE.get());
                output.accept(GraviBlocks.POLISHED_CONGLOMERATE_WALLS.get());
                output.accept(GraviBlocks.POLISHED_CONGLOMERATE_STAIRS.get());
                output.accept(GraviBlocks.POLISHED_CONGLOMERATE_SLAB.get());

                output.accept(GraviBlocks.BELADON_SIGN.get());
                output.accept(GraviBlocks.BELADON_HANGING_SIGN.get());
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
                output.accept(GraviBlocks.ENCHANTED_HANGING_SIGN.get());
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

            }).build()
    );
}
