package com.BoomCow.methanecow.tileentity;

import com.BoomCow.methanecow.block.custom.CheeseBasin;
import com.BoomCow.methanecow.recipe.CheeseBasinRecipe;
import com.BoomCow.methanecow.recipe.ModRecipes;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Optional;

public class CheeseBasinTile extends TileEntity implements ITickableTileEntity {
    private Item milkType;
    private int cheeseMakingTime;
    private int totalCheeseMakingTime;

    public CheeseBasinTile(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
        milkType = null;
        cheeseMakingTime = 0;
        totalCheeseMakingTime = 0;
    }

    public CheeseBasinTile() {
        this(ModTileEntities.CHEESE_BASIN_TILE.get());
    }

    @Override
    public void read(BlockState state, CompoundNBT nbt) {
        super.read(state, nbt);
        if (nbt.contains("MilkType")) {
            milkType = ForgeRegistries.ITEMS.getValue(new ResourceLocation(nbt.getString("MilkType")));
        } else {
            milkType = null;
        }
        cheeseMakingTime = nbt.getInt("CheeseMakingTime");
        totalCheeseMakingTime = nbt.getInt("TotalCheeseMakingTime");
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
        if (milkType != null) {
            compound.putString("MilkType", milkType.getRegistryName().toString());
        }
        compound.putInt("CheeseMakingTime", cheeseMakingTime);
        compound.putInt("TotalCheeseMakingTime", totalCheeseMakingTime);
        return compound;
    }

    @Override
    public void tick() {
        if (world.isRemote()) {
            return;
        }

        if (milkType != null && cheeseMakingTime > 0) {
            cheeseMakingTime--;
            if (cheeseMakingTime == totalCheeseMakingTime / 2) {
                world.setBlockState(pos, getBlockState().with(CheeseBasin.STATE, CheeseBasin.CheeseBasinState.LID_2));
            } else if (cheeseMakingTime == 0) {
                world.setBlockState(pos, getBlockState().with(CheeseBasin.STATE, CheeseBasin.CheeseBasinState.CHEESE));
            }

            markDirty();
        }
    }

    public boolean addMilk(Item milkItem) {
        if (milkType == null && getBlockState().get(CheeseBasin.STATE) == CheeseBasin.CheeseBasinState.CHEESECLOTH) {
            SimpleInventory inventory = new SimpleInventory(new ItemStack(milkItem));
            Optional<CheeseBasinRecipe> recipe = world.getRecipeManager()
                    .getRecipe(ModRecipes.CHEESE_BASIN_TYPE, inventory, world);

            if (recipe.isPresent()) {
                milkType = milkItem;
                totalCheeseMakingTime = recipe.get().getProcessTime();
                cheeseMakingTime = totalCheeseMakingTime;
                world.setBlockState(pos, getBlockState().with(CheeseBasin.STATE, CheeseBasin.CheeseBasinState.LID_1));
                markDirty();
                return true;
            }
        }
        return false;
    }

    public boolean retrieveCheese(PlayerEntity player) {
        if (milkType != null && cheeseMakingTime == 0) {
            SimpleInventory inventory = new SimpleInventory(new ItemStack(milkType));
            Optional<CheeseBasinRecipe> recipe = world.getRecipeManager()
                    .getRecipe(ModRecipes.CHEESE_BASIN_TYPE, inventory, world);

            if (recipe.isPresent()) {
                ItemStack output = recipe.get().getRecipeOutput().copy();
                if (!player.addItemStackToInventory(output)) {
                    player.dropItem(output, false);
                }
                milkType = null;
                cheeseMakingTime = 0;
                totalCheeseMakingTime = 0;
                world.setBlockState(pos, getBlockState().with(CheeseBasin.STATE, CheeseBasin.CheeseBasinState.EMPTY));
                markDirty();
                return true;
            }
        }
        return false;
    }
}
