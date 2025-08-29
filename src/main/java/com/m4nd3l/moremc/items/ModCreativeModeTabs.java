package com.m4nd3l.moremc.items;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreMC.MOD_ID);


    // MoreMC - Scute
    public static final RegistryObject<CreativeModeTab> SCUTE_ITEMS_TAB = CREATIVE_MODE_TABS.register("scute_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.TURTLE_SCUTE))
                    .title(Component.translatable("creativetab.moremc.scuteitems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.TURTLE_SCUTE);
                        output.accept(ModItems.SCUTE_INGOT.get());
                        output.accept(ModBlocks.SCUTE_BLOCK.get());

                        output.accept(ModItems.REINFORCED_SCUTE.get());
                        output.accept(ModItems.REINFORCED_SCUTE_INGOT.get());
                        output.accept(ModBlocks.REINFORCED_SCUTE_BLOCK.get());

                        output.accept(ModItems.HARDENED_SCUTE.get());
                        output.accept(ModItems.HARDENED_SCUTE_INGOT.get());
                        output.accept(ModBlocks.HARDENED_SCUTE_BLOCK.get());
                    }).build());

    // PER LE ALTRE TAB AGGIUNGI .withTabsBefore(SCUTE_ITEMS_TAB.getId())

    //AL POSTO DI SCUTE_ITEMS_TAB.getId() metti la tab prima di quella in cui devi mettere .withTabsBefore(SCUTE_ITEMS_TAB.getId()) + .getId()


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
