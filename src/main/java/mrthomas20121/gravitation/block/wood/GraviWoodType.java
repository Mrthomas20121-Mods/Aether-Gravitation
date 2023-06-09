package mrthomas20121.gravitation.block.wood;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GraviWoodType {

    public static final BlockSetType ENCHANTED_BLOCK_SET = new BlockSetType("gravitation:enchanted");

    public static final WoodType ENCHANTED;

    public GraviWoodType() {
    }

    static {
        ENCHANTED = new WoodType("gravitation:enchanted", ENCHANTED_BLOCK_SET);
    }

    public static void registerWoodTypes() {
        WoodType.register(ENCHANTED);
    }
}
