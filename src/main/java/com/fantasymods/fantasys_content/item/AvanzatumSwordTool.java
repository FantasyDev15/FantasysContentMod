
package com.fantasymods.fantasys_content.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.fantasymods.fantasys_content.FantasysModMod;

public class AvanzatumSwordTool {
	public static final ToolMaterial AVANZATUMSWORD_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 1110;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 11F;
		}

		@Override
		public float getAttackDamage() {
			return 15F;
		}

		@Override
		public int getMiningLevel() {
			return 6;
		}

		@Override
		public int getEnchantability() {
			return 41;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(FantasysModMod.AvanzatumIngot_ITEM);
		}
	};
	public static final Item INSTANCE = new SwordItem(AVANZATUMSWORD_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(FantasysModMod.FantasysMod))) {
	};
}
