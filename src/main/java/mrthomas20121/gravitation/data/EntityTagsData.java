package mrthomas20121.gravitation.data;

import com.aetherteam.aether.entity.AetherEntityTypes;
import mrthomas20121.gravitation.GraviTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeEntityTypeTagsProvider;

import java.util.concurrent.CompletableFuture;

public class EntityTagsData extends ForgeEntityTypeTagsProvider {

    public EntityTagsData(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, existingFileHelper);
    }

    @Override
    public void addTags(HolderLookup.Provider lookupProvider) {

        this.tag(GraviTags.Entities.IS_AFFECTED_BY_NEPTUNE_WRATH).add(EntityType.DROWNED, EntityType.GUARDIAN, EntityType.ELDER_GUARDIAN);
        this.tag(GraviTags.Entities.IS_AFFECTED_BY_HERCULE_STRENGTH).add(AetherEntityTypes.VALKYRIE_QUEEN.get(), AetherEntityTypes.SLIDER.get());
    }
}
