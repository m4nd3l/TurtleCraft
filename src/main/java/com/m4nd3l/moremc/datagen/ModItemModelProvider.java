package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreMC.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SCUTE_INGOT.get());

        basicItem(ModItems.REINFORCED_SCUTE.get());
        basicItem(ModItems.REINFORCED_SCUTE_INGOT.get());

        basicItem(ModItems.HARDENED_SCUTE.get());
        basicItem(ModItems.HARDENED_SCUTE_INGOT.get());
    }
}
