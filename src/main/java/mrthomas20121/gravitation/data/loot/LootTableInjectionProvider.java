package mrthomas20121.gravitation.data.loot;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.loot.AetherLoot;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import slimeknights.mantle.loot.AbstractLootTableInjectionProvider;
import slimeknights.mantle.loot.LootTableInjection;

public class LootTableInjectionProvider extends AbstractLootTableInjectionProvider {

    public LootTableInjectionProvider(PackOutput output) {
        super(output, Gravitation.MOD_ID);
    }

    @Override
    protected void addTables() {
        inject("silver_rewards", AetherLoot.SILVER_DUNGEON_REWARD)
                .addToPool("main",
                        LootItem.lootTableItem(GravitationItems.NEPTUNE_BATTLEAXE.get()).setWeight(3).build(),
                        LootItem.lootTableItem(GravitationItems.NEPTUNE_AXE.get()).setWeight(4).build(),
                        LootItem.lootTableItem(GravitationItems.NEPTUNE_CUTLASS.get()).setWeight(3).build(),
                        LootItem.lootTableItem(GravitationItems.NEPTUNE_HOE.get()).setWeight(1).build(),
                        LootItem.lootTableItem(GravitationItems.NEPTUNE_PICKAXE.get()).setWeight(4).build(),
                        LootItem.lootTableItem(GravitationItems.NEPTUNE_SHOVEL.get()).setWeight(4).build(),
                        LootItem.lootTableItem(GravitationItems.NEPTUNE_RING.get()).setWeight(2).build(),
                        LootItem.lootTableItem(GravitationItems.NEPTUNE_PENDANT.get()).setWeight(2).build()
                )
                .addToPool("main",
                        LootItem.lootTableItem(GravitationItems.BRONZITE_UPGRADE.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 1.0F))).setWeight(3).build())
                .addToPool("main",
                        LootItem.lootTableItem(GravitationItems.BRONZITE_INGOT.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 3.0F))).setWeight(4).build());

        inject("bronze_rewards", AetherLoot.BRONZE_DUNGEON_REWARD)
                .addToPool("main",
                        LootItem.lootTableItem(GravitationItems.NEPTUNE_RING.get()).setWeight(3).build(),
                        LootItem.lootTableItem(GravitationItems.NEPTUNE_PENDANT.get()).setWeight(3).build())
                .addToPool("main",
                        LootItem.lootTableItem(GravitationItems.BRONZITE_UPGRADE.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 1.0F))).setWeight(1).build());

        inject("bronze_dungeon", AetherLoot.BRONZE_DUNGEON_LOOT)
                .addToPool("pool1", item(GravitationItems.BRONZITE_ROCK.get(), 3, 0f, 3f));
        inject("silver_dungeon", AetherLoot.SILVER_DUNGEON_LOOT)
                .addToPool("pool1", item(GravitationItems.BRONZITE_INGOT.get(), 3, 0f, 3f));
    }

    @Override
    public String getName() {
        return "Gravitation Loot Table Injections";
    }

    private LootPoolEntryContainer item(ItemLike itemLike, int weight) {
        return LootItem.lootTableItem(itemLike).setWeight(weight).apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 10.0F))).build();
    }

    private LootPoolEntryContainer item(ItemLike itemLike, int weight, UniformGenerator generator) {
        return LootItem.lootTableItem(itemLike).setWeight(weight).apply(SetItemCountFunction.setCount(generator)).build();
    }

    private LootPoolEntryContainer item(ItemLike itemLike, int weight, float min, float max) {
        return item(itemLike, weight, UniformGenerator.between(min, max));
    }
}
