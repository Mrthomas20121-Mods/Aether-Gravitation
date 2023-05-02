package mrthomas20121.gravitation;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class GraviTags {

    public static class BlockTags {

        public static TagKey<Block> ENCHANTED_LOGS = tag("enchanted_logs");

        private static TagKey<Block> aetherTag(String name) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation("aether", name));
        }

        private static TagKey<Block> tag(String name) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation("gravitation", name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation("forge", name));
        }
    }

    public static class ItemTags {

        public static TagKey<Item> ENCHANTED_LOGS = tag("enchanted_logs");

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
