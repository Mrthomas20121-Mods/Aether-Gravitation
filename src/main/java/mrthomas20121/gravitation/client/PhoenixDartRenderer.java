package mrthomas20121.gravitation.client;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.entity.PhoenixDart;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nonnull;

public class PhoenixDartRenderer extends ArrowRenderer<PhoenixDart> {
    public static final ResourceLocation ENCHANTED_DART_TEXTURE = new ResourceLocation(Gravitation.MOD_ID, "textures/entity/projectile/dart/phoenix_dart.png");

    public PhoenixDartRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull PhoenixDart dart) {
        return ENCHANTED_DART_TEXTURE;
    }
}