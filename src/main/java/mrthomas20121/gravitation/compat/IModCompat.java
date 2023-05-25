package mrthomas20121.gravitation.compat;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class IModCompat {

    protected final DeferredRegister<Item> ITEMS;
    protected final DeferredRegister<Block> BLOCKS;
    private final String modid;

    public IModCompat(String modID) {
        this.modid = modID;

        this.ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, this.modid);
        this.BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, this.modid);
    }

    public void register(IEventBus bus) {
        this.ITEMS.register(bus);
        this.BLOCKS.register(bus);
    }

    public String getModID() {
        return this.modid;
    }
}
