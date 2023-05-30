package mrthomas20121.gravitation.data.loot;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.WeightedEntry;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

import java.util.List;

public class LootDataProvider extends GlobalLootModifierProvider {

    public LootDataProvider(PackOutput output)
    {
        super(output, Gravitation.MOD_ID);
    }

    @Override
    protected void start() {

        add("bronze_loot", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/bronze/bronze_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(GraviItems.DIG_STONE.get(), 2), 30),
                        WeightedEntry.wrap(new ItemStack(GraviItems.DIG_STONE.get()), 70)
                ),
                100,
                0.6f
        ));

        add("silver_loot", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/silver/silver_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(GraviItems.NEPTUNE_AXE.get()), 30),
                        WeightedEntry.wrap(new ItemStack(GraviItems.NEPTUNE_BATTLEAXE.get()), 30),
                        WeightedEntry.wrap(new ItemStack(GraviItems.NEPTUNE_CUTLASS.get()), 30),
                        WeightedEntry.wrap(new ItemStack(GraviItems.NEPTUNE_PICKAXE.get()), 30),
                        WeightedEntry.wrap(new ItemStack(GraviItems.NEPTUNE_SHOVEL.get()), 30),
                        WeightedEntry.wrap(new ItemStack(GraviItems.NEPTUNE_RING.get()), 10),
                        WeightedEntry.wrap(new ItemStack(GraviItems.NEPTUNE_PENDANT.get()), 10),
                        WeightedEntry.wrap(new ItemStack(GraviItems.VALKYRIE_BATTLEAXE.get()), 50),
                        WeightedEntry.wrap(new ItemStack(GraviItems.GREATER_HEALING_STONE.get()), 40),
                        WeightedEntry.wrap(new ItemStack(GraviItems.DENSE_STONE.get(), 2), 40),
                        WeightedEntry.wrap(new ItemStack(GraviItems.DENSE_STONE.get()), 40),
                        WeightedEntry.wrap(new ItemStack(GraviItems.LIGHTNING_CROSSBOW.get(), 1), 20)
                ),
                360,
                0.7f
        ));

        add("gold_loot", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/gold/gold_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(GraviItems.POWER_STONE.get()), 40),
                        WeightedEntry.wrap(new ItemStack(GraviItems.DENSE_STONE.get(), 2), 30),
                        WeightedEntry.wrap(new ItemStack(GraviItems.RAINBOW_STONE.get(), 1), 10),
                        WeightedEntry.wrap(new ItemStack(GraviItems.HOLY_CROSSBOW.get(), 1), 30),
                        WeightedEntry.wrap(new ItemStack(GraviItems.VAMPIRE_CROSSBOW.get(), 1), 30),
                        WeightedEntry.wrap(new ItemStack(GraviItems.LIGHTNING_CROSSBOW.get(), 1), 30),
                        WeightedEntry.wrap(new ItemStack(GraviItems.FLAMING_CROSSBOW.get(), 1), 30)
                ),
                200,
                0.8f
        ));
    }
}
