package net.matowo.invisiblearmor.item;

import net.fabricmc.fabric.api.entity.event.v1.FabricElytraItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.matowo.invisiblearmor.MatowosInvisibleArmor;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.Util;

import java.util.List;

public class ModItems {
    // VARIABLES
    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Formatting ELYTRA_NAME = Formatting.YELLOW;

    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = new Identifier("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = new Identifier("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = new Identifier("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = new Identifier("item/empty_armor_slot_boots");
    private static  final Identifier EMPTY_SLOT_INGOT_TEXTURE = new Identifier("item/empty_slot_ingot");



    private static List<Identifier> getEmptyArmorSlots() {
        return List.of(
                EMPTY_ARMOR_SLOT_HELMET_TEXTURE,
                EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE,
                EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE,
                EMPTY_ARMOR_SLOT_BOOTS_TEXTURE
        );
    }

    private static List<Identifier> getEmptyAdditionSlots() {
        return List.of(
                EMPTY_SLOT_INGOT_TEXTURE
        );
    }


    // SMITHING TEMPLATE
    public static final Item INVISIBLE_ARMOR_SMITHING_TEMPLATE = registerItem(
            "invisible_armor_smithing_template", new SmithingTemplateItem(
                    Text.translatable(Util.createTranslationKey("item", new Identifier("invisible_smithing_template.applies_to"))).formatted(DESCRIPTION_FORMATTING),
                    Text.translatable(Util.createTranslationKey("item", new Identifier("invisible_smithing_template.ingredients"))).formatted(DESCRIPTION_FORMATTING),
                    Text.translatable(Util.createTranslationKey("item", new Identifier("invisible_smithing_template.tittle"))).formatted(TITLE_FORMATTING),
                    Text.translatable(Util.createTranslationKey("item", new Identifier("invisible_smithing_template.base_slot_description"))),
                    Text.translatable(Util.createTranslationKey("item", new Identifier("invisible_smithing_template.additions_slot_description"))),
                    getEmptyArmorSlots(),
                    getEmptyAdditionSlots()
            ));

    public static final Item VISIBLE_ARMOR_SMITHING_TEMPLATE = registerItem(
            "visible_armor_smithing_template", new SmithingTemplateItem(
                    Text.translatable(Util.createTranslationKey("item", new Identifier("visible_smithing_template.applies_to"))).formatted(DESCRIPTION_FORMATTING),
                    Text.translatable(Util.createTranslationKey("item", new Identifier("visible_smithing_template.ingredients"))).formatted(DESCRIPTION_FORMATTING),
                    Text.translatable(Util.createTranslationKey("item", new Identifier("visible_smithing_template.tittle"))).formatted(TITLE_FORMATTING),
                    Text.translatable(Util.createTranslationKey("item", new Identifier("visible_smithing_template.base_slot_description"))),
                    Text.translatable(Util.createTranslationKey("item", new Identifier("visible_smithing_template.additions_slot_description"))),
                    getEmptyArmorSlots(),
                    getEmptyAdditionSlots()
            ));


    // ELYTRA
    public static final Item INVISIBLE_ELYTRA = registerItem("invisible_elytra", new ModElytraItem(
            new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON)));


    // ARMORS
    public static final Item INVISIBLE_LEATHER_HELMET = registerItem("invisible_leather_helmet",
            new ArmorItem(ModArmorMaterials.INVISIBLE_LEATHER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item INVISIBLE_LEATHER_CHESTPLATE = registerItem("invisible_leather_chestplate",
            new ArmorItem(ModArmorMaterials.INVISIBLE_LEATHER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item INVISIBLE_LEATHER_LEGGINGS = registerItem("invisible_leather_leggings",
            new ArmorItem(ModArmorMaterials.INVISIBLE_LEATHER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item INVISIBLE_LEATHER_BOOTS = registerItem("invisible_leather_boots",
            new ArmorItem(ModArmorMaterials.INVISIBLE_LEATHER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item INVISIBLE_CHAINMAIL_HELMET = registerItem("invisible_chainmail_helmet",
            new ArmorItem(ModArmorMaterials.INVISIBLE_CHAINMAIL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item INVISIBLE_CHAINMAIL_CHESTPLATE = registerItem("invisible_chainmail_chestplate",
            new ArmorItem(ModArmorMaterials.INVISIBLE_CHAINMAIL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item INVISIBLE_CHAINMAIL_LEGGINGS = registerItem("invisible_chainmail_leggings",
            new ArmorItem(ModArmorMaterials.INVISIBLE_CHAINMAIL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item INVISIBLE_CHAINMAIL_BOOTS = registerItem("invisible_chainmail_boots",
            new ArmorItem(ModArmorMaterials.INVISIBLE_CHAINMAIL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item INVISIBLE_IRON_HELMET = registerItem("invisible_iron_helmet",
            new ArmorItem(ModArmorMaterials.INVISIBLE_IRON, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item INVISIBLE_IRON_CHESTPLATE = registerItem("invisible_iron_chestplate",
            new ArmorItem(ModArmorMaterials.INVISIBLE_IRON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item INVISIBLE_IRON_LEGGINGS = registerItem("invisible_iron_leggings",
            new ArmorItem(ModArmorMaterials.INVISIBLE_IRON, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item INVISIBLE_IRON_BOOTS = registerItem("invisible_iron_boots",
            new ArmorItem(ModArmorMaterials.INVISIBLE_IRON, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item INVISIBLE_GOLDEN_HELMET = registerItem("invisible_golden_helmet",
            new ArmorItem(ModArmorMaterials.INVISIBLE_GOLD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item INVISIBLE_GOLDEN_CHESTPLATE = registerItem("invisible_golden_chestplate",
            new ArmorItem(ModArmorMaterials.INVISIBLE_GOLD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item INVISIBLE_GOLDEN_LEGGINGS = registerItem("invisible_golden_leggings",
            new ArmorItem(ModArmorMaterials.INVISIBLE_GOLD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item INVISIBLE_GOLDEN_BOOTS = registerItem("invisible_golden_boots",
            new ArmorItem(ModArmorMaterials.INVISIBLE_GOLD, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item INVISIBLE_DIAMOND_HELMET = registerItem("invisible_diamond_helmet",
            new ArmorItem(ModArmorMaterials.INVISIBLE_DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item INVISIBLE_DIAMOND_CHESTPLATE = registerItem("invisible_diamond_chestplate",
            new ArmorItem(ModArmorMaterials.INVISIBLE_DIAMOND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item INVISIBLE_DIAMOND_LEGGINGS = registerItem("invisible_diamond_leggings",
            new ArmorItem(ModArmorMaterials.INVISIBLE_DIAMOND, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item INVISIBLE_DIAMOND_BOOTS = registerItem("invisible_diamond_boots",
            new ArmorItem(ModArmorMaterials.INVISIBLE_DIAMOND, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item INVISIBLE_NETHERITE_HELMET = registerItem("invisible_netherite_helmet",
            new ArmorItem(ModArmorMaterials.INVISIBLE_NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item INVISIBLE_NETHERITE_CHESTPLATE = registerItem("invisible_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.INVISIBLE_NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item INVISIBLE_NETHERITE_LEGGINGS = registerItem("invisible_netherite_leggings",
            new ArmorItem(ModArmorMaterials.INVISIBLE_NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item INVISIBLE_NETHERITE_BOOTS = registerItem("invisible_netherite_boots",
            new ArmorItem(ModArmorMaterials.INVISIBLE_NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item INVISIBLE_TURTLE_HELMET = registerItem("invisible_turtle_helmet",
            new ArmorItem(ModArmorMaterials.INVISIBLE_TURTLE, ArmorItem.Type.HELMET, new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MatowosInvisibleArmor.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MatowosInvisibleArmor.LOGGER.info("Registering Mod Items for " + MatowosInvisibleArmor.MOD_ID);
    }
}
