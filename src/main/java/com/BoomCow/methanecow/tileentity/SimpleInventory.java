package com.BoomCow.methanecow.tileentity;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class SimpleInventory implements IInventory {
    private final NonNullList<ItemStack> items;

    public SimpleInventory(ItemStack... stacks) {
        this.items = NonNullList.withSize(stacks.length, ItemStack.EMPTY);
        for (int i = 0; i < stacks.length; i++) {
            this.items.set(i, stacks[i]);
        }
    }

    @Override
    public int getSizeInventory() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.stream().allMatch(ItemStack::isEmpty);
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return items.get(index);
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        return ItemStack.EMPTY; // Not needed for this use case
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return ItemStack.EMPTY; // Not needed for this use case
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        items.set(index, stack);
    }

    @Override
    public void markDirty() {}

    @Override
    public boolean isUsableByPlayer(net.minecraft.entity.player.PlayerEntity player) {
        return true;
    }

    @Override
    public void clear() {
        items.clear();
    }
}