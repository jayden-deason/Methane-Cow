package com.BoomCow.methanecow.item.custom;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class PasteurizedMilkItem extends FlavoredMilkItem {
    public PasteurizedMilkItem(Properties builder) {
        super(builder);
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(1, new StringTextComponent("The same as regular milk,"));
        tooltip.add(2, new StringTextComponent("but with a hint of something extra."));
        tooltip.add(3, new StringTextComponent("Pasteurized for your safety!"));
    }
}
