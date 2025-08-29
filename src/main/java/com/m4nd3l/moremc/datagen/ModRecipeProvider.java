package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.blocks.ModBlocks;
import com.m4nd3l.moremc.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {



        //SCUTE

        //9 TURTLE SCUTE -> 1 SCUTE BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.TURTLE_SCUTE, 9)
                .requires(ModBlocks.SCUTE_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.SCUTE_BLOCK.get())).save(pRecipeOutput);


        //SCUTE BLOCK -> 9 TURTLE SCUTE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SCUTE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Items.TURTLE_SCUTE)
                .unlockedBy("got_scute", has(Items.TURTLE_SCUTE)).save(pRecipeOutput);


        //1 SCUTE INGOT -> 1 TURTLE SCUTE
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(Items.TURTLE_SCUTE),
                RecipeCategory.MISC,
                ModItems.SCUTE_INGOT.get(),
                0.05f,
                400)
                .unlockedBy("got_scute", has(Items.TURTLE_SCUTE)).save(pRecipeOutput);


        // 9 SCUTE INGOT -> 1 SCUTE INGOT BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SCUTE_INGOT.get(), 9)
                .requires(ModBlocks.SCUTE_INGOT_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.SCUTE_INGOT_BLOCK.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":scute_ingot_from_block");


        // SCUTE INGOT BLOCK -> 9 SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SCUTE_INGOT_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.SCUTE_INGOT.get())).save(pRecipeOutput);
        //
        //
        //
        //
        // REINFORCED SCUTE

        //CUSTOM BLOCK ENTITY PER 1 TURTLE SCUTE -> 1 REINFORCED SCUTE


        //9 REINFORCED SCUTE -> 1 REINFORCED SCUTE BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REINFORCED_SCUTE.get(), 9)
                .requires(ModBlocks.REINFORCED_SCUTE_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.REINFORCED_SCUTE_BLOCK.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":reinforced_scute_from_block");


        //REINFORCED SCUTE BLOCK -> 9 REINFORCED SCUTE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REINFORCED_SCUTE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.REINFORCED_SCUTE.get())
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE.get())).save(pRecipeOutput);


        //1 REINFORCED SCUTE INGOT -> 1 REINFORCED SCUTE
        SimpleCookingRecipeBuilder.smelting(
                        Ingredient.of(ModItems.REINFORCED_SCUTE.get()),
                        RecipeCategory.MISC,
                        ModItems.REINFORCED_SCUTE_INGOT.get(),
                        0.05f,
                        400)
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE.get())).save(pRecipeOutput);


        // 9 REINFORCED SCUTE INGOT -> 1 REINFORCED SCUTE INGOT BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REINFORCED_SCUTE_INGOT.get(), 9)
                .requires(ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":reinforced_scute_ingot_from_block");


        // SCUTE INGOT BLOCK -> 9 SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REINFORCED_SCUTE_INGOT_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.REINFORCED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.REINFORCED_SCUTE_INGOT.get())).save(pRecipeOutput);
        //
        //
        //
        //
        // HARDENED SCUTE

        //CUSTOM BLOCK ENTITY PER 1 REINFORCED  SCUTE -> 1 HARDENED SCUTE


        //9 HARDENED SCUTE -> 1 HARDENED SCUTE BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HARDENED_SCUTE.get(), 9)
                .requires(ModBlocks.HARDENED_SCUTE_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.HARDENED_SCUTE_BLOCK.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":hardened_scute_from_block");


        //HARDENED SCUTE BLOCK -> 9 HARDENED SCUTE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HARDENED_SCUTE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.HARDENED_SCUTE.get())
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE.get())).save(pRecipeOutput);


        //1 HARDENED SCUTE INGOT -> 1 HARDENED SCUTE
        SimpleCookingRecipeBuilder.smelting(
                        Ingredient.of(ModItems.HARDENED_SCUTE.get()),
                        RecipeCategory.MISC,
                        ModItems.HARDENED_SCUTE_INGOT.get(),
                        0.05f,
                        600)
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE.get())).save(pRecipeOutput);


        // 9 HARDENED SCUTE INGOT -> 1 HARDENED SCUTE INGOT BLOCK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HARDENED_SCUTE_INGOT.get(), 9)
                .requires(ModBlocks.HARDENED_SCUTE_INGOT_BLOCK.get())
                .unlockedBy("got_scute", has(ModBlocks.HARDENED_SCUTE_INGOT_BLOCK.get()))
                .save(pRecipeOutput, MoreMC.MOD_ID + ":hardened_scute_ingot_from_block");


        // SCUTE INGOT BLOCK -> 9 SCUTE INGOT
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HARDENED_SCUTE_INGOT_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.HARDENED_SCUTE_INGOT.get())
                .unlockedBy("got_scute", has(ModItems.HARDENED_SCUTE_INGOT.get())).save(pRecipeOutput);
    }
}
