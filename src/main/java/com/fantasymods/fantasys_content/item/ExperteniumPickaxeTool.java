
package com.fantasymods.fantasys_content.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.fantasymods.fantasys_content.FantasysModMod;

public class ExperteniumPickaxeTool {
	public static final ToolMaterial EXPERTENIUMPICKAXE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 1274;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 12F;
		}

		@Override
		public float getAttackDamage() {
			return 4F;
		}

		@Override
		public int getMiningLevel() {
			return 6;
		}

		@Override
		public int getEnchantability() {
			return 45;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(FantasysModMod.ExperteniumIngot_ITEM);
		}
	};
	public static final Item INSTANCE = new PickaxeItem(EXPERTENIUMPICKAXE_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(FantasysModMod.FantasysMod))) {
	};
}
