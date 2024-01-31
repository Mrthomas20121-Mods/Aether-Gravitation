package mrthomas20121.gravitation.item;

import com.aetherteam.aether.Aether;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GravitationBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GravitationCreativeTab {

    public static DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gravitation.MOD_ID);

    public static RegistryObject<CreativeModeTab> TOOLS = CREATIVE_TABS.register("tools", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(GravitationItems.NEPTUNE_PICKAXE.get()))
            .title(Component.translatable("itemGroup.gravitation.equipments"))
            .withTabsBefore(new ResourceLocation(Gravitation.MOD_ID, "building_blocks"))
            .withTabsAfter(new ResourceLocation(Gravitation.MOD_ID, "misc"))
            .displayItems((parameters, output) -> {
                output.accept(GravitationItems.BRONZITE_AXE.get());
                output.accept(GravitationItems.BRONZITE_BATTLEAXE.get());
                output.accept(GravitationItems.BRONZITE_HOE.get());
                output.accept(GravitationItems.BRONZITE_PICKAXE.get());
                output.accept(GravitationItems.BRONZITE_Shovel.get());
                output.accept(GravitationItems.BRONZITE_SWORD.get());
                output.accept(GravitationItems.BRONZITE_SHIELD.get());
                output.accept(GravitationItems.BRONZITE_HELMET.get());
                output.accept(GravitationItems.BRONZITE_CHESTPLATE.get());
                output.accept(GravitationItems.BRONZITE_LEGGING.get());
                output.accept(GravitationItems.BRONZITE_BOOTS.get());
                output.accept(GravitationItems.BRONZITE_GLOVES.get());
                output.accept(GravitationItems.BRONZITE_CAPE.get());
                output.accept(GravitationItems.BRONZITE_RING.get());
                output.accept(GravitationItems.BRONZITE_PENDANT.get());
                output.accept(GravitationItems.NEPTUNE_AXE.get());
                output.accept(GravitationItems.NEPTUNE_BATTLEAXE.get());
                output.accept(GravitationItems.NEPTUNE_CUTLASS.get());
                output.accept(GravitationItems.NEPTUNE_PICKAXE.get());
                output.accept(GravitationItems.NEPTUNE_SHOVEL.get());
                output.accept(GravitationItems.NEPTUNE_RING.get());
                output.accept(GravitationItems.NEPTUNE_PENDANT.get());
                output.accept(GravitationItems.VALKYRIE_BATTLEAXE.get());
                output.accept(GravitationItems.GRAVITITE_BATTLEAXE.get());
                output.accept(GravitationItems.ZANITE_BATTLEAXE.get());
                output.accept(GravitationItems.NETHERITE_BATTLEAXE.get());
                output.accept(GravitationItems.DIAMOND_BATTLEAXE.get());
                output.accept(GravitationItems.IRON_BATTLEAXE.get());
                output.accept(GravitationItems.GOLD_BATTLEAXE.get());
            }).build()
    );

    public static RegistryObject<CreativeModeTab> MISC = CREATIVE_TABS.register("misc", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(GravitationItems.AECHOR_STRING.get()))
            .title(Component.translatable("itemGroup.gravitation.misc"))
            .withTabsBefore(new ResourceLocation(Gravitation.MOD_ID, "tools"))
            .displayItems((parameters, output) -> {
                output.accept(GravitationItems.AECHOR_STRING.get());
                output.accept(GravitationItems.DIG_STONE.get());
                output.accept(GravitationItems.DENSE_STONE.get());
                output.accept(GravitationItems.POWER_STONE.get());
                output.accept(GravitationItems.RAINBOW_STONE.get());
                output.accept(GravitationItems.GREATER_HEALING_STONE.get());
                output.accept(GravitationItems.BRONZITE_ROCK.get());
                output.accept(GravitationItems.BRONZITE_INGOT.get());
                output.accept(GravitationItems.BRONZITE_NUGGET.get());
                output.accept(GravitationItems.BRONZITE_UPGRADE.get());
                output.accept(GravitationItems.BELADON_BOAT.get());
                output.accept(GravitationItems.BELADON_CHEST_BOAT.get());
                output.accept(GravitationItems.ENCHANTED_BOAT.get());
                output.accept(GravitationItems.ENCHANTED_CHEST_BOAT.get());
            }).build()
    );

    public static RegistryObject<CreativeModeTab> BUILDING_BLOCKS = CREATIVE_TABS.register("building_blocks", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(GravitationBlocks.STRIPPED_ENCHANTED_LOG.get()))
            .title(Component.translatable("itemGroup.gravitation.building_blocks"))
            .withTabsBefore(new ResourceLocation(Aether.MODID, "spawn_eggs"))
            .withTabsAfter(new ResourceLocation(Gravitation.MOD_ID, "tools"))
            .displayItems((parameters, output) -> {
                output.accept(GravitationBlocks.BRONZITE_ORE.get());
                output.accept(GravitationBlocks.BRONZITE_ICESTONE_ORE.get());
                output.accept(GravitationBlocks.BRONZITE_BLOCK.get());

                output.accept(GravitationBlocks.CONGLOMERATE.get());
                output.accept(GravitationBlocks.CONGLOMERATE_WALLS.get());
                output.accept(GravitationBlocks.CONGLOMERATE_STAIRS.get());
                output.accept(GravitationBlocks.CONGLOMERATE_SLAB.get());

                output.accept(GravitationBlocks.CONGLOMERATE_BRICKS.get());
                output.accept(GravitationBlocks.CONGLOMERATE_BRICK_WALLS.get());
                output.accept(GravitationBlocks.CONGLOMERATE_BRICK_STAIRS.get());
                output.accept(GravitationBlocks.CONGLOMERATE_BRICK_SLAB.get());

                output.accept(GravitationBlocks.POLISHED_CONGLOMERATE.get());
                output.accept(GravitationBlocks.POLISHED_CONGLOMERATE_WALLS.get());
                output.accept(GravitationBlocks.POLISHED_CONGLOMERATE_STAIRS.get());
                output.accept(GravitationBlocks.POLISHED_CONGLOMERATE_SLAB.get());

                output.accept(GravitationBlocks.AERFIN_SIGN.get());
                output.accept(GravitationBlocks.AERFIN_HANGING_SIGN.get());
                output.accept(GravitationBlocks.AERFIN_BOOKSHELF.get());
                output.accept(GravitationBlocks.AERFIN_LEAVES.get());
                output.accept(GravitationBlocks.BLUE_AERFIN_LEAVES.get());
                output.accept(GravitationBlocks.GOLDEN_AERFIN_LEAVES.get());
                output.accept(GravitationBlocks.AERFIN_LOG.get());
                output.accept(GravitationBlocks.STRIPPED_AERFIN_LOG.get());
                output.accept(GravitationBlocks.AERFIN_WOOD.get());
                output.accept(GravitationBlocks.STRIPPED_AERFIN_WOOD.get());
                output.accept(GravitationBlocks.AERFIN_PLANKS.get());
                output.accept(GravitationBlocks.AERFIN_STAIRS.get());
                output.accept(GravitationBlocks.AERFIN_SLAB.get());
                output.accept(GravitationBlocks.AERFIN_FENCE_GATE.get());
                output.accept(GravitationBlocks.AERFIN_BUTTON.get());
                output.accept(GravitationBlocks.AERFIN_DOOR.get());
                output.accept(GravitationBlocks.AERFIN_TRAPDOOR.get());
                output.accept(GravitationBlocks.AERFIN_FENCE.get());
                output.accept(GravitationBlocks.AERFIN_SAPLING.get());
                output.accept(GravitationBlocks.BLUE_AERFIN_SAPLING.get());
                output.accept(GravitationBlocks.GOLDEN_AERFIN_SAPLING.get());

                output.accept(GravitationBlocks.BELADON_SIGN.get());
                output.accept(GravitationBlocks.BELADON_HANGING_SIGN.get());
                output.accept(GravitationBlocks.BELADON_BOOKSHELF.get());
                output.accept(GravitationBlocks.BELADON_LEAVES.get());
                output.accept(GravitationBlocks.BELADON_LOG.get());
                output.accept(GravitationBlocks.STRIPPED_BELADON_LOG.get());
                output.accept(GravitationBlocks.BELADON_WOOD.get());
                output.accept(GravitationBlocks.STRIPPED_BELADON_WOOD.get());
                output.accept(GravitationBlocks.BELADON_PLANKS.get());
                output.accept(GravitationBlocks.BELADON_STAIRS.get());
                output.accept(GravitationBlocks.BELADON_SLAB.get());
                output.accept(GravitationBlocks.BELADON_FENCE_GATE.get());
                output.accept(GravitationBlocks.BELADON_BUTTON.get());
                output.accept(GravitationBlocks.BELADON_DOOR.get());
                output.accept(GravitationBlocks.BELADON_TRAPDOOR.get());
                output.accept(GravitationBlocks.BELADON_FENCE.get());
                output.accept(GravitationBlocks.BELADON_SAPLING.get());

                output.accept(GravitationBlocks.ENCHANTED_SIGN.get());
                output.accept(GravitationBlocks.ENCHANTED_HANGING_SIGN.get());
                output.accept(GravitationBlocks.ENCHANTED_BOOKSHELF.get());
                output.accept(GravitationBlocks.ENCHANTED_LEAVES.get());
                output.accept(GravitationBlocks.ENCHANTED_LOG.get());
                output.accept(GravitationBlocks.STRIPPED_ENCHANTED_LOG.get());
                output.accept(GravitationBlocks.ENCHANTED_WOOD.get());
                output.accept(GravitationBlocks.STRIPPED_ENCHANTED_WOOD.get());
                output.accept(GravitationBlocks.ENCHANTED_PLANKS.get());
                output.accept(GravitationBlocks.ENCHANTED_STAIRS.get());
                output.accept(GravitationBlocks.ENCHANTED_FENCE.get());
                output.accept(GravitationBlocks.ENCHANTED_FENCE_GATE.get());
                output.accept(GravitationBlocks.ENCHANTED_BUTTON.get());
                output.accept(GravitationBlocks.ENCHANTED_SLAB.get());
                output.accept(GravitationBlocks.ENCHANTED_DOOR.get());
                output.accept(GravitationBlocks.ENCHANTED_TRAPDOOR.get());
                output.accept(GravitationBlocks.ENCHANTED_SAPLING.get());
                output.accept(GravitationBlocks.ENCHANTED_MOSS.get());

            }).build()
    );
}
