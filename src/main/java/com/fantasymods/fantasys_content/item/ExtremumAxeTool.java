
package com.fantasymods.fantasys_content.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.fantasymods.fantasys_content.FantasysModMod;

public class ExtremumAxeTool {
	public static final ToolMaterial EXTREMUMAXE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 2380;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 16F;
		}

		@Override
		public float getAttackDamage() {
			return 43F;
		}

		@Override
		public int getMiningLevel() {
			return 10;
		}

		@Override
		public int getEnchantability() {
			return 70;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(FantasysModMod.ExtremumIngot_ITEM);
		}
	};
	public static final Item INSTANCE = new AxeItem(EXTREMUMAXE_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(FantasysModMod.FantasysMod))) {
	};
}
