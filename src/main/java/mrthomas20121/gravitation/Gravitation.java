package mrthomas20121.gravitation;

import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Gravitation.MOD_ID)
public class Gravitation {

	public static final String MOD_ID = "gravitation";
	public static final Logger LOGGER = LogManager.getLogger();

	public Gravitation() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		GraviEntityTypes.ENTITY_TYPES.register(bus);
		GraviItems.ITEMS.register(bus);
	}
}
