package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

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

        handHeldItem(ModItems.SCUTE_SWORD);
        handHeldItem(ModItems.SCUTE_PICKAXE);
        handHeldItem(ModItems.SCUTE_AXE);
        handHeldItem(ModItems.SCUTE_SHOVEL);
        handHeldItem(ModItems.SCUTE_HOE);
    }

    private ItemModelBuilder handHeldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MoreMC.MOD_ID, "item/" + item.getId().getPath()));
    }
}
