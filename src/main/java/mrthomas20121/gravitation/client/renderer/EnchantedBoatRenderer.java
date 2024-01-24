package mrthomas20121.gravitation.client.renderer;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.gravitation.Gravitation;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.client.model.ListModel;

import javax.annotation.Nonnull;

public class EnchantedBoatRenderer extends BoatRenderer {
    private static final ResourceLocation ENCHANTED_BOAT = new ResourceLocation(Gravitation.MOD_ID, "textures/entity/miscellaneous/boat/enchanted.png");
    private static final ResourceLocation ENCHANTED_CHEST_BOAT = new ResourceLocation(Gravitation.MOD_ID, "textures/entity/miscellaneous/chest_boat/enchanted.png");
    private final Pair<ResourceLocation, ListModel<Boat>> enchantedBoatResource;

    public EnchantedBoatRenderer(EntityRendererProvider.Context context, boolean chest) {
        super(context, chest);
        this.enchantedBoatResource = Pair.of(chest ? ENCHANTED_CHEST_BOAT : ENCHANTED_BOAT, chest ? new ChestBoatModel(context.bakeLayer(GraviModelLayers.ENCHANTED_CHEST_BOAT)) : new BoatModel(context.bakeLayer(GraviModelLayers.ENCHANTED_BOAT)));
    }

    @Nonnull
    @Override
    public Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(@Nonnull Boat boat) {
        return this.enchantedBoatResource;
    }
}