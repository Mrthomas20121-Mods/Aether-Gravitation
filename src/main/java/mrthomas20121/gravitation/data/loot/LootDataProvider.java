package mrthomas20121.gravitation.data.loot;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
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

        add("silver_loot", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/silver/silver_dungeon_reward")).build() },
                List.of(
                        new ItemStack(GraviItems.NEPTUNE_AXE.get()),
                        new ItemStack(GraviItems.NEPTUNE_BATTLEAXE.get()),
                        new ItemStack(GraviItems.NEPTUNE_CUTLASS.get()),
                        new ItemStack(GraviItems.NEPTUNE_PICKAXE.get()),
                        new ItemStack(GraviItems.NEPTUNE_SHOVEL.get()),
                        new ItemStack(GraviItems.NEPTUNE_RING.get()),
                        new ItemStack(GraviItems.NEPTUNE_PENDANT.get()),
                        new ItemStack(GraviItems.VALKYRIE_BATTLEAXE.get())
                )
        ));

        add("gold_loot", new AetherDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(new ResourceLocation("aether:chests/dungeon/gold/gold_dungeon_reward")).build() },
                List.of(
                        new ItemStack(GraviItems.PHOENIX_DART_SHOOTER.get()),
                        new ItemStack(GraviItems.PHOENIX_DART.get(), 15)
                )
        ));
    }
}
