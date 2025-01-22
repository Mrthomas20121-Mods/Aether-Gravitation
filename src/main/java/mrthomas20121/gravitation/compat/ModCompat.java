package mrthomas20121.gravitation.compat;

import net.minecraftforge.fml.ModList;

import java.util.ArrayList;
import java.util.List;

public class ModCompat {

    private static final List<IModCompat> modCompatList = new ArrayList<>();

    public static void init() {
        if(ModList.get().isLoaded("aether_treasure_reforging")) {
            modCompatList.add(TreasureReforgingCompat.INSTANCE);
        }
    }

    public static List<IModCompat> getModCompatList() {
        return modCompatList;
    }
}
