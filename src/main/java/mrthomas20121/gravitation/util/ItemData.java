package mrthomas20121.gravitation.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

/**
 * An alternative to {@link net.minecraft.world.item.ItemStack} to use in loot modifiers
 * @param item
 * @param count
 */
public record ItemData(Item item, int count) {

    public static Codec<ItemData> CODEC = RecordCodecBuilder.create((itemDataInstance) -> itemDataInstance.group(BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(ItemData::item), Codec.INT.fieldOf("count").forGetter(ItemData::count)).apply(itemDataInstance, ItemData::new));

    public static ItemData of(Item item) {
        return new ItemData(item, 1);
    }

    public static ItemData of(Item item, int count) {
        return new ItemData(item, count);
    }
}
