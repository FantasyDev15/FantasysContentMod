
package com.fantasymods.fantasys_content.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.HoeItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.fantasymods.fantasys_content.FantasysModMod;

public class MaestrariumHoeTool {
	public static final ToolMaterial MAESTRARIUMHOE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 1561;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 13F;
		}

		@Override
		public float getAttackDamage() {
			return 5F;
		}

		@Override
		public int getMiningLevel() {
			return 7;
		}

		@Override
		public int getEnchantability() {
			return 52;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(FantasysModMod.MaestrariumIngot_ITEM);
		}
	};
	public static final Item INSTANCE = new HoeItem(MAESTRARIUMHOE_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(FantasysModMod.FantasysMod))) {
	};
}
