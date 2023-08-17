package net.katte.yamm.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.katte.yamm.YAMagicM;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MAGIC_MATERIALS = FabricItemGroupBuilder.build(
            new Identifier(YAMagicM.MOD_ID, "magic_materials"), () -> new ItemStack(ModItems.PLATINUM_INGOT)
    );
}
