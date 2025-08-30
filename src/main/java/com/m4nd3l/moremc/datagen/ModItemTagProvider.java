package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                              CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, MoreMC.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SCUTE_HELMET.get())
                .add(ModItems.SCUTE_CHESTPLATE.get())
                .add(ModItems.SCUTE_LEGGINGS.get())
                .add(ModItems.SCUTE_BOOTS.get())

                .add(ModItems.REINFORCED_SCUTE_HELMET.get())
                .add(ModItems.REINFORCED_SCUTE_CHESTPLATE.get())
                .add(ModItems.REINFORCED_SCUTE_LEGGINGS.get())
                .add(ModItems.REINFORCED_SCUTE_BOOTS.get())

                .add(ModItems.HARDENED_SCUTE_HELMET.get())
                .add(ModItems.HARDENED_SCUTE_CHESTPLATE.get())
                .add(ModItems.HARDENED_SCUTE_LEGGINGS.get())
                .add(ModItems.HARDENED_SCUTE_BOOTS.get());
    }
}
