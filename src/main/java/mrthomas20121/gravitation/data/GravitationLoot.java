package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.providers.AetherBlockLootSubProvider;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.mixin.mixins.common.accessor.BlockLootAccessor;
import mrthomas20121.gravitation.block.GravitationBlocks;
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

        this.dropSelf(GravitationBlocks.AER_GRASS.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_MOSS.get());

        this.dropSelf(GravitationBlocks.CONGLOMERATE.get());
        this.dropSelf(GravitationBlocks.CONGLOMERATE_WALLS.get());
        this.dropSelf(GravitationBlocks.CONGLOMERATE_STAIRS.get());
        this.dropSelf(GravitationBlocks.CONGLOMERATE_SLAB.get());

        this.dropSelf(GravitationBlocks.CONGLOMERATE_BRICKS.get());
        this.dropSelf(GravitationBlocks.CONGLOMERATE_BRICK_WALLS.get());
        this.dropSelf(GravitationBlocks.CONGLOMERATE_BRICK_STAIRS.get());
        this.dropSelf(GravitationBlocks.CONGLOMERATE_BRICK_SLAB.get());

        this.dropSelf(GravitationBlocks.POLISHED_CONGLOMERATE.get());
        this.dropSelf(GravitationBlocks.POLISHED_CONGLOMERATE_WALLS.get());
        this.dropSelf(GravitationBlocks.POLISHED_CONGLOMERATE_STAIRS.get());
        this.dropSelf(GravitationBlocks.POLISHED_CONGLOMERATE_SLAB.get());

        this.add(GravitationBlocks.AERFIN_LEAVES.get(), (leaves) -> this.droppingWithChancesAndSkyrootSticks(leaves, GravitationBlocks.AERFIN_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.add(GravitationBlocks.BLUE_AERFIN_LEAVES.get(), (leaves) -> this.droppingWithChancesAndSkyrootSticks(leaves, GravitationBlocks.BLUE_AERFIN_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.add(GravitationBlocks.GOLDEN_AERFIN_LEAVES.get(), (leaves) -> this.droppingGoldenAerfinLeaves(leaves, GravitationBlocks.GOLDEN_AERFIN_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.dropSelf(GravitationBlocks.AERFIN_SAPLING.get());
        this.dropSelf(GravitationBlocks.BLUE_AERFIN_SAPLING.get());
        this.dropSelf(GravitationBlocks.GOLDEN_AERFIN_SAPLING.get());
        this.dropSelf(GravitationBlocks.AERFIN_SIGN.get());
        this.dropSelf(GravitationBlocks.AERFIN_HANGING_SIGN.get());
        this.dropSelf(GravitationBlocks.AERFIN_WALL_HANGING_SIGN.get());
        this.dropSelfDouble(GravitationBlocks.AERFIN_LOG.get());
        this.dropSelf(GravitationBlocks.AERFIN_WOOD.get());
        this.dropSelf(GravitationBlocks.STRIPPED_AERFIN_WOOD.get());
        this.dropSelf(GravitationBlocks.STRIPPED_AERFIN_LOG.get());
        this.dropSelf(GravitationBlocks.AERFIN_PLANKS.get());
        this.dropSelf(GravitationBlocks.AERFIN_DOOR.get());
        this.dropSelf(GravitationBlocks.AERFIN_TRAPDOOR.get());
        this.dropSelf(GravitationBlocks.AERFIN_FENCE_GATE.get());
        this.dropSelf(GravitationBlocks.AERFIN_FENCE.get());
        this.dropSelf(GravitationBlocks.AERFIN_SLAB.get());
        this.dropSelf(GravitationBlocks.AERFIN_STAIRS.get());
        this.dropSelf(GravitationBlocks.AERFIN_BUTTON.get());
        this.dropSelf(GravitationBlocks.AERFIN_PREASURE_PLATE.get());

        this.add(GravitationBlocks.BELADON_LEAVES.get(), (leaves) -> this.droppingWithChancesAndSkyrootSticks(leaves, GravitationBlocks.BELADON_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.dropSelf(GravitationBlocks.BELADON_SAPLING.get());
        this.dropSelf(GravitationBlocks.BELADON_SIGN.get());
        this.dropSelf(GravitationBlocks.BELADON_HANGING_SIGN.get());
        this.dropSelf(GravitationBlocks.BELADON_WALL_HANGING_SIGN.get());
        this.dropSelfDouble(GravitationBlocks.BELADON_LOG.get());
        this.dropSelf(GravitationBlocks.BELADON_WOOD.get());
        this.dropSelf(GravitationBlocks.STRIPPED_BELADON_WOOD.get());
        this.dropSelf(GravitationBlocks.STRIPPED_BELADON_LOG.get());
        this.dropSelf(GravitationBlocks.BELADON_PLANKS.get());
        this.dropSelf(GravitationBlocks.BELADON_DOOR.get());
        this.dropSelf(GravitationBlocks.BELADON_TRAPDOOR.get());
        this.dropSelf(GravitationBlocks.BELADON_FENCE_GATE.get());
        this.dropSelf(GravitationBlocks.BELADON_FENCE.get());
        this.dropSelf(GravitationBlocks.BELADON_SLAB.get());
        this.dropSelf(GravitationBlocks.BELADON_STAIRS.get());
        this.dropSelf(GravitationBlocks.BELADON_BUTTON.get());
        this.dropSelf(GravitationBlocks.BELADON_PREASURE_PLATE.get());

        this.add(GravitationBlocks.ENCHANTED_LEAVES.get(), (leaves) -> this.droppingWithChancesAndSkyrootSticks(leaves, GravitationBlocks.ENCHANTED_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.dropSelf(GravitationBlocks.ENCHANTED_SAPLING.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_SIGN.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_HANGING_SIGN.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_WALL_HANGING_SIGN.get());
        this.dropSelfDouble(GravitationBlocks.ENCHANTED_LOG.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_WOOD.get());
        this.dropSelf(GravitationBlocks.STRIPPED_ENCHANTED_WOOD.get());
        this.dropSelf(GravitationBlocks.STRIPPED_ENCHANTED_LOG.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_PLANKS.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_DOOR.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_TRAPDOOR.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_FENCE_GATE.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_FENCE.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_SLAB.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_STAIRS.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_BUTTON.get());
        this.dropSelf(GravitationBlocks.ENCHANTED_PREASURE_PLATE.get());

        this.dropPottedContents(GravitationBlocks.POTTED_AERFIN_SAPLING.get());
        this.dropPottedContents(GravitationBlocks.POTTED_BLUE_AERFIN_SAPLING.get());
        this.dropPottedContents(GravitationBlocks.POTTED_GOLDEN_AERFIN_SAPLING.get());
        this.dropPottedContents(GravitationBlocks.POTTED_BELADON_SAPLING.get());
        this.dropPottedContents(GravitationBlocks.POTTED_ENCHANTED_SAPLING.get());

        this.dropWithFortune(GravitationBlocks.BRONZITE_ICESTONE_ORE.get(), GravitationItems.BRONZITE_ROCK.get());
        this.dropWithFortune(GravitationBlocks.BRONZITE_ORE.get(), GravitationItems.BRONZITE_ROCK.get());
        this.dropSelf(GravitationBlocks.BRONZITE_BLOCK.get());
        this.add(GravitationBlocks.AERFIN_BOOKSHELF.get(),
                (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
        this.add(GravitationBlocks.BELADON_BOOKSHELF.get(),
                (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
        this.add(GravitationBlocks.ENCHANTED_BOOKSHELF.get(),
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
        return GravitationBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
    }

    public static LootTableProvider create(PackOutput packOutput) {
        return new LootTableProvider(packOutput, new HashSet<>(), List.of(new LootTableProvider.SubProviderEntry(GravitationLoot::new, LootContextParamSets.BLOCK)));
    }
}
