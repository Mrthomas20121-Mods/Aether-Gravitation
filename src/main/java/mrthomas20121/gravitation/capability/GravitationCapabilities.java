package mrthomas20121.gravitation.capability;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.capability.arrow.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GravitationCapabilities {

    public static final Capability<FlamingArrow> FLAMING_ARROW_CAPABILITY = CapabilityManager.get(new CapabilityToken<>() { });
    public static final Capability<ThunderArrow> THUNDER_ARROW_CAPABILITY = CapabilityManager.get(new CapabilityToken<>() { });
    public static final Capability<HolyArrow> HOLY_ARROW_CAPABILITY = CapabilityManager.get(new CapabilityToken<>() { });
    public static final Capability<VampireArrow> VAMPIRE_ARROW_CAPABILITY = CapabilityManager.get(new CapabilityToken<>() { });

    @SubscribeEvent
    public static void register(RegisterCapabilitiesEvent event) {
        event.register(FlamingArrow.class);
        event.register(HolyArrow.class);
        event.register(ThunderArrow.class);
        event.register(VampireArrow.class);
    }

    @Mod.EventBusSubscriber(modid = Gravitation.MOD_ID)
    public static class Registration {
        @SubscribeEvent
        public static void attachEntityCapabilities(AttachCapabilitiesEvent<Entity> event) {
            if (event.getObject() instanceof AbstractArrow abstractArrow) {
                event.addCapability(new ResourceLocation(Gravitation.MOD_ID, "flaming_arrow"), new FlamingArrowProvider(new FlamingArrowCapability(abstractArrow)));
                event.addCapability(new ResourceLocation(Gravitation.MOD_ID, "thunder_arrow"), new ThunderArrowProvider(new ThunderArrowCapability(abstractArrow)));
            }
        }
    }
}
