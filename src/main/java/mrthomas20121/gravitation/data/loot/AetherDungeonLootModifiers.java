package mrthomas20121.gravitation.data.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import mrthomas20121.gravitation.util.ItemData;
import net.minecraft.util.random.WeightedEntry;
import net.minecraft.util.random.WeightedRandom;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

/**
 * Loot modifier that accept a list of weighted items, a total weight and the chance of spawning each loot
 */
public class AetherDungeonLootModifiers extends LootModifier {

    public static final Supplier<Codec<AetherDungeonLootModifiers>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst)
            .and(WeightedEntry.Wrapper.codec(ItemData.CODEC).listOf().fieldOf("items").forGetter(m -> m.items))
            .and(Codec.INT.fieldOf("totalWeight").forGetter(m -> m.totalWeight))
            .and(Codec.FLOAT.fieldOf("chanceToSpawn").forGetter(m -> m.chance))
            .apply(inst, AetherDungeonLootModifiers::new)));

    public final List<WeightedEntry.Wrapper<ItemData>> items;
    public final int totalWeight;
    public final float chance;

    public AetherDungeonLootModifiers(final LootItemCondition[] conditionsIn, List<WeightedEntry.Wrapper<ItemData>> items, int totalWeight, float chance) {
        super(conditionsIn);
        this.items = items;
        this.totalWeight = totalWeight;
        this.chance = chance;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {

        ObjectArrayList<ItemStack> list = new ObjectArrayList<>();

        // size of the loots
        int size = generatedLoot.size();

        // is the loot full?
        boolean isFull = size == 27;

        for(int i = 0; i< size; i++) {
            // chest is full => x chance to replace the item by one of my item
            // chest is not full => we don't replace any loot
            if(!isFull) {
                if(context.getRandom().nextFloat() > chance) {
                    WeightedRandom.getRandomItem(context.getRandom(), this.items, totalWeight).ifPresent(e -> {
                        ItemData data = e.getData();
                        list.add(new ItemStack(data.item(), data.count()));
                    });
                }
            }
        }
        list.addAll(list.size()-1, generatedLoot);

        return list;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
