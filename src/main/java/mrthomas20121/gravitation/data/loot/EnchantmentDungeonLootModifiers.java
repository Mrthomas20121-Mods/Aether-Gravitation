package mrthomas20121.gravitation.data.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

/**
 * Loot modifier that accept a list of weighted items, a total weight and the chance of spawning each loot
 */
public class EnchantmentDungeonLootModifiers extends LootModifier {

    public static final Supplier<Codec<EnchantmentDungeonLootModifiers>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst)
            .and(ForgeRegistries.ENCHANTMENTS.getCodec().fieldOf("enchantment").forGetter(ed -> ed.enchantment))
            .apply(inst, EnchantmentDungeonLootModifiers::new)));

    public final Enchantment enchantment;

    public EnchantmentDungeonLootModifiers(final LootItemCondition[] conditionsIn, Enchantment enchantment) {
        super(conditionsIn);
        this.enchantment = enchantment;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {

        ObjectArrayList<ItemStack> list = new ObjectArrayList<>();
        RandomSource source = context.getRandom();

        for (ItemStack loot : generatedLoot) {

            if (loot.is(Tags.Items.ARMORS) && source.nextFloat() > 0.2f) {
                loot.enchant(this.enchantment, source.nextInt(1, this.enchantment.getMaxLevel()));
            }

            list.add(loot);
        }

        // 27 is the max number of slots in a treasure chest
        if(source.nextFloat() > 0.2f && list.size() < 27) {
            list.add(EnchantedBookItem.createForEnchantment(new EnchantmentInstance(this.enchantment, source.nextInt(1, this.enchantment.getMaxLevel()))));
        }

        return list;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
