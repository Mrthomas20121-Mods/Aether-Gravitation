package mrthomas20121.gravitation.data.advancement;

import com.aetherteam.aether.Aether;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GravitationBlocks;
import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.function.Consumer;

public class GravitationAdvancements implements ForgeAdvancementProvider.AdvancementGenerator {

    public static AdvancementRL bronzite_ingot = advancementLoc("bronzite_ingot");
    public static AdvancementRL bronzite_full_set = advancementLoc("bronzite_full_set");
    public static AdvancementRL adamantite_gem = advancementLoc("adamantite_gem");
    public static AdvancementRL adamantite_full_set = advancementLoc("adamantite_full_set");
    public static AdvancementRL neptune_tools = advancementLoc("neptune_tools");
    public static AdvancementRL icy_aercloud = advancementLoc("icy_aercloud");
    public static AdvancementRL stamina_of_mars = advancementLoc("stamina_of_mars");
    public static AdvancementRL sun_spirit_blessing = advancementLoc("sun_spirit_blessing");

    private static AdvancementRL advancementLoc(String name) {
        return new AdvancementRL(name);
    }

    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> consumer, ExistingFileHelper existingFileHelper) {
        Advancement bronziteIngot = Advancement.Builder.advancement()
                .parent(new ResourceLocation(Aether.MODID, "the_aether"))
                .display(GravitationItems.BRONZITE_INGOT.get(),
                        bronzite_ingot.getAdvName(),
                        bronzite_ingot.getDesc(),
                        null,
                        FrameType.TASK, true, true, false)
                .addCriterion("ingot_bronzite", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(GraviTags.Items.INGOT_BRONZITE).build()))
                .save(consumer, bronzite_ingot, existingFileHelper);

        Advancement.Builder.advancement()
                .parent(bronziteIngot)
                .display(GravitationItems.BRONZITE_BOOTS.get(),
                        bronzite_full_set.getAdvName(),
                        bronzite_full_set.getDesc(),
                        null,
                        FrameType.TASK, true, true, false)
                .addCriterion("bronzite_helmet", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_HELMET.get()))
                .addCriterion("bronzite_chestplate", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_CHESTPLATE.get()))
                .addCriterion("bronzite_legging", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_LEGGING.get()))
                .addCriterion("bronzite_boots", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_BOOTS.get()))
                .addCriterion("bronzite_gloves", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.BRONZITE_GLOVES.get()))
                .save(consumer, bronzite_full_set, existingFileHelper);

        Advancement adamantite = Advancement.Builder.advancement()
                .parent(bronziteIngot)
                .display(GravitationItems.ADAMANTITE_GEM.get(),
                        adamantite_gem.getAdvName(),
                        adamantite_gem.getDesc(),
                        null,
                        FrameType.TASK, true, true, false)
                .addCriterion("gem_adamantite", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(GraviTags.Items.GEM_ADAMANTITE).build()))
                .save(consumer, adamantite_gem, existingFileHelper);

        Advancement.Builder.advancement()
                .parent(adamantite)
                .display(GravitationItems.ADAMANTITE_BOOTS.get(),
                        adamantite_full_set.getAdvName(),
                        adamantite_full_set.getDesc(),
                        null,
                        FrameType.TASK, true, true, false)
                .addCriterion("adamantite_helmet", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.ADAMANTITE_HELMET.get()))
                .addCriterion("adamantite_chestplate", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.ADAMANTITE_CHESTPLATE.get()))
                .addCriterion("adamantite_legging", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.ADAMANTITE_LEGGING.get()))
                .addCriterion("adamantite_boots", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.ADAMANTITE_BOOTS.get()))
                .addCriterion("adamantite_gloves", InventoryChangeTrigger.TriggerInstance.hasItems(GravitationItems.ADAMANTITE_GLOVES.get()))
                .save(consumer, adamantite_full_set, existingFileHelper);

        Advancement.Builder.advancement()
                .parent(new ResourceLocation(Aether.MODID, "the_aether"))
                .display(GravitationItems.NEPTUNE_CUTLASS.get(),
                        neptune_tools.getAdvName(),
                        neptune_tools.getDesc(),
                        null,
                        FrameType.TASK, true, true, false)
                .addCriterion("neptune_tool", InventoryChangeTrigger.TriggerInstance.hasItems(
                        new ItemPredicate(GraviTags.Items.NEPTUNE_TOOLS, null, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, EnchantmentPredicate.NONE, EnchantmentPredicate.NONE, null, NbtPredicate.ANY)
                ))
                .save(consumer, neptune_tools, existingFileHelper);

        Advancement.Builder.advancement()
                .parent(new ResourceLocation(Aether.MODID, "blue_aercloud"))
                .display(GravitationBlocks.ICY_AERCLOUD.get(),
                        icy_aercloud.getAdvName(),
                        icy_aercloud.getDesc(),
                        null,
                        FrameType.TASK, true, true, false)
                .addCriterion("icy_aercloud", EnterBlockTrigger.TriggerInstance.entersBlock(GravitationBlocks.ICY_AERCLOUD.get()))
                .save(consumer, icy_aercloud, existingFileHelper);

        Advancement stamina = Advancement.Builder.advancement()
                .parent(new ResourceLocation(Aether.MODID, "the_aether"))
                .display(Items.ENCHANTED_BOOK,
                        stamina_of_mars.getAdvName(),
                        stamina_of_mars.getDesc(),
                        null,
                        FrameType.TASK, true, true, false)
                .addCriterion("stamina_of_mars_enchant",
                        new EnchantedItemTrigger.TriggerInstance(
                                ContextAwarePredicate.ANY,
                                new ItemPredicate(
                                        null,
                                        null,
                                        MinMaxBounds.Ints.ANY,
                                        MinMaxBounds.Ints.ANY,
                                        new EnchantmentPredicate[] { new EnchantmentPredicate(GravitationEnchantments.STAMINA_OF_MARS.get(), MinMaxBounds.Ints.ANY) },
                                        EnchantmentPredicate.NONE,
                                        null,
                                        NbtPredicate.ANY
                                ),
                                MinMaxBounds.Ints.ANY)
                )
                .save(consumer, stamina_of_mars, existingFileHelper);

        Advancement.Builder.advancement()
                .parent(stamina)
                .display(Items.ENCHANTED_BOOK,
                        sun_spirit_blessing.getAdvName(),
                        sun_spirit_blessing.getDesc(),
                        null,
                        FrameType.TASK, true, true, false)
                .addCriterion("sun_spirit_blessing_enchant",
                        new EnchantedItemTrigger.TriggerInstance(
                                ContextAwarePredicate.ANY,
                                new ItemPredicate(
                                        null,
                                        null,
                                        MinMaxBounds.Ints.ANY,
                                        MinMaxBounds.Ints.ANY,
                                        new EnchantmentPredicate[] { new EnchantmentPredicate(GravitationEnchantments.SUN_SPIRIT_BLESSING.get(), MinMaxBounds.Ints.ANY) },
                                        EnchantmentPredicate.NONE,
                                        null,
                                        NbtPredicate.ANY
                                ),
                                MinMaxBounds.Ints.ANY)
                )
                .save(consumer, sun_spirit_blessing, existingFileHelper);
    }
}
