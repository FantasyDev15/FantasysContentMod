
package com.fantasymods.fantasys_content.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.fantasymods.fantasys_content.FantasysModMod;

public class BloonusAxeTool {
	public static final ToolMaterial BLOONUSAXE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 660;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 9F;
		}

		@Override
		public float getAttackDamage() {
			return 16F;
		}

		@Override
		public int getMiningLevel() {
			return 4;
		}

		@Override
		public int getEnchantability() {
			return 28;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(FantasysModMod.BloonusIngot_ITEM);
		}
	};
	public static final Item INSTANCE = new AxeItem(BLOONUSAXE_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(FantasysModMod.FantasysMod))) {
	};
}
