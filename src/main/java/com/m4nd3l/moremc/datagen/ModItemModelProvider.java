package com.m4nd3l.moremc.datagen;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreMC.MOD_ID, existingFileHelper);
    }

    private static final LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
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

        handHeldItem(ModItems.REINFORCED_SCUTE_SWORD);
        handHeldItem(ModItems.REINFORCED_SCUTE_PICKAXE);
        handHeldItem(ModItems.REINFORCED_SCUTE_AXE);
        handHeldItem(ModItems.REINFORCED_SCUTE_SHOVEL);
        handHeldItem(ModItems.REINFORCED_SCUTE_HOE);

        handHeldItem(ModItems.HARDENED_SCUTE_SWORD);
        handHeldItem(ModItems.HARDENED_SCUTE_PICKAXE);
        handHeldItem(ModItems.HARDENED_SCUTE_AXE);
        handHeldItem(ModItems.HARDENED_SCUTE_SHOVEL);
        handHeldItem(ModItems.HARDENED_SCUTE_HOE);

        trimmedArmorItem(ModItems.SCUTE_HELMET);
        trimmedArmorItem(ModItems.SCUTE_CHESTPLATE);
        trimmedArmorItem(ModItems.SCUTE_LEGGINGS);
        trimmedArmorItem(ModItems.SCUTE_BOOTS);

        trimmedArmorItem(ModItems.REINFORCED_SCUTE_HELMET);
        trimmedArmorItem(ModItems.REINFORCED_SCUTE_CHESTPLATE);
        trimmedArmorItem(ModItems.REINFORCED_SCUTE_LEGGINGS);
        trimmedArmorItem(ModItems.REINFORCED_SCUTE_BOOTS);

        trimmedArmorItem(ModItems.HARDENED_SCUTE_HELMET);
        trimmedArmorItem(ModItems.HARDENED_SCUTE_CHESTPLATE);
        trimmedArmorItem(ModItems.HARDENED_SCUTE_LEGGINGS);
        trimmedArmorItem(ModItems.HARDENED_SCUTE_BOOTS);


    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = MoreMC.MOD_ID;

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder handHeldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MoreMC.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(MoreMC.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(MoreMC.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(MoreMC.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MoreMC.MOD_ID,"item/" + item.getId().getPath()));
    }
}
