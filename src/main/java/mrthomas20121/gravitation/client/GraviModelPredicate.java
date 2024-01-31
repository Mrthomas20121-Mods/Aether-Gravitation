package mrthomas20121.gravitation.client;

import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class GraviModelPredicate {

    public static void init()
    {
        createActivePredicate(GravitationItems.BRONZITE_SHIELD.get(), "blocking");
    }

    /**
     * Activates when the mainhand is active (EX: blocking with a shield, eating a
     * food item)
     */
    private static void createActivePredicate(Item item, String predicateName)
    {
        ItemProperties.register(item, new ResourceLocation(predicateName), (stack, world, entity, value) -> (entity != null && entity.isUsingItem() && entity.getUseItem() == stack) ? 1.0F : 0.0F);
    }

}
