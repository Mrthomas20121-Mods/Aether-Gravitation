package mrthomas20121.gravitation.compat.deep_aether;

import mrthomas20121.gravitation.compat.IModCompat;

public class DeepAetherCompat extends IModCompat {

    public DeepAetherCompat(String modID) {
        super(modID);
        ITEMS.register("skyjade_axe", SkyjadeBattleaxeItem::new);
    }
}
