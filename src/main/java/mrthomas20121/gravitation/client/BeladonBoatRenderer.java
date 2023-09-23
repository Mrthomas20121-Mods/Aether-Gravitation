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

public class BeladonBoatRenderer extends BoatRenderer {
    private static final ResourceLocation BELADON_BOAT = new ResourceLocation(Gravitation.MOD_ID, "textures/entity/miscellaneous/boat/beladon.png");
    private static final ResourceLocation BELADON_CHEST_BOAT = new ResourceLocation(Gravitation.MOD_ID, "textures/entity/miscellaneous/chest_boat/beladon.png");
    private final Pair<ResourceLocation, ListModel<Boat>> beladonBoatResource;

    public BeladonBoatRenderer(EntityRendererProvider.Context context, boolean chest) {
        super(context, chest);
        this.beladonBoatResource = Pair.of(chest ? BELADON_CHEST_BOAT : BELADON_BOAT, chest ? new ChestBoatModel(context.bakeLayer(GraviModelLayers.BELADON_CHEST_BOAT)) : new BoatModel(context.bakeLayer(GraviModelLayers.BELADON_BOAT)));
    }

    @Nonnull
    @Override
    public Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(@Nonnull Boat boat) {
        return this.beladonBoatResource;
    }
}