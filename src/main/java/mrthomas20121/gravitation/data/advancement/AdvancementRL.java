package mrthomas20121.gravitation.data.advancement;

import mrthomas20121.gravitation.Gravitation;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class AdvancementRL extends ResourceLocation  {

    private final Component advName;
    private final Component desc;

    public AdvancementRL(String name) {
        super(Gravitation.MOD_ID, name);

        this.advName = Component.translatable("advancement.gravitation."+ name);
        this.desc = Component.translatable("advancement.gravitation."+ name + ".desc");
    }

    public AdvancementRL(String namespace, String path) {
        super(namespace, path);
        this.advName = Component.translatable("advancement."+ namespace +"."+ path);
        this.desc = Component.translatable("advancement."+ namespace +"."+ path + ".desc");
    }

    public Component getAdvName() {
        return advName;
    }

    public Component getDesc() {
        return desc;
    }

    public String getNameKey() {
        return "advancement."+this.getNamespace()+"."+this.getPath();
    }

    public String getDescKey() {
        return "advancement."+this.getNamespace()+"."+this.getPath() + ".desc";
    }
}
