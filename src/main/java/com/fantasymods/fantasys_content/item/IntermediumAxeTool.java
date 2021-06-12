
package com.fantasymods.fantasys_content.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.fantasymods.fantasys_content.FantasysModMod;

public class IntermediumAxeTool {
	public static final ToolMaterial INTERMEDIUMAXE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 902;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 10F;
		}

		@Override
		public float getAttackDamage() {
			return 21F;
		}

		@Override
		public int getMiningLevel() {
			return 5;
		}

		@Override
		public int getEnchantability() {
			return 35;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(FantasysModMod.IntermediumIngot_ITEM);
		}
	};
	public static final Item INSTANCE = new AxeItem(INTERMEDIUMAXE_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(FantasysModMod.FantasysMod))) {
	};
}
