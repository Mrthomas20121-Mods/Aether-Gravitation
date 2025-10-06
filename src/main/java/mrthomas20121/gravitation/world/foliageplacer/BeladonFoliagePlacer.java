package mrthomas20121.gravitation.world.foliageplacer;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import org.jetbrains.annotations.NotNull;

public class BeladonFoliagePlacer extends FoliagePlacer {

    public static final Codec<BeladonFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) -> foliagePlacerParts(instance)
            .and(IntProvider.codec(0, 16).fieldOf("trunk_height").forGetter((placer) -> placer.trunkHeight))
            .apply(instance, BeladonFoliagePlacer::new));
    private final IntProvider trunkHeight;

    public BeladonFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider height) {
        super(radius, offset);
        this.trunkHeight = height;
    }

    @Override
    protected @NotNull FoliagePlacerType<BeladonFoliagePlacer> type() {
        return GravitationFoliagePlacerType.BELADON_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader level, FoliageSetter foliageSetter, RandomSource random, TreeConfiguration config, int maxFreeTreeHeight, FoliageAttachment attachment, int foliageHeight, int foliageRadius, int offset) {
        boolean flag = attachment.doubleTrunk();
        BlockPos blockPos = attachment.pos().above(2);

        this.placeLeavesRow(level, foliageSetter, random, config, blockPos, foliageRadius, 1 - foliageHeight, flag);
        this.placeLeavesRow(level, foliageSetter, random, config, blockPos, foliageRadius - 1, 2 - foliageHeight, flag);
        this.placeLeavesRow(level, foliageSetter, random, config, blockPos, foliageRadius - 2, 3 - foliageHeight, flag);
        this.placeLeavesRow(level, foliageSetter, random, config, blockPos, foliageRadius - 1, -foliageHeight, flag);
        this.placeLeavesRow(level, foliageSetter, random, config, blockPos, foliageRadius, -(foliageHeight+1), flag);
        this.placeLeavesRow(level, foliageSetter, random, config, blockPos, foliageRadius - 1, -(foliageHeight+2), flag);
        this.placeLeavesRow(level, foliageSetter, random, config, blockPos, foliageRadius, -(foliageHeight+3), flag);

    }

    public static boolean isOdd(int i) {
        return (i & 1) != 0;
    }

    @Override
    public int foliageHeight(RandomSource random, int height, TreeConfiguration config) {
        return Math.max(4, height - this.trunkHeight.sample(random));
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource random, int localX, int localY, int localZ, int range, boolean large) {
        return localX == range && localZ == range && range > 0;
    }
}
