package mrthomas20121.gravitation.item;

import com.aetherteam.aether.item.accessories.cape.CapeItem;
import mrthomas20121.gravitation.Gravitation;

public class GravitationCapeItem extends CapeItem {

    public GravitationCapeItem(String capeLocation, Properties properties) {
        super(capeLocation, properties);

        this.setRenderTexture(Gravitation.MOD_ID, capeLocation);
    }
}
