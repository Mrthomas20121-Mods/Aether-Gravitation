package mrthomas20121.gravitation.data.loot;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.item.GravitationItems;
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

        add("bronze_dungeon_reward", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/bronze/bronze_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_AXE.get()), 10),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_BATTLEAXE.get()), 10),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_CUTLASS.get()), 10),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_PICKAXE.get()), 10),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_SHOVEL.get()), 10),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_RING.get()), 10),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_PENDANT.get()), 10),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.DIG_STONE.get()), 80)
                ),
                200,
                0.5f
        ));

        add("bronze_dungeon_loot", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/bronze/bronze_dungeon")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(GravitationItems.AECHOR_STRING.get()), 60),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.BRONZITE_ROCK.get()), 40)
                ),
                100,
                0.1f
        ));

        add("silver_dungeon_loot", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/silver/silver_dungeon")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(GravitationItems.BRONZITE_UPGRADE.get()), 40),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.BRONZITE_ROCK.get()), 40),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.AECHOR_STRING.get()), 20)
                ),
                100,
                0.2f
        ));

        add("silver_dungeon_reward", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/silver/silver_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_AXE.get()), 30),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_BATTLEAXE.get()), 30),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_CUTLASS.get()), 30),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_PICKAXE.get()), 30),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_SHOVEL.get()), 30),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_RING.get()), 10),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.NEPTUNE_PENDANT.get()), 10),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.VALKYRIE_BATTLEAXE.get()), 50),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.GREATER_HEALING_STONE.get()), 40),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.DENSE_STONE.get()), 40)
                ),
                360,
                0.7f
        ));

        add("gold_loot", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/gold/gold_dungeon_reward")).build() },
                List.of(
                        WeightedEntry.wrap(new ItemStack(GravitationItems.POWER_STONE.get()), 50),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.DENSE_STONE.get(), 2), 30),
                        WeightedEntry.wrap(new ItemStack(GravitationItems.RAINBOW_STONE.get(), 1), 20)
                ),
                10,
                0.8f
        ));
    }
}
