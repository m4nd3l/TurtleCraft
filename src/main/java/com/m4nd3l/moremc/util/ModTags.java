package com.m4nd3l.moremc.util;

import com.m4nd3l.moremc.MoreMC;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SCUTE_TOOL = createTag("needs_scute_tool");
        public static final TagKey<Block> INCORRECT_FOR_SCUTE_TOOL = createTag("incorrect_for_scute_tool");

        public static final TagKey<Block> NEEDS_REINFORCED_SCUTE_TOOL = createTag("needs_reinforced_scute_tool");
        public static final TagKey<Block> INCORRECT_FOR_REINFORCED_SCUTE_TOOL = createTag("incorrect_for_reinforced_scute_tool");

        public static final TagKey<Block> NEEDS_HARDENED_SCUTE_TOOL = createTag("needs_hardened_scute_tool");
        public static final TagKey<Block> INCORRECT_FOR_HARDENED_SCUTE_TOOL = createTag("incorrect_for_hardened_scute_tool");


        public static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MoreMC.MOD_ID, name));
        }
    }
}
