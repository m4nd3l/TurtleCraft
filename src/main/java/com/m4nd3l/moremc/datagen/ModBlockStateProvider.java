package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreMC.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SCUTE_BLOCK);
        blockWithItem(ModBlocks.SCUTE_INGOT_BLOCK);

        blockWithItem(ModBlocks.REINFORCED_SCUTE_BLOCK);
        blockWithItem(ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK);

        blockWithItem(ModBlocks.HARDENED_SCUTE_BLOCK);
        blockWithItem(ModBlocks.HARDENED_SCUTE_INGOT_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
