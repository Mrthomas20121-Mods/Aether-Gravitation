package mrthomas20121.gravitation;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class GraviTags {

    public static class ItemTags {

        public static TagKey<Item> NEPTUNE_REPAIRING = tag("neptune_repairing");
        public static TagKey<Item> NEPTUNE_ITEMS = tag("neptune_items");

        public static TagKey<Item> VALKYRIE_ITEMS = tag("valkyrie_items");

        private static TagKey<Item> tag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(Gravitation.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation("forge", name));
        }
    }
}
