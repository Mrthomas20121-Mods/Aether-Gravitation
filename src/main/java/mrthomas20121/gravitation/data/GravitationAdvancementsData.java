package mrthomas20121.gravitation.data;

import com.aetherteam.aether.Aether;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class GravitationAdvancementsData extends ForgeAdvancementProvider {

    public GravitationAdvancementsData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper existingFileHelper) {
        super(output, registries, existingFileHelper, List.of(new GravitationAdvancements()));
    }

    public static class GravitationAdvancements implements AdvancementGenerator {

        @Override
        public void generate(HolderLookup.Provider registries, Consumer<Advancement> consumer, ExistingFileHelper existingFileHelper) {
            Advancement bronzite_rock = Advancement.Builder.advancement()
                    .parent(new ResourceLocation(Aether.MODID, "the_aether"))
                    .display(GravitationItems.BRONZITE_ROCK.get(),
                            Component.translatable("advancement.gravitation.bronzite_rock"),
                            Component.translatable("advancement.gravitation.bronzite_rock.desc"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("bronzite_rock", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_ROCK.get()))
                    .save(consumer, new ResourceLocation(Gravitation.MOD_ID, "bronzite_rock"), existingFileHelper);
            Advancement bronzite_upgrade = Advancement.Builder.advancement()
                    .parent(bronzite_rock)
                    .display(GravitationItems.BRONZITE_UPGRADE.get(),
                            Component.translatable("advancement.gravitation.bronzite_upgrade"),
                            Component.translatable("advancement.gravitation.bronzite_upgrade.desc"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("bronzite_rock", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_UPGRADE.get()))
                    .save(consumer, new ResourceLocation(Gravitation.MOD_ID, "bronzite_upgrade"), existingFileHelper);
            Advancement bronzite_armor = Advancement.Builder.advancement()
                    .parent(bronzite_upgrade)
                    .display(GravitationItems.BRONZITE_GLOVES.get(),
                            Component.translatable("advancement.gravitation.bronzite_armor"),
                            Component.translatable("advancement.gravitation.bronzite_armor.desc"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("bronzite_helmet", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_HELMET.get()))
                    .addCriterion("bronzite_chestplate", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_CHESTPLATE.get()))
                    .addCriterion("bronzite_legging", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_LEGGING.get()))
                    .addCriterion("bronzite_boots", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_BOOTS.get()))
                    .addCriterion("bronzite_gloves", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_GLOVES.get()))
                    .save(consumer, new ResourceLocation(Gravitation.MOD_ID, "bronzite_armor"), existingFileHelper);

            Advancement neptune_tool = Advancement.Builder.advancement()
                    .parent(new ResourceLocation(Aether.MODID, "the_aether"))
                    .display(GravitationItems.NEPTUNE_CUTLASS.get(),
                            Component.translatable("advancement.gravitation.neptune"),
                            Component.translatable("advancement.gravitation.neptune.desc"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("neptune_tool", InventoryChangeTrigger.TriggerInstance.hasItems(
                            new ItemPredicate(GraviTags.Items.NEPTUNE_TOOLS, null, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, EnchantmentPredicate.NONE, EnchantmentPredicate.NONE, null, NbtPredicate.ANY)
                    ))
                    .save(consumer, new ResourceLocation(Gravitation.MOD_ID, "neptune_tool"), existingFileHelper);

            Advancement neptune_wrath = Advancement.Builder.advancement()
                    .parent(new ResourceLocation(Aether.MODID, "the_aether"))
                    .display(Items.ENCHANTED_BOOK,
                            Component.translatable("advancement.gravitation.neptune_wrath"),
                            Component.translatable("advancement.gravitation.neptune_wrath.desc"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("neptune_wrath_enchant",
                            new EnchantedItemTrigger.TriggerInstance(
                                    ContextAwarePredicate.ANY,
                                    new ItemPredicate(
                                            null,
                                            null,
                                            MinMaxBounds.Ints.ANY,
                                            MinMaxBounds.Ints.ANY,
                                            new EnchantmentPredicate[] { new EnchantmentPredicate(GravitationEnchantments.NEPTUNE_WRATH.get(), MinMaxBounds.Ints.ANY) },
                                            EnchantmentPredicate.NONE,
                                            null,
                                            NbtPredicate.ANY
                                    ),
                                    MinMaxBounds.Ints.ANY)
                    )
                    .save(consumer, new ResourceLocation(Gravitation.MOD_ID, "neptune_wrath"), existingFileHelper);

            Advancement hercules_strength = Advancement.Builder.advancement()
                    .parent(new ResourceLocation(Aether.MODID, "the_aether"))
                    .display(Items.ENCHANTED_BOOK,
                            Component.translatable("advancement.gravitation.hercules_strength"),
                            Component.translatable("advancement.gravitation.hercules_strength.desc"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("neptune_wrath_enchant",
                            new EnchantedItemTrigger.TriggerInstance(
                                    ContextAwarePredicate.ANY,
                                    new ItemPredicate(
                                            null,
                                            null,
                                            MinMaxBounds.Ints.ANY,
                                            MinMaxBounds.Ints.ANY,
                                            new EnchantmentPredicate[] { new EnchantmentPredicate(GravitationEnchantments.HERCULES_STRENGTH.get(), MinMaxBounds.Ints.ANY) },
                                            EnchantmentPredicate.NONE,
                                            null,
                                            NbtPredicate.ANY
                                    ),
                                    MinMaxBounds.Ints.ANY)
                    )
                    .save(consumer, new ResourceLocation(Gravitation.MOD_ID, "hercules_strength"), existingFileHelper);
        }
    }
}
