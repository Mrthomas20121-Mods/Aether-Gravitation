package mrthomas20121.gravitation.data.loot;

import com.mojang.serialization.Codec;
import mrthomas20121.gravitation.Gravitation;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GlobalLootModifiers {

    public static DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Gravitation.MOD_ID);

    public static RegistryObject<Codec<? extends IGlobalLootModifier>> AETHER_DUNGEON_LOOT_CODEC = LOOT_MODIFIERS.register("aether_dungeon_loot", AetherDungeonLootModifiers.CODEC);
}
