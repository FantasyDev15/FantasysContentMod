
package com.fantasymods.fantasys_content.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.fantasymods.fantasys_content.FantasysModMod;

public class UltimatumPickaxeTool {
	public static final ToolMaterial ULTIMATUMPICKAXE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 1864;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 14F;
		}

		@Override
		public float getAttackDamage() {
			return 6F;
		}

		@Override
		public int getMiningLevel() {
			return 8;
		}

		@Override
		public int getEnchantability() {
			return 59;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(FantasysModMod.UltimatumIngot_ITEM);
		}
	};
	public static final Item INSTANCE = new PickaxeItem(ULTIMATUMPICKAXE_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(FantasysModMod.FantasysMod))) {
	};
}
