
package com.fantasymods.fantasys_content.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.fantasymods.fantasys_content.FantasysModMod;

public class DefinitiveAxeTool {
	public static final ToolMaterial DEFINITIVEAXE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 10000;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 27.5F;
		}

		@Override
		public float getAttackDamage() {
			return 103F;
		}

		@Override
		public int getMiningLevel() {
			return 21;
		}

		@Override
		public int getEnchantability() {
			return 147;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(FantasysModMod.DefinitiveGem_ITEM);
		}
	};
	public static final Item INSTANCE = new AxeItem(DEFINITIVEAXE_TOOL_MATERIAL, 0, (float) -2.4,
			(new FabricItemSettings().group(ItemGroup.TOOLS).fireproof())) {
	};
}
