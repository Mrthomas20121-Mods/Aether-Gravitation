package mrthomas20121.gravitation.data.loot;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.loot.AetherLoot;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
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

        add("sun_spirit_enchantment", new EnchantmentDungeonLootModifiers(
                new LootItemCondition[] { LootTableIdCondition.builder(AetherLoot.GOLD_DUNGEON_REWARD).build() },
                GravitationEnchantments.SUN_SPIRIT_BLESSING.get()
        ));

        add("stamina_of_mars_enchantment", new EnchantmentDungeonLootModifiers(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(AetherLoot.GOLD_DUNGEON_REWARD).build(),
                        LootTableIdCondition.builder(AetherLoot.SILVER_DUNGEON_REWARD).build() },
                GravitationEnchantments.STAMINA_OF_MARS.get()
        ));
    }
}
