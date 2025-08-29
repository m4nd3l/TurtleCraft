package com.m4nd3l.moremc.items;

import com.m4nd3l.moremc.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier SCUTE = new ForgeTier(
            2300,
            10f,
            5f,
            15,
            ModTags.Blocks.NEEDS_SCUTE_TOOL,
            () -> Ingredient.of(ModItems.SCUTE_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_SCUTE_TOOL);

    public static final Tier REINFORCED_SCUTE = new ForgeTier(
            2600,
            11f,
            6f,
            18,
            ModTags.Blocks.NEEDS_SCUTE_TOOL,
            () -> Ingredient.of(ModItems.SCUTE_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_SCUTE_TOOL);

    public static final Tier HARDENED_SCUTE = new ForgeTier(
            2800,
            12f,
            7f,
            23,
            ModTags.Blocks.NEEDS_SCUTE_TOOL,
            () -> Ingredient.of(ModItems.SCUTE_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_SCUTE_TOOL);
}
