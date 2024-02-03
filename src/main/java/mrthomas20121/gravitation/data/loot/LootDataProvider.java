package mrthomas20121.gravitation.data.loot;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.item.GravitationItems;
import mrthomas20121.gravitation.util.ItemData;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.WeightedEntry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
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

        add("bronze_dungeon_reward", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/bronze/bronze_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_AXE.get()), 10),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_BATTLEAXE.get()), 10),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_CUTLASS.get()), 10),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_PICKAXE.get()), 10),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_SHOVEL.get()), 10),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_RING.get()), 10),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_PENDANT.get()), 10),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.DIG_STONE.get()), 80)
                ),
                200,
                0.5f
        ));

        add("bronze_dungeon_loot", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/bronze/bronze_dungeon")).build() },
                List.of(
                        WeightedEntry.wrap(ItemData.of(GravitationItems.BRONZITE_ROCK.get()), 100)
                ),
                100,
                0.5f
        ));

        add("silver_dungeon_loot", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/silver/silver_dungeon")).build() },
                List.of(
                        WeightedEntry.wrap(ItemData.of(GravitationItems.BRONZITE_UPGRADE.get()), 50),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.BRONZITE_ROCK.get()), 5)
                ),
                100,
                0.5f
        ));

        add("silver_dungeon_reward", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/silver/silver_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_AXE.get()), 50),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_BATTLEAXE.get()), 50),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_CUTLASS.get()), 50),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_PICKAXE.get()), 50),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_SHOVEL.get()), 50),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_RING.get()), 10),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.NEPTUNE_PENDANT.get()), 10),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.VALKYRIE_BATTLEAXE.get()), 50),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.GREATER_HEALING_STONE.get()), 40),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.DENSE_STONE.get()), 40)
                ),
                500,
                0.5f
        ));

        add("gold_loot", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/gold/gold_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(ItemData.of(GravitationItems.POWER_STONE.get()), 200),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.DENSE_STONE.get(), 2), 200),
                        WeightedEntry.wrap(ItemData.of(GravitationItems.RAINBOW_STONE.get(), 1), 200)
                ),
                600,
                0.5f
        ));
    }
}
