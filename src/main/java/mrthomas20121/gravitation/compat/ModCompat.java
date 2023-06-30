package mrthomas20121.gravitation.compat;

import mrthomas20121.gravitation.compat.deep_aether.DeepAetherCompat;
import mrthomas20121.gravitation.compat.lost_aether_content.LostAetherCompat;
import net.minecraftforge.fml.ModList;

import java.util.ArrayList;
import java.util.List;

public class ModCompat {

    private static List<IModCompat> compats = new ArrayList<>();

    public static List<IModCompat> GetCompatList() {
        return compats;
    }

    public static void register() {
        if(ModList.get().isLoaded("lost_aether_content")) {
            compats.add(new LostAetherCompat());
        }

        if(ModList.get().isLoaded("deep_aether")) {
            compats.add(new DeepAetherCompat());
        }
    }
}
