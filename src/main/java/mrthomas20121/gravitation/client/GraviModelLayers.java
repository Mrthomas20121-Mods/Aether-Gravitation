package mrthomas20121.gravitation.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class GraviModelLayers {

    public static final ModelLayerLocation AERFIN_CHEST_BOAT = register("aerfin_chest_boat");
    public static final ModelLayerLocation AERFIN_BOAT = register("aerfin_boat");

    public static final ModelLayerLocation BELADON_CHEST_BOAT = register("beladon_chest_boat");

    public static final ModelLayerLocation BELADON_BOAT = register("beladon_boat");

    public static final ModelLayerLocation ENCHANTED_CHEST_BOAT = register("enchanted_chest_boat");
    public static final ModelLayerLocation ENCHANTED_BOAT = register("enchanted_boat");

    private static ModelLayerLocation register(String name) {
        return register(name, "main");
    }

    private static ModelLayerLocation register(String name, String type) {
        return register(new ResourceLocation("gravitation", name), type);
    }

    private static ModelLayerLocation register(ResourceLocation identifier, String type) {
        return new ModelLayerLocation(identifier, type);
    }
}
