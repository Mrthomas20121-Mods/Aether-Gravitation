package mrthomas20121.gravitation.data.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
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

public class AetherDungeonLootModifiers extends LootModifier {

    public static final Supplier<Codec<AetherDungeonLootModifiers>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst)
            .and(WeightedEntry.Wrapper.codec(ItemStack.CODEC).listOf().fieldOf("items").forGetter(m -> m.items))
            .apply(inst, AetherDungeonLootModifiers::new)));

    public final List<WeightedEntry.Wrapper<ItemStack>> items;

    public AetherDungeonLootModifiers(final LootItemCondition[] conditionsIn, List<WeightedEntry.Wrapper<ItemStack>> items) {
        super(conditionsIn);
        this.items = items;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {

        ObjectArrayList<ItemStack> list = new ObjectArrayList<>();
        int size = generatedLoot.size();
        boolean isFull = size == 27;
        int sizeDiff = 27-size;

        for(ItemStack stack: generatedLoot) {
            // check if the chest is full, if it is replace the item by one of my item
            if(isFull) {
                if(context.getRandom().nextFloat() > 0.8f) {
                    WeightedRandom.getRandomItem(context.getRandom(), this.items, 100).ifPresent(e -> list.add(e.getData()));
                }
            }
            else {
                // add the existing loot to our new list
                list.add(stack);
            }
        }

        if(!isFull) {
            for(int i = 0; i<= sizeDiff; i++) {
                // 20% chance to add one of our item
                if(context.getRandom().nextFloat() > 0.8f) {
                    WeightedRandom.getRandomItem(context.getRandom(), this.items, 100).ifPresent(e -> list.add(e.getData()));
                }
            }
        }

        return list;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
