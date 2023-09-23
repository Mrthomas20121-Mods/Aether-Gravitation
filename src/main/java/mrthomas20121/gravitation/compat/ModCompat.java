package mrthomas20121.gravitation.compat;

import mrthomas20121.gravitation.compat.deep_aether.DeepAetherCompat;
import mrthomas20121.gravitation.compat.lost_aether_content.LostAetherCompat;
import net.minecraftforge.fml.ModList;

import java.util.ArrayList;
import java.util.List;

public class ModCompat {

    private static final List<IModCompat> compatList = new ArrayList<>();

    public static List<IModCompat> getCompatList() {
        return compatList;
    }

    public static void register() {
        if(ModList.get().isLoaded("lost_aether_content")) {
            compatList.add(new LostAetherCompat());
        }

        if(ModList.get().isLoaded("deep_aether")) {
            compatList.add(new DeepAetherCompat());
        }
    }
}
