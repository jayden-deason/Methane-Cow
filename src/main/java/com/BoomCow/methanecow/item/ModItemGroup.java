package com.BoomCow.methanecow.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup METHANECOW = new ItemGroup("methanecow") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.CHEESE.get());
        }
    };
}
