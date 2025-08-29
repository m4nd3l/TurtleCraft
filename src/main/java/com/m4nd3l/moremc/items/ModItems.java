package com.m4nd3l.moremc.items;

import com.m4nd3l.moremc.MoreMC;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreMC.MOD_ID);



    // INGOT

        //SCUTE INGOT
    public static final RegistryObject<Item> SCUTE_INGOT = ITEMS.register("scute_ingot",
            () -> new Item(new Item.Properties()));

        //REINFORCED SCUTE INGOT
    public static final RegistryObject<Item> REINFORCED_SCUTE_INGOT = ITEMS.register("reinforced_scute_ingot",
            () -> new Item(new Item.Properties()));

        //REINFORCED SCUTE INGOT
    public static final RegistryObject<Item> HARDENED_SCUTE_INGOT = ITEMS.register("hardened_scute_ingot",
            () -> new Item(new Item.Properties()));



    // SCUTE

        //REINFORCED SCUTE INGOT
    public static final RegistryObject<Item> REINFORCED_SCUTE = ITEMS.register("reinforced_scute",
            () -> new Item(new Item.Properties()));

        //REINFORCED SCUTE INGOT
    public static final RegistryObject<Item> HARDENED_SCUTE = ITEMS.register("hardened_scute",
            () -> new Item(new Item.Properties()));



    // SCUTE TOOLS

        // SCUTE INGOT SWORD
    public static final RegistryObject<Item> SCUTE_SWORD = ITEMS.register("scute_sword",
            () -> new SwordItem(ModToolTiers.SCUTE, new Item.Properties()
                    .fireResistant()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SCUTE, 5, -2.4f))));

        // SCUTE INGOT PICKAXE
    public static final RegistryObject<Item> SCUTE_PICKAXE = ITEMS.register("scute_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SCUTE, new Item.Properties()
                    .fireResistant()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SCUTE, 1.2f, -2.8f))));

        // SCUTE INGOT AXE
    public static final RegistryObject<Item> SCUTE_AXE = ITEMS.register("scute_axe",
            () -> new AxeItem(ModToolTiers.SCUTE, new Item.Properties()
                    .fireResistant()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SCUTE, 6, -3f))));

        // SCUTE INGOT SHOVEL
    public static final RegistryObject<Item> SCUTE_SHOVEL = ITEMS.register("scute_shovel",
            () -> new ShovelItem(ModToolTiers.SCUTE, new Item.Properties()
                    .fireResistant()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SCUTE, 2f, -3f))));

        // SCUTE INGOT HOE
    public static final RegistryObject<Item> SCUTE_HOE = ITEMS.register("scute_hoe",
            () -> new HoeItem(ModToolTiers.SCUTE, new Item.Properties()
                    .fireResistant()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SCUTE, -4f, -0f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
