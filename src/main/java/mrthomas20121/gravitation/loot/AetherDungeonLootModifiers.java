package mrthomas20121.gravitation.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.WeightedEntry;
import net.minecraft.util.random.WeightedRandom;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public class AetherDungeonLootModifiers extends LootModifier {

    public static final Supplier<Codec<AetherDungeonLootModifiers>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst)
            .and(ItemStack.CODEC.listOf().fieldOf("items").forGetter(m -> m.items))
            .apply(inst, AetherDungeonLootModifiers::new)));

    public final List<ItemStack> items;
    public final List<WeightedEntry.Wrapper<ItemStack>> itemStackList = new ObjectArrayList<>();

    public AetherDungeonLootModifiers(final LootItemCondition[] conditionsIn, List<ItemStack> items) {
        super(conditionsIn);
        this.items = items;

        for(ItemStack stack: items) {
            itemStackList.add(WeightedEntry.wrap(stack, 1));
        }
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {

        ObjectArrayList<ItemStack> list = new ObjectArrayList<>();
        int size = generatedLoot.size();
        boolean isFull = size == 27;

        if(context.getRandom().nextFloat() >= 0.5f) {
            WeightedRandom.getRandomItem(context.getRandom(), this.itemStackList, items.size()).ifPresent(e -> list.add(e.getData()));
        }
        for(ItemStack stack: generatedLoot) {
            if(isFull && context.getRandom().nextFloat() > 0.2f) {
                WeightedRandom.getRandomItem(context.getRandom(), this.itemStackList, items.size()).ifPresent(e -> list.add(e.getData()));
            }
            else {
                list.add(stack);
            }
        }

        return list;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
