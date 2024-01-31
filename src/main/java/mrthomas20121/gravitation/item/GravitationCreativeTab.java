package mrthomas20121.gravitation.item;

import com.aetherteam.aether.Aether;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
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
            .icon(() -> new ItemStack(GraviBlocks.STRIPPED_ENCHANTED_LOG.get()))
            .title(Component.translatable("itemGroup.gravitation.building_blocks"))
            .withTabsBefore(new ResourceLocation(Aether.MODID, "spawn_eggs"))
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

                output.accept(GraviBlocks.AERFIN_SIGN.get());
                output.accept(GraviBlocks.AERFIN_HANGING_SIGN.get());
                output.accept(GraviBlocks.AERFIN_BOOKSHELF.get());
                output.accept(GraviBlocks.AERFIN_LEAVES.get());
                output.accept(GraviBlocks.BLUE_AERFIN_LEAVES.get());
                output.accept(GraviBlocks.GOLDEN_AERFIN_LEAVES.get());
                output.accept(GraviBlocks.AERFIN_LOG.get());
                output.accept(GraviBlocks.STRIPPED_AERFIN_LOG.get());
                output.accept(GraviBlocks.AERFIN_WOOD.get());
                output.accept(GraviBlocks.STRIPPED_AERFIN_WOOD.get());
                output.accept(GraviBlocks.AERFIN_PLANKS.get());
                output.accept(GraviBlocks.AERFIN_STAIRS.get());
                output.accept(GraviBlocks.AERFIN_SLAB.get());
                output.accept(GraviBlocks.AERFIN_FENCE_GATE.get());
                output.accept(GraviBlocks.AERFIN_BUTTON.get());
                output.accept(GraviBlocks.AERFIN_DOOR.get());
                output.accept(GraviBlocks.AERFIN_TRAPDOOR.get());
                output.accept(GraviBlocks.AERFIN_FENCE.get());
                output.accept(GraviBlocks.AERFIN_SAPLING.get());
                output.accept(GraviBlocks.BLUE_AERFIN_SAPLING.get());
                output.accept(GraviBlocks.GOLDEN_AERFIN_SAPLING.get());

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
