package mrthomas20121.gravitation.data;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.data.providers.AetherBlockLootSubProvider;
import com.aetherteam.aether.mixin.mixins.common.accessor.BlockLootAccessor;
import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class GraviLoot extends AetherBlockLootSubProvider {

    public GraviLoot() {
        super(new HashSet<>(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(GraviBlocks.AER_GRASS.get());
        this.dropSelf(GraviBlocks.ENCHANTED_MOSS.get());

        this.dropSelf(GraviBlocks.CONGLOMERATE.get());
        this.dropSelf(GraviBlocks.CONGLOMERATE_WALLS.get());
        this.dropSelf(GraviBlocks.CONGLOMERATE_STAIRS.get());
        this.dropSelf(GraviBlocks.CONGLOMERATE_SLAB.get());

        this.dropSelf(GraviBlocks.CONGLOMERATE_BRICKS.get());
        this.dropSelf(GraviBlocks.CONGLOMERATE_BRICK_WALLS.get());
        this.dropSelf(GraviBlocks.CONGLOMERATE_BRICK_STAIRS.get());
        this.dropSelf(GraviBlocks.CONGLOMERATE_BRICK_SLAB.get());

        this.dropSelf(GraviBlocks.POLISHED_CONGLOMERATE.get());
        this.dropSelf(GraviBlocks.POLISHED_CONGLOMERATE_WALLS.get());
        this.dropSelf(GraviBlocks.POLISHED_CONGLOMERATE_STAIRS.get());
        this.dropSelf(GraviBlocks.POLISHED_CONGLOMERATE_SLAB.get());

        this.add(GraviBlocks.AERFIN_LEAVES.get(), (leaves) -> this.droppingWithChancesAndSkyrootSticks(leaves, GraviBlocks.AERFIN_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.add(GraviBlocks.BLUE_AERFIN_LEAVES.get(), (leaves) -> this.droppingWithChancesAndSkyrootSticks(leaves, GraviBlocks.BLUE_AERFIN_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.add(GraviBlocks.GOLDEN_AERFIN_LEAVES.get(), (leaves) -> this.droppingWithChancesAndSkyrootSticks(leaves, GraviBlocks.GOLDEN_AERFIN_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.dropSelf(GraviBlocks.AERFIN_SAPLING.get());
        this.dropSelf(GraviBlocks.BLUE_AERFIN_SAPLING.get());
        this.dropSelf(GraviBlocks.GOLDEN_AERFIN_SAPLING.get());
        this.dropSelf(GraviBlocks.AERFIN_SIGN.get());
        this.dropSelf(GraviBlocks.AERFIN_HANGING_SIGN.get());
        this.dropSelf(GraviBlocks.AERFIN_WALL_HANGING_SIGN.get());
        this.dropSelfDouble(GraviBlocks.AERFIN_LOG.get());
        this.dropSelf(GraviBlocks.AERFIN_WOOD.get());
        this.dropSelf(GraviBlocks.STRIPPED_AERFIN_WOOD.get());
        this.dropSelf(GraviBlocks.STRIPPED_AERFIN_LOG.get());
        this.dropSelf(GraviBlocks.AERFIN_PLANKS.get());
        this.dropSelf(GraviBlocks.AERFIN_DOOR.get());
        this.dropSelf(GraviBlocks.AERFIN_TRAPDOOR.get());
        this.dropSelf(GraviBlocks.AERFIN_FENCE_GATE.get());
        this.dropSelf(GraviBlocks.AERFIN_FENCE.get());
        this.dropSelf(GraviBlocks.AERFIN_SLAB.get());
        this.dropSelf(GraviBlocks.AERFIN_STAIRS.get());
        this.dropSelf(GraviBlocks.AERFIN_BUTTON.get());
        this.dropSelf(GraviBlocks.AERFIN_PREASURE_PLATE.get());

        this.add(GraviBlocks.BELADON_LEAVES.get(), (leaves) -> this.droppingWithChancesAndSkyrootSticks(leaves, GraviBlocks.BELADON_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.dropSelf(GraviBlocks.BELADON_SAPLING.get());
        this.dropSelf(GraviBlocks.BELADON_SIGN.get());
        this.dropSelf(GraviBlocks.BELADON_HANGING_SIGN.get());
        this.dropSelf(GraviBlocks.BELADON_WALL_HANGING_SIGN.get());
        this.dropSelfDouble(GraviBlocks.BELADON_LOG.get());
        this.dropSelf(GraviBlocks.BELADON_WOOD.get());
        this.dropSelf(GraviBlocks.STRIPPED_BELADON_WOOD.get());
        this.dropSelf(GraviBlocks.STRIPPED_BELADON_LOG.get());
        this.dropSelf(GraviBlocks.BELADON_PLANKS.get());
        this.dropSelf(GraviBlocks.BELADON_DOOR.get());
        this.dropSelf(GraviBlocks.BELADON_TRAPDOOR.get());
        this.dropSelf(GraviBlocks.BELADON_FENCE_GATE.get());
        this.dropSelf(GraviBlocks.BELADON_FENCE.get());
        this.dropSelf(GraviBlocks.BELADON_SLAB.get());
        this.dropSelf(GraviBlocks.BELADON_STAIRS.get());
        this.dropSelf(GraviBlocks.BELADON_BUTTON.get());
        this.dropSelf(GraviBlocks.BELADON_PREASURE_PLATE.get());

        this.add(GraviBlocks.ENCHANTED_LEAVES.get(), (leaves) -> this.droppingWithChancesAndSkyrootSticks(leaves, GraviBlocks.ENCHANTED_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.dropSelf(GraviBlocks.ENCHANTED_SAPLING.get());
        this.dropSelf(GraviBlocks.ENCHANTED_SIGN.get());
        this.dropSelf(GraviBlocks.ENCHANTED_HANGING_SIGN.get());
        this.dropSelf(GraviBlocks.ENCHANTED_WALL_HANGING_SIGN.get());
        this.dropSelfDouble(GraviBlocks.ENCHANTED_LOG.get());
        this.dropSelf(GraviBlocks.ENCHANTED_WOOD.get());
        this.dropSelf(GraviBlocks.STRIPPED_ENCHANTED_WOOD.get());
        this.dropSelf(GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
        this.dropSelf(GraviBlocks.ENCHANTED_PLANKS.get());
        this.dropSelf(GraviBlocks.ENCHANTED_DOOR.get());
        this.dropSelf(GraviBlocks.ENCHANTED_TRAPDOOR.get());
        this.dropSelf(GraviBlocks.ENCHANTED_FENCE_GATE.get());
        this.dropSelf(GraviBlocks.ENCHANTED_FENCE.get());
        this.dropSelf(GraviBlocks.ENCHANTED_SLAB.get());
        this.dropSelf(GraviBlocks.ENCHANTED_STAIRS.get());
        this.dropSelf(GraviBlocks.ENCHANTED_BUTTON.get());
        this.dropSelf(GraviBlocks.ENCHANTED_PREASURE_PLATE.get());

        this.dropWithFortune(GraviBlocks.BRONZITE_ICESTONE_ORE.get(), GraviItems.BRONZITE_ROCK.get());
        this.dropWithFortune(GraviBlocks.BRONZITE_ORE.get(), GraviItems.BRONZITE_ROCK.get());
        this.dropSelf(GraviBlocks.BRONZITE_BLOCK.get());
        this.add(GraviBlocks.AERFIN_BOOKSHELF.get(),
                (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
        this.add(GraviBlocks.BELADON_BOOKSHELF.get(),
                (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
        this.add(GraviBlocks.ENCHANTED_BOOKSHELF.get(),
                (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
    }

    @Override
    public @NotNull Iterable<Block> getKnownBlocks() {
        return GraviBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
    }

    public static LootTableProvider create(PackOutput packOutput) {
        return new LootTableProvider(packOutput, new HashSet<>(), List.of(new LootTableProvider.SubProviderEntry(GraviLoot::new, LootContextParamSets.BLOCK)));
    }
}
