package com.BoomCow.methanecow.block.custom;

import com.BoomCow.methanecow.item.ModItems;
import com.BoomCow.methanecow.item.custom.PasteurizedMilkItem;
import com.BoomCow.methanecow.tileentity.CheeseBasinTile;
import com.BoomCow.methanecow.tileentity.ModTileEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class CheeseBasin extends Block {
    public enum CheeseBasinState implements IStringSerializable {
        EMPTY("empty"),
        CHEESECLOTH("cheesecloth"),
        LID_1("lid_1"),
        LID_2("lid_2"),
        CHEESE("cheese");

        private final String name;

        CheeseBasinState(String name) {
            this.name = name;
        }

        @Override
        public String getString() {
            return name;
        }
    }

    public static final EnumProperty<CheeseBasinState> STATE = EnumProperty.create("state", CheeseBasinState.class);

    public CheeseBasin(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(STATE, CheeseBasinState.EMPTY));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STATE);
    }

    private static final VoxelShape BASIN_SHAPE = Stream.of(
            Block.makeCuboidShape(1, 0, 1, 15, 1, 15),
            Block.makeCuboidShape(1, 1, 1, 2, 6, 15),
            Block.makeCuboidShape(14, 1, 1, 15, 6, 15),
            Block.makeCuboidShape(2, 1, 1, 14, 6, 2),
            Block.makeCuboidShape(2, 1, 14, 14, 6, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape LIDDED_BASIN_1_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Block.makeCuboidShape(1, 0, 1, 15, 1, 15),
            Block.makeCuboidShape(1, 1, 1, 2, 6, 15),
            Block.makeCuboidShape(14, 1, 1, 15, 6, 15),
            Block.makeCuboidShape(2, 1, 1, 14, 6, 2),
            Block.makeCuboidShape(2, 1, 14, 14, 6, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get(), Stream.of(
            Block.makeCuboidShape(1, 7, 1, 15, 9, 2),
            Block.makeCuboidShape(1, 7, 14, 15, 9, 15),
            Block.makeCuboidShape(1, 7, 2, 2, 9, 14),
            Block.makeCuboidShape(14, 7, 2, 15, 9, 14),
            Block.makeCuboidShape(2, 6, 2, 14, 9, 14),
            Block.makeCuboidShape(7, 9, 7, 9, 10, 9)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get(),
            IBooleanFunction.OR);

    private static final VoxelShape LIDDED_BASIN_2_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Block.makeCuboidShape(1, 6, 1, 15, 8, 2),
            Block.makeCuboidShape(1, 6, 14, 15, 8, 15),
            Block.makeCuboidShape(1, 6, 2, 2, 8, 14),
            Block.makeCuboidShape(14, 6, 2, 15, 8, 14),
            Block.makeCuboidShape(2, 5, 2, 14, 8, 14),
            Block.makeCuboidShape(7, 8, 7, 9, 9, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get(), Stream.of(
            Block.makeCuboidShape(1, 0, 1, 15, 1, 15),
            Block.makeCuboidShape(1, 1, 1, 2, 6, 15),
            Block.makeCuboidShape(14, 1, 1, 15, 6, 15),
            Block.makeCuboidShape(2, 1, 1, 14, 6, 2),
            Block.makeCuboidShape(2, 1, 14, 14, 6, 15)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get(),
            IBooleanFunction.OR);

    private static final VoxelShape BASIN_WITH_CHEESE_SHAPE = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(2, 1, 2, 14, 5, 14), Stream.of(
            Block.makeCuboidShape(1, 0, 1, 15, 1, 15),
            Block.makeCuboidShape(1, 1, 1, 2, 6, 15),
            Block.makeCuboidShape(14, 1, 1, 15, 6, 15),
            Block.makeCuboidShape(2, 1, 1, 14, 6, 2),
            Block.makeCuboidShape(2, 1, 14, 14, 6, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get(), IBooleanFunction.OR);

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(STATE)) {
            case LID_1:
                return LIDDED_BASIN_1_SHAPE;
            case LID_2:
                return LIDDED_BASIN_2_SHAPE;
            case CHEESE:
                return BASIN_WITH_CHEESE_SHAPE;
            default:
                return BASIN_SHAPE;
        }
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote()) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if (tileEntity instanceof CheeseBasinTile) {
                CheeseBasinTile cheeseBasinTile = (CheeseBasinTile) tileEntity;

                if (handIn == Hand.MAIN_HAND) {
                    ItemStack heldItem = player.getHeldItem(handIn);

                    if (heldItem.getItem() == ModItems.CHEESECLOTH.get() && state.get(STATE) == CheeseBasinState.EMPTY) {
                        worldIn.setBlockState(pos, state.with(STATE, CheeseBasinState.CHEESECLOTH));
                        if (!player.isCreative()) {
                            heldItem.shrink(1);
                        }
                        return ActionResultType.SUCCESS;
                    }

                    if (heldItem.getItem() instanceof PasteurizedMilkItem) {
                        if (cheeseBasinTile.addMilk(heldItem.getItem())) {
                            if (!player.isCreative()) {
                                player.setHeldItem(handIn, new ItemStack(Items.BUCKET));
                            }
                            return ActionResultType.SUCCESS;
                        }
                    }

                    if (cheeseBasinTile.retrieveCheese(player)) {
                        return ActionResultType.SUCCESS;
                    }
                }
            }
        }

        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntities.CHEESE_BASIN_TILE.get().create();
    }
}
