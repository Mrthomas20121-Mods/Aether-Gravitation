package mrthomas20121.gravitation.client;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.gravitation.Gravitation;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;

import javax.annotation.Nonnull;

public class AerfinBoatRenderer extends BoatRenderer {
    private static final ResourceLocation AERFIN_BOAT = new ResourceLocation(Gravitation.MOD_ID, "textures/entity/miscellaneous/boat/aerfin.png");
    private static final ResourceLocation AERFIN_CHEST_BOAT = new ResourceLocation(Gravitation.MOD_ID, "textures/entity/miscellaneous/chest_boat/aerfin.png");
    private final Pair<ResourceLocation, ListModel<Boat>> aerfinBoatResource;

    public AerfinBoatRenderer(EntityRendererProvider.Context context, boolean chest) {
        super(context, chest);
        this.aerfinBoatResource = Pair.of(chest ? AERFIN_CHEST_BOAT : AERFIN_BOAT, chest ? new ChestBoatModel(context.bakeLayer(GraviModelLayers.AERFIN_CHEST_BOAT)) : new BoatModel(context.bakeLayer(GraviModelLayers.AERFIN_BOAT)));
    }

    @Nonnull
    @Override
    public Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(@Nonnull Boat boat) {
        return this.aerfinBoatResource;
    }
}