package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.providers.AetherBlockLootSubProvider;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.mixin.mixins.common.accessor.BlockLootAccessor;
import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class GravitationLoot extends AetherBlockLootSubProvider {

    public GravitationLoot() {
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
        this.add(GraviBlocks.GOLDEN_AERFIN_LEAVES.get(), (leaves) -> this.droppingGoldenAerfinLeaves(leaves, GraviBlocks.GOLDEN_AERFIN_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
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

        this.dropPottedContents(GraviBlocks.POTTED_AERFIN_SAPLING.get());
        this.dropPottedContents(GraviBlocks.POTTED_BLUE_AERFIN_SAPLING.get());
        this.dropPottedContents(GraviBlocks.POTTED_GOLDEN_AERFIN_SAPLING.get());
        this.dropPottedContents(GraviBlocks.POTTED_BELADON_SAPLING.get());
        this.dropPottedContents(GraviBlocks.POTTED_ENCHANTED_SAPLING.get());

        this.dropWithFortune(GraviBlocks.BRONZITE_ICESTONE_ORE.get(), GravitationItems.BRONZITE_ROCK.get());
        this.dropWithFortune(GraviBlocks.BRONZITE_ORE.get(), GravitationItems.BRONZITE_ROCK.get());
        this.dropSelf(GraviBlocks.BRONZITE_BLOCK.get());
        this.add(GraviBlocks.AERFIN_BOOKSHELF.get(),
                (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
        this.add(GraviBlocks.BELADON_BOOKSHELF.get(),
                (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
        this.add(GraviBlocks.ENCHANTED_BOOKSHELF.get(),
                (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
    }

    public LootTable.Builder droppingGoldenAerfinLeaves(Block block, Block sapling, float... chances) {
        return this.droppingWithChancesAndSkyrootSticks(block, sapling, chances)
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).when(BlockLootAccessor.aether$hasShearsOrSilkTouch().invert())
                        .add(this.applyExplosionCondition(block,
                                LootItem.lootTableItem(AetherItems.GOLDEN_AMBER.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 1.0F)))
                                        .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, 0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F)))
                        ));
    }

    @Override
    public @NotNull Iterable<Block> getKnownBlocks() {
        return GraviBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
    }

    public static LootTableProvider create(PackOutput packOutput) {
        return new LootTableProvider(packOutput, new HashSet<>(), List.of(new LootTableProvider.SubProviderEntry(GravitationLoot::new, LootContextParamSets.BLOCK)));
    }
}
