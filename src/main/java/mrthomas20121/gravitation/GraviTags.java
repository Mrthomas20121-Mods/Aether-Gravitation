package mrthomas20121.gravitation;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class GraviTags {

    public static class Entities {

        public static TagKey<EntityType<?>> IS_AFFECTED_BY_NEPTUNE_WRATH = tag("is_affected_by_neptune_wrath");

        private static TagKey<EntityType<?>> tag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("gravitation", name));
        }
        private static TagKey<EntityType<?>> forgeTag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {

        public static TagKey<Block> ENCHANTED_LOGS = tag("enchanted_logs");

        public static TagKey<Block> BRONZITE_STORAGE = forgeTag("storage_blocks/bronzite");

        public static TagKey<Block> BRONZITE_ORE = forgeTag("ores/bronzite");

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

    public static class Items {

        public static TagKey<Item> ENCHANTED_LOGS = tag("enchanted_logs");

        public static TagKey<Item> BATTLEAXES = forgeTag("battleaxes");

        public static TagKey<Item> BRONZITE_REPAIRING = tag("bronzite_repairing");

        public static TagKey<Item> INGOT_BRONZITE = forgeTag("ingots/bronzite");

        public static TagKey<Item> NUGGET_BRONZITE = forgeTag("nuggest/bronzite");

        public static TagKey<Item> BRONZITE_ORE = forgeTag("ores/bronzite");

        private static TagKey<Item> tag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(Gravitation.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation("forge", name));
        }
    }
}
