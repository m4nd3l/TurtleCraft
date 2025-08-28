package com.m4nd3l.turtlecraft.item;

import com.m4nd3l.turtlecraft.TurtleCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TurtleCraft.MOD_ID);

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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
