/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package com.fantasymods.fantasys_content;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

import com.fantasymods.fantasys_content.item.UltimatumSwordTool;
import com.fantasymods.fantasys_content.item.UltimatumShovelTool;
import com.fantasymods.fantasys_content.item.UltimatumPickaxeTool;
import com.fantasymods.fantasys_content.item.UltimatumIngotItem;
import com.fantasymods.fantasys_content.item.UltimatumHoeTool;
import com.fantasymods.fantasys_content.item.UltimatumAxeTool;
import com.fantasymods.fantasys_content.item.UltimatumArmorArmorMaterial;
import com.fantasymods.fantasys_content.item.MaestrariumSwordTool;
import com.fantasymods.fantasys_content.item.MaestrariumShovelTool;
import com.fantasymods.fantasys_content.item.MaestrariumPickaxeTool;
import com.fantasymods.fantasys_content.item.MaestrariumIngotItem;
import com.fantasymods.fantasys_content.item.MaestrariumHoeTool;
import com.fantasymods.fantasys_content.item.MaestrariumAxeTool;
import com.fantasymods.fantasys_content.item.MaestrariumArmorArmorMaterial;
import com.fantasymods.fantasys_content.item.IntermediumSwordTool;
import com.fantasymods.fantasys_content.item.IntermediumShovelTool;
import com.fantasymods.fantasys_content.item.IntermediumPickaxeTool;
import com.fantasymods.fantasys_content.item.IntermediumIngotItem;
import com.fantasymods.fantasys_content.item.IntermediumHoeTool;
import com.fantasymods.fantasys_content.item.IntermediumAxeTool;
import com.fantasymods.fantasys_content.item.IntermediumArmorArmorMaterial;
import com.fantasymods.fantasys_content.item.GreenusSwordTool;
import com.fantasymods.fantasys_content.item.GreenusShovelTool;
import com.fantasymods.fantasys_content.item.GreenusPickaxeTool;
import com.fantasymods.fantasys_content.item.GreenusIngotItem;
import com.fantasymods.fantasys_content.item.GreenusHoeTool;
import com.fantasymods.fantasys_content.item.GreenusAxeTool;
import com.fantasymods.fantasys_content.item.GreenusArmorArmorMaterial;
import com.fantasymods.fantasys_content.item.FinalStickItem;
import com.fantasymods.fantasys_content.item.FinalGemItem;
import com.fantasymods.fantasys_content.item.FantasysModItemGroup;
import com.fantasymods.fantasys_content.item.ExtremumSwordTool;
import com.fantasymods.fantasys_content.item.ExtremumShovelTool;
import com.fantasymods.fantasys_content.item.ExtremumPickaxeTool;
import com.fantasymods.fantasys_content.item.ExtremumIngotItem;
import com.fantasymods.fantasys_content.item.ExtremumHoeTool;
import com.fantasymods.fantasys_content.item.ExtremumAxeTool;
import com.fantasymods.fantasys_content.item.ExtremumArmorArmorMaterial;
import com.fantasymods.fantasys_content.item.ExperteniumSwordTool;
import com.fantasymods.fantasys_content.item.ExperteniumShovelTool;
import com.fantasymods.fantasys_content.item.ExperteniumPickaxeTool;
import com.fantasymods.fantasys_content.item.ExperteniumIngotItem;
import com.fantasymods.fantasys_content.item.ExperteniumHoeTool;
import com.fantasymods.fantasys_content.item.ExperteniumAxeTool;
import com.fantasymods.fantasys_content.item.ExperteniumArmorArmorMaterial;
import com.fantasymods.fantasys_content.item.Emerald_IngotArmorArmorMaterial;
import com.fantasymods.fantasys_content.item.EmeraldIngotSwordTool;
import com.fantasymods.fantasys_content.item.EmeraldIngotShovelTool;
import com.fantasymods.fantasys_content.item.EmeraldIngotPickaxeTool;
import com.fantasymods.fantasys_content.item.EmeraldIngotIngotItem;
import com.fantasymods.fantasys_content.item.EmeraldIngotHoeTool;
import com.fantasymods.fantasys_content.item.EmeraldIngotAxeTool;
import com.fantasymods.fantasys_content.item.DefinitiveToolRodItem;
import com.fantasymods.fantasys_content.item.DefinitiveSwordTool;
import com.fantasymods.fantasys_content.item.DefinitiveShovelTool;
import com.fantasymods.fantasys_content.item.DefinitivePickaxeTool;
import com.fantasymods.fantasys_content.item.DefinitiveHoeTool;
import com.fantasymods.fantasys_content.item.DefinitiveGemItem;
import com.fantasymods.fantasys_content.item.DefinitiveAxeTool;
import com.fantasymods.fantasys_content.item.DefinitiveArmorArmorMaterial;
import com.fantasymods.fantasys_content.item.DeconstructorItem;
import com.fantasymods.fantasys_content.item.BloonusSwordTool;
import com.fantasymods.fantasys_content.item.BloonusShovelTool;
import com.fantasymods.fantasys_content.item.BloonusPickaxeTool;
import com.fantasymods.fantasys_content.item.BloonusIngotItem;
import com.fantasymods.fantasys_content.item.BloonusHoeTool;
import com.fantasymods.fantasys_content.item.BloonusAxeTool;
import com.fantasymods.fantasys_content.item.BloonusArmorArmorMaterial;
import com.fantasymods.fantasys_content.item.BlackoutSwordTool;
import com.fantasymods.fantasys_content.item.BlackoutShovelTool;
import com.fantasymods.fantasys_content.item.BlackoutPickaxeTool;
import com.fantasymods.fantasys_content.item.BlackoutHoeTool;
import com.fantasymods.fantasys_content.item.BlackoutAxeTool;
import com.fantasymods.fantasys_content.item.AvanzatumSwordTool;
import com.fantasymods.fantasys_content.item.AvanzatumShovelTool;
import com.fantasymods.fantasys_content.item.AvanzatumPickaxeTool;
import com.fantasymods.fantasys_content.item.AvanzatumIngotItem;
import com.fantasymods.fantasys_content.item.AvanzatumHoeTool;
import com.fantasymods.fantasys_content.item.AvanzatumAxeTool;
import com.fantasymods.fantasys_content.item.AvanzatumArmorArmorMaterial;
import com.fantasymods.fantasys_content.item.AfterFinalGemItem;
import com.fantasymods.fantasys_content.entity.OreGuyEntity;
import com.fantasymods.fantasys_content.entity.EnderPigEntity;
import com.fantasymods.fantasys_content.block.UltimatumOreBlock;
import com.fantasymods.fantasys_content.block.UltimatumBlockBlock;
import com.fantasymods.fantasys_content.block.OPBlockBlock;
import com.fantasymods.fantasys_content.block.MaestrariumOreBlock;
import com.fantasymods.fantasys_content.block.MaestrariumBlockBlock;
import com.fantasymods.fantasys_content.block.IntermediumOreBlock;
import com.fantasymods.fantasys_content.block.IntermediumBlockBlock;
import com.fantasymods.fantasys_content.block.GreenusOreBlock;
import com.fantasymods.fantasys_content.block.GreenusBlockBlock;
import com.fantasymods.fantasys_content.block.ExtremumOreBlock;
import com.fantasymods.fantasys_content.block.ExtremumBlockBlock;
import com.fantasymods.fantasys_content.block.ExperteniumOreBlock;
import com.fantasymods.fantasys_content.block.ExperteniumBlockBlock;
import com.fantasymods.fantasys_content.block.EmeraldIngotOreBlock;
import com.fantasymods.fantasys_content.block.EmeraldIngotBlockBlock;
import com.fantasymods.fantasys_content.block.BloonusOreBlock;
import com.fantasymods.fantasys_content.block.BloonusBlockBlock;
import com.fantasymods.fantasys_content.block.AvanzatumOreBlock;
import com.fantasymods.fantasys_content.block.AvanzatumBlockBlock;
import com.fantasymods.fantasys_content.block.AfterFinalBlockBlock;

public class FantasysModMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Item GreenusIngot_ITEM = Registry.register(Registry.ITEM, id("greenus_ingot"), new GreenusIngotItem());
	public static final Item BloonusIngot_ITEM = Registry.register(Registry.ITEM, id("bloonus_ingot"), new BloonusIngotItem());
	public static final Item IntermediumIngot_ITEM = Registry.register(Registry.ITEM, id("intermedium_ingot"), new IntermediumIngotItem());
	public static final Item AvanzatumIngot_ITEM = Registry.register(Registry.ITEM, id("avanzatum_ingot"), new AvanzatumIngotItem());
	public static final Item ExperteniumIngot_ITEM = Registry.register(Registry.ITEM, id("expertenium_ingot"), new ExperteniumIngotItem());
	public static final Item MaestrariumIngot_ITEM = Registry.register(Registry.ITEM, id("maestrarium_ingot"), new MaestrariumIngotItem());
	public static final Item UltimatumIngot_ITEM = Registry.register(Registry.ITEM, id("ultimatum_ingot"), new UltimatumIngotItem());
	public static final Item ExtremumIngot_ITEM = Registry.register(Registry.ITEM, id("extremum_ingot"), new ExtremumIngotItem());
	public static final Item EmeraldIngotIngot_ITEM = Registry.register(Registry.ITEM, id("emerald_ingot_ingot"), new EmeraldIngotIngotItem());
	public static final Item Deconstructor_ITEM = Registry.register(Registry.ITEM, id("deconstructor"), new DeconstructorItem());
	public static final Item FinalGem_ITEM = Registry.register(Registry.ITEM, id("final_gem"), new FinalGemItem());
	public static final Item FinalStick_ITEM = Registry.register(Registry.ITEM, id("final_stick"), new FinalStickItem());
	public static final Item AfterFinalGem_ITEM = Registry.register(Registry.ITEM, id("after_final_gem"), new AfterFinalGemItem());
	public static final Item DefinitiveGem_ITEM = Registry.register(Registry.ITEM, id("definitive_gem"), new DefinitiveGemItem());
	public static final Item DefinitiveToolRod_ITEM = Registry.register(Registry.ITEM, id("definitive_tool_rod"), new DefinitiveToolRodItem());
	public static final ItemGroup FantasysMod = FantasysModItemGroup.get();
	public static final Block GreenusOre_BLOCK = Registry.register(Registry.BLOCK, id("greenus_ore"), new GreenusOreBlock());
	public static final BlockItem GreenusOre_ITEM = Registry.register(Registry.ITEM, id("greenus_ore"),
			new BlockItem(GreenusOre_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block GreenusBlock_BLOCK = Registry.register(Registry.BLOCK, id("greenus_block"), new GreenusBlockBlock());
	public static final BlockItem GreenusBlock_ITEM = Registry.register(Registry.ITEM, id("greenus_block"),
			new BlockItem(GreenusBlock_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block BloonusOre_BLOCK = Registry.register(Registry.BLOCK, id("bloonus_ore"), new BloonusOreBlock());
	public static final BlockItem BloonusOre_ITEM = Registry.register(Registry.ITEM, id("bloonus_ore"),
			new BlockItem(BloonusOre_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block BloonusBlock_BLOCK = Registry.register(Registry.BLOCK, id("bloonus_block"), new BloonusBlockBlock());
	public static final BlockItem BloonusBlock_ITEM = Registry.register(Registry.ITEM, id("bloonus_block"),
			new BlockItem(BloonusBlock_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block IntermediumOre_BLOCK = Registry.register(Registry.BLOCK, id("intermedium_ore"), new IntermediumOreBlock());
	public static final BlockItem IntermediumOre_ITEM = Registry.register(Registry.ITEM, id("intermedium_ore"),
			new BlockItem(IntermediumOre_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block IntermediumBlock_BLOCK = Registry.register(Registry.BLOCK, id("intermedium_block"), new IntermediumBlockBlock());
	public static final BlockItem IntermediumBlock_ITEM = Registry.register(Registry.ITEM, id("intermedium_block"),
			new BlockItem(IntermediumBlock_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block AvanzatumOre_BLOCK = Registry.register(Registry.BLOCK, id("avanzatum_ore"), new AvanzatumOreBlock());
	public static final BlockItem AvanzatumOre_ITEM = Registry.register(Registry.ITEM, id("avanzatum_ore"),
			new BlockItem(AvanzatumOre_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block AvanzatumBlock_BLOCK = Registry.register(Registry.BLOCK, id("avanzatum_block"), new AvanzatumBlockBlock());
	public static final BlockItem AvanzatumBlock_ITEM = Registry.register(Registry.ITEM, id("avanzatum_block"),
			new BlockItem(AvanzatumBlock_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block ExperteniumOre_BLOCK = Registry.register(Registry.BLOCK, id("expertenium_ore"), new ExperteniumOreBlock());
	public static final BlockItem ExperteniumOre_ITEM = Registry.register(Registry.ITEM, id("expertenium_ore"),
			new BlockItem(ExperteniumOre_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block ExperteniumBlock_BLOCK = Registry.register(Registry.BLOCK, id("expertenium_block"), new ExperteniumBlockBlock());
	public static final BlockItem ExperteniumBlock_ITEM = Registry.register(Registry.ITEM, id("expertenium_block"),
			new BlockItem(ExperteniumBlock_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block MaestrariumOre_BLOCK = Registry.register(Registry.BLOCK, id("maestrarium_ore"), new MaestrariumOreBlock());
	public static final BlockItem MaestrariumOre_ITEM = Registry.register(Registry.ITEM, id("maestrarium_ore"),
			new BlockItem(MaestrariumOre_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block MaestrariumBlock_BLOCK = Registry.register(Registry.BLOCK, id("maestrarium_block"), new MaestrariumBlockBlock());
	public static final BlockItem MaestrariumBlock_ITEM = Registry.register(Registry.ITEM, id("maestrarium_block"),
			new BlockItem(MaestrariumBlock_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block UltimatumOre_BLOCK = Registry.register(Registry.BLOCK, id("ultimatum_ore"), new UltimatumOreBlock());
	public static final BlockItem UltimatumOre_ITEM = Registry.register(Registry.ITEM, id("ultimatum_ore"),
			new BlockItem(UltimatumOre_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block UltimatumBlock_BLOCK = Registry.register(Registry.BLOCK, id("ultimatum_block"), new UltimatumBlockBlock());
	public static final BlockItem UltimatumBlock_ITEM = Registry.register(Registry.ITEM, id("ultimatum_block"),
			new BlockItem(UltimatumBlock_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block ExtremumOre_BLOCK = Registry.register(Registry.BLOCK, id("extremum_ore"), new ExtremumOreBlock());
	public static final BlockItem ExtremumOre_ITEM = Registry.register(Registry.ITEM, id("extremum_ore"),
			new BlockItem(ExtremumOre_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block ExtremumBlock_BLOCK = Registry.register(Registry.BLOCK, id("extremum_block"), new ExtremumBlockBlock());
	public static final BlockItem ExtremumBlock_ITEM = Registry.register(Registry.ITEM, id("extremum_block"),
			new BlockItem(ExtremumBlock_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block EmeraldIngotOre_BLOCK = Registry.register(Registry.BLOCK, id("emerald_ingot_ore"), new EmeraldIngotOreBlock());
	public static final BlockItem EmeraldIngotOre_ITEM = Registry.register(Registry.ITEM, id("emerald_ingot_ore"),
			new BlockItem(EmeraldIngotOre_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block EmeraldIngotBlock_BLOCK = Registry.register(Registry.BLOCK, id("emerald_ingot_block"), new EmeraldIngotBlockBlock());
	public static final BlockItem EmeraldIngotBlock_ITEM = Registry.register(Registry.ITEM, id("emerald_ingot_block"),
			new BlockItem(EmeraldIngotBlock_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block OPBlock_BLOCK = Registry.register(Registry.BLOCK, id("op_block"), new OPBlockBlock());
	public static final BlockItem OPBlock_ITEM = Registry.register(Registry.ITEM, id("op_block"),
			new BlockItem(OPBlock_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Block AfterFinalBlock_BLOCK = Registry.register(Registry.BLOCK, id("after_final_block"), new AfterFinalBlockBlock());
	public static final BlockItem AfterFinalBlock_ITEM = Registry.register(Registry.ITEM, id("after_final_block"),
			new BlockItem(AfterFinalBlock_BLOCK, new Item.Settings().group(FantasysModMod.FantasysMod)));
	public static final Item Emerald_IngotArmor_HELMET = Registry.register(Registry.ITEM, id("emerald_ingot_armor_helmet"),
			new ArmorItem(Emerald_IngotArmorArmorMaterial.EMERALD_INGOTARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item Emerald_IngotArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("emerald_ingot_armor_chestplate"),
			new ArmorItem(Emerald_IngotArmorArmorMaterial.EMERALD_INGOTARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item Emerald_IngotArmor_LEGGINGS = Registry.register(Registry.ITEM, id("emerald_ingot_armor_leggings"),
			new ArmorItem(Emerald_IngotArmorArmorMaterial.EMERALD_INGOTARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item Emerald_IngotArmor_BOOTS = Registry.register(Registry.ITEM, id("emerald_ingot_armor_boots"),
			new ArmorItem(Emerald_IngotArmorArmorMaterial.EMERALD_INGOTARMOR, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item GreenusArmor_HELMET = Registry.register(Registry.ITEM, id("greenus_armor_helmet"),
			new ArmorItem(GreenusArmorArmorMaterial.GREENUSARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item GreenusArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("greenus_armor_chestplate"),
			new ArmorItem(GreenusArmorArmorMaterial.GREENUSARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item GreenusArmor_LEGGINGS = Registry.register(Registry.ITEM, id("greenus_armor_leggings"),
			new ArmorItem(GreenusArmorArmorMaterial.GREENUSARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item GreenusArmor_BOOTS = Registry.register(Registry.ITEM, id("greenus_armor_boots"),
			new ArmorItem(GreenusArmorArmorMaterial.GREENUSARMOR, EquipmentSlot.FEET, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item BloonusArmor_HELMET = Registry.register(Registry.ITEM, id("bloonus_armor_helmet"),
			new ArmorItem(BloonusArmorArmorMaterial.BLOONUSARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item BloonusArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("bloonus_armor_chestplate"),
			new ArmorItem(BloonusArmorArmorMaterial.BLOONUSARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item BloonusArmor_LEGGINGS = Registry.register(Registry.ITEM, id("bloonus_armor_leggings"),
			new ArmorItem(BloonusArmorArmorMaterial.BLOONUSARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item BloonusArmor_BOOTS = Registry.register(Registry.ITEM, id("bloonus_armor_boots"),
			new ArmorItem(BloonusArmorArmorMaterial.BLOONUSARMOR, EquipmentSlot.FEET, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item IntermediumArmor_HELMET = Registry.register(Registry.ITEM, id("intermedium_armor_helmet"), new ArmorItem(
			IntermediumArmorArmorMaterial.INTERMEDIUMARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item IntermediumArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("intermedium_armor_chestplate"), new ArmorItem(
			IntermediumArmorArmorMaterial.INTERMEDIUMARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item IntermediumArmor_LEGGINGS = Registry.register(Registry.ITEM, id("intermedium_armor_leggings"), new ArmorItem(
			IntermediumArmorArmorMaterial.INTERMEDIUMARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item IntermediumArmor_BOOTS = Registry.register(Registry.ITEM, id("intermedium_armor_boots"), new ArmorItem(
			IntermediumArmorArmorMaterial.INTERMEDIUMARMOR, EquipmentSlot.FEET, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item AvanzatumArmor_HELMET = Registry.register(Registry.ITEM, id("avanzatum_armor_helmet"),
			new ArmorItem(AvanzatumArmorArmorMaterial.AVANZATUMARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item AvanzatumArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("avanzatum_armor_chestplate"),
			new ArmorItem(AvanzatumArmorArmorMaterial.AVANZATUMARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item AvanzatumArmor_LEGGINGS = Registry.register(Registry.ITEM, id("avanzatum_armor_leggings"),
			new ArmorItem(AvanzatumArmorArmorMaterial.AVANZATUMARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item AvanzatumArmor_BOOTS = Registry.register(Registry.ITEM, id("avanzatum_armor_boots"),
			new ArmorItem(AvanzatumArmorArmorMaterial.AVANZATUMARMOR, EquipmentSlot.FEET, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item ExperteniumArmor_HELMET = Registry.register(Registry.ITEM, id("expertenium_armor_helmet"), new ArmorItem(
			ExperteniumArmorArmorMaterial.EXPERTENIUMARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item ExperteniumArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("expertenium_armor_chestplate"), new ArmorItem(
			ExperteniumArmorArmorMaterial.EXPERTENIUMARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item ExperteniumArmor_LEGGINGS = Registry.register(Registry.ITEM, id("expertenium_armor_leggings"), new ArmorItem(
			ExperteniumArmorArmorMaterial.EXPERTENIUMARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item ExperteniumArmor_BOOTS = Registry.register(Registry.ITEM, id("expertenium_armor_boots"), new ArmorItem(
			ExperteniumArmorArmorMaterial.EXPERTENIUMARMOR, EquipmentSlot.FEET, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item MaestrariumArmor_HELMET = Registry.register(Registry.ITEM, id("maestrarium_armor_helmet"), new ArmorItem(
			MaestrariumArmorArmorMaterial.MAESTRARIUMARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item MaestrariumArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("maestrarium_armor_chestplate"), new ArmorItem(
			MaestrariumArmorArmorMaterial.MAESTRARIUMARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item MaestrariumArmor_LEGGINGS = Registry.register(Registry.ITEM, id("maestrarium_armor_leggings"), new ArmorItem(
			MaestrariumArmorArmorMaterial.MAESTRARIUMARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item MaestrariumArmor_BOOTS = Registry.register(Registry.ITEM, id("maestrarium_armor_boots"), new ArmorItem(
			MaestrariumArmorArmorMaterial.MAESTRARIUMARMOR, EquipmentSlot.FEET, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item UltimatumArmor_HELMET = Registry.register(Registry.ITEM, id("ultimatum_armor_helmet"),
			new ArmorItem(UltimatumArmorArmorMaterial.ULTIMATUMARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item UltimatumArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("ultimatum_armor_chestplate"),
			new ArmorItem(UltimatumArmorArmorMaterial.ULTIMATUMARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item UltimatumArmor_LEGGINGS = Registry.register(Registry.ITEM, id("ultimatum_armor_leggings"),
			new ArmorItem(UltimatumArmorArmorMaterial.ULTIMATUMARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item UltimatumArmor_BOOTS = Registry.register(Registry.ITEM, id("ultimatum_armor_boots"),
			new ArmorItem(UltimatumArmorArmorMaterial.ULTIMATUMARMOR, EquipmentSlot.FEET, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item ExtremumArmor_HELMET = Registry.register(Registry.ITEM, id("extremum_armor_helmet"),
			new ArmorItem(ExtremumArmorArmorMaterial.EXTREMUMARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item ExtremumArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("extremum_armor_chestplate"),
			new ArmorItem(ExtremumArmorArmorMaterial.EXTREMUMARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item ExtremumArmor_LEGGINGS = Registry.register(Registry.ITEM, id("extremum_armor_leggings"),
			new ArmorItem(ExtremumArmorArmorMaterial.EXTREMUMARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item ExtremumArmor_BOOTS = Registry.register(Registry.ITEM, id("extremum_armor_boots"),
			new ArmorItem(ExtremumArmorArmorMaterial.EXTREMUMARMOR, EquipmentSlot.FEET, (new Item.Settings().group(FantasysModMod.FantasysMod))));
	public static final Item DefinitiveArmor_HELMET = Registry.register(Registry.ITEM, id("definitive_armor_helmet"),
			new ArmorItem(DefinitiveArmorArmorMaterial.DEFINITIVEARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item DefinitiveArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("definitive_armor_chestplate"),
			new ArmorItem(DefinitiveArmorArmorMaterial.DEFINITIVEARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item DefinitiveArmor_LEGGINGS = Registry.register(Registry.ITEM, id("definitive_armor_leggings"),
			new ArmorItem(DefinitiveArmorArmorMaterial.DEFINITIVEARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item DefinitiveArmor_BOOTS = Registry.register(Registry.ITEM, id("definitive_armor_boots"),
			new ArmorItem(DefinitiveArmorArmorMaterial.DEFINITIVEARMOR, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item GreenusPickaxe_ITEM = Registry.register(Registry.ITEM, id("greenus_pickaxe"), GreenusPickaxeTool.INSTANCE);
	public static final Item GreenusAxe_ITEM = Registry.register(Registry.ITEM, id("greenus_axe"), GreenusAxeTool.INSTANCE);
	public static final Item GreenusSword_ITEM = Registry.register(Registry.ITEM, id("greenus_sword"), GreenusSwordTool.INSTANCE);
	public static final Item GreenusShovel_ITEM = Registry.register(Registry.ITEM, id("greenus_shovel"), GreenusShovelTool.INSTANCE);
	public static final Item GreenusHoe_ITEM = Registry.register(Registry.ITEM, id("greenus_hoe"), GreenusHoeTool.INSTANCE);
	public static final Item BloonusPickaxe_ITEM = Registry.register(Registry.ITEM, id("bloonus_pickaxe"), BloonusPickaxeTool.INSTANCE);
	public static final Item BloonusAxe_ITEM = Registry.register(Registry.ITEM, id("bloonus_axe"), BloonusAxeTool.INSTANCE);
	public static final Item BloonusSword_ITEM = Registry.register(Registry.ITEM, id("bloonus_sword"), BloonusSwordTool.INSTANCE);
	public static final Item BloonusShovel_ITEM = Registry.register(Registry.ITEM, id("bloonus_shovel"), BloonusShovelTool.INSTANCE);
	public static final Item BloonusHoe_ITEM = Registry.register(Registry.ITEM, id("bloonus_hoe"), BloonusHoeTool.INSTANCE);
	public static final Item IntermediumPickaxe_ITEM = Registry.register(Registry.ITEM, id("intermedium_pickaxe"), IntermediumPickaxeTool.INSTANCE);
	public static final Item IntermediumAxe_ITEM = Registry.register(Registry.ITEM, id("intermedium_axe"), IntermediumAxeTool.INSTANCE);
	public static final Item IntermediumSword_ITEM = Registry.register(Registry.ITEM, id("intermedium_sword"), IntermediumSwordTool.INSTANCE);
	public static final Item IntermediumShovel_ITEM = Registry.register(Registry.ITEM, id("intermedium_shovel"), IntermediumShovelTool.INSTANCE);
	public static final Item IntermediumHoe_ITEM = Registry.register(Registry.ITEM, id("intermedium_hoe"), IntermediumHoeTool.INSTANCE);
	public static final Item AvanzatumPickaxe_ITEM = Registry.register(Registry.ITEM, id("avanzatum_pickaxe"), AvanzatumPickaxeTool.INSTANCE);
	public static final Item AvanzatumAxe_ITEM = Registry.register(Registry.ITEM, id("avanzatum_axe"), AvanzatumAxeTool.INSTANCE);
	public static final Item AvanzatumSword_ITEM = Registry.register(Registry.ITEM, id("avanzatum_sword"), AvanzatumSwordTool.INSTANCE);
	public static final Item AvanzatumShovel_ITEM = Registry.register(Registry.ITEM, id("avanzatum_shovel"), AvanzatumShovelTool.INSTANCE);
	public static final Item AvanzatumHoe_ITEM = Registry.register(Registry.ITEM, id("avanzatum_hoe"), AvanzatumHoeTool.INSTANCE);
	public static final Item ExperteniumPickaxe_ITEM = Registry.register(Registry.ITEM, id("expertenium_pickaxe"), ExperteniumPickaxeTool.INSTANCE);
	public static final Item ExperteniumAxe_ITEM = Registry.register(Registry.ITEM, id("expertenium_axe"), ExperteniumAxeTool.INSTANCE);
	public static final Item ExperteniumSword_ITEM = Registry.register(Registry.ITEM, id("expertenium_sword"), ExperteniumSwordTool.INSTANCE);
	public static final Item ExperteniumShovel_ITEM = Registry.register(Registry.ITEM, id("expertenium_shovel"), ExperteniumShovelTool.INSTANCE);
	public static final Item ExperteniumHoe_ITEM = Registry.register(Registry.ITEM, id("expertenium_hoe"), ExperteniumHoeTool.INSTANCE);
	public static final Item MaestrariumPickaxe_ITEM = Registry.register(Registry.ITEM, id("maestrarium_pickaxe"), MaestrariumPickaxeTool.INSTANCE);
	public static final Item MaestrariumAxe_ITEM = Registry.register(Registry.ITEM, id("maestrarium_axe"), MaestrariumAxeTool.INSTANCE);
	public static final Item MaestrariumSword_ITEM = Registry.register(Registry.ITEM, id("maestrarium_sword"), MaestrariumSwordTool.INSTANCE);
	public static final Item MaestrariumShovel_ITEM = Registry.register(Registry.ITEM, id("maestrarium_shovel"), MaestrariumShovelTool.INSTANCE);
	public static final Item MaestrariumHoe_ITEM = Registry.register(Registry.ITEM, id("maestrarium_hoe"), MaestrariumHoeTool.INSTANCE);
	public static final Item UltimatumPickaxe_ITEM = Registry.register(Registry.ITEM, id("ultimatum_pickaxe"), UltimatumPickaxeTool.INSTANCE);
	public static final Item UltimatumAxe_ITEM = Registry.register(Registry.ITEM, id("ultimatum_axe"), UltimatumAxeTool.INSTANCE);
	public static final Item UltimatumSword_ITEM = Registry.register(Registry.ITEM, id("ultimatum_sword"), UltimatumSwordTool.INSTANCE);
	public static final Item UltimatumShovel_ITEM = Registry.register(Registry.ITEM, id("ultimatum_shovel"), UltimatumShovelTool.INSTANCE);
	public static final Item UltimatumHoe_ITEM = Registry.register(Registry.ITEM, id("ultimatum_hoe"), UltimatumHoeTool.INSTANCE);
	public static final Item ExtremumPickaxe_ITEM = Registry.register(Registry.ITEM, id("extremum_pickaxe"), ExtremumPickaxeTool.INSTANCE);
	public static final Item ExtremumAxe_ITEM = Registry.register(Registry.ITEM, id("extremum_axe"), ExtremumAxeTool.INSTANCE);
	public static final Item ExtremumSword_ITEM = Registry.register(Registry.ITEM, id("extremum_sword"), ExtremumSwordTool.INSTANCE);
	public static final Item ExtremumShovel_ITEM = Registry.register(Registry.ITEM, id("extremum_shovel"), ExtremumShovelTool.INSTANCE);
	public static final Item ExtremumHoe_ITEM = Registry.register(Registry.ITEM, id("extremum_hoe"), ExtremumHoeTool.INSTANCE);
	public static final Item EmeraldIngotPickaxe_ITEM = Registry.register(Registry.ITEM, id("emerald_ingot_pickaxe"),
			EmeraldIngotPickaxeTool.INSTANCE);
	public static final Item EmeraldIngotAxe_ITEM = Registry.register(Registry.ITEM, id("emerald_ingot_axe"), EmeraldIngotAxeTool.INSTANCE);
	public static final Item EmeraldIngotSword_ITEM = Registry.register(Registry.ITEM, id("emerald_ingot_sword"), EmeraldIngotSwordTool.INSTANCE);
	public static final Item EmeraldIngotShovel_ITEM = Registry.register(Registry.ITEM, id("emerald_ingot_shovel"), EmeraldIngotShovelTool.INSTANCE);
	public static final Item EmeraldIngotHoe_ITEM = Registry.register(Registry.ITEM, id("emerald_ingot_hoe"), EmeraldIngotHoeTool.INSTANCE);
	public static final Item BlackoutPickaxe_ITEM = Registry.register(Registry.ITEM, id("blackout_pickaxe"), BlackoutPickaxeTool.INSTANCE);
	public static final Item BlackoutAxe_ITEM = Registry.register(Registry.ITEM, id("blackout_axe"), BlackoutAxeTool.INSTANCE);
	public static final Item BlackoutSword_ITEM = Registry.register(Registry.ITEM, id("blackout_sword"), BlackoutSwordTool.INSTANCE);
	public static final Item BlackoutShovel_ITEM = Registry.register(Registry.ITEM, id("blackout_shovel"), BlackoutShovelTool.INSTANCE);
	public static final Item BlackoutHoe_ITEM = Registry.register(Registry.ITEM, id("blackout_hoe"), BlackoutHoeTool.INSTANCE);
	public static final Item DefinitivePickaxe_ITEM = Registry.register(Registry.ITEM, id("definitive_pickaxe"), DefinitivePickaxeTool.INSTANCE);
	public static final Item DefinitiveAxe_ITEM = Registry.register(Registry.ITEM, id("definitive_axe"), DefinitiveAxeTool.INSTANCE);
	public static final Item DefinitiveSword_ITEM = Registry.register(Registry.ITEM, id("definitive_sword"), DefinitiveSwordTool.INSTANCE);
	public static final Item DefinitiveShovel_ITEM = Registry.register(Registry.ITEM, id("definitive_shovel"), DefinitiveShovelTool.INSTANCE);
	public static final Item DefinitiveHoe_ITEM = Registry.register(Registry.ITEM, id("definitive_hoe"), DefinitiveHoeTool.INSTANCE);
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing FantasysModMod");
		OreGuyEntity.init();
		EnderPigEntity.init();
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("fantasys_mod", s);
	}
}
