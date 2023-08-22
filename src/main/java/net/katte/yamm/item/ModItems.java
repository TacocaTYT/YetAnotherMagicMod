package net.katte.yamm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.katte.yamm.YAMagicM;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_PLATINUM = registerItem("raw_platinum",
            new Item(new FabricItemSettings().group(ModItemGroup.MAGIC_MATERIALS)));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MAGIC_MATERIALS)));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MAGIC_MATERIALS)));
    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings().group(ModItemGroup.MAGIC_MATERIALS)));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MAGIC_MATERIALS)));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MAGIC_MATERIALS)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(YAMagicM.MOD_ID, name), item);
    }

    public static void registerModItems() {
        YAMagicM.LOGGER.debug("Registering Mod Items for " + YAMagicM.MOD_ID);
    }
}
