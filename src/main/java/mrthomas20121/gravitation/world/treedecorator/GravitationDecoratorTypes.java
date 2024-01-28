package mrthomas20121.gravitation.world.treedecorator;

import mrthomas20121.gravitation.Gravitation;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GravitationDecoratorTypes {

    public static DeferredRegister<TreeDecoratorType<?>> TREE_DECORATORS = DeferredRegister.create(ForgeRegistries.TREE_DECORATOR_TYPES, Gravitation.MOD_ID);

    public static RegistryObject<TreeDecoratorType<GraviAlterGroundDecorator>> ALTER_GROUND_DECO = TREE_DECORATORS.register("alter_ground_deco", () -> new TreeDecoratorType<>(GraviAlterGroundDecorator.CODEC));
}
