
package com.fantasymods.fantasys_content.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.fantasymods.fantasys_content.FantasysModMod;

public class EmeraldIngotAxeTool {
	public static final ToolMaterial EMERALDINGOTAXE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 400;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 7F;
		}

		@Override
		public float getAttackDamage() {
			return 11F;
		}

		@Override
		public int getMiningLevel() {
			return 3;
		}

		@Override
		public int getEnchantability() {
			return 20;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(FantasysModMod.EmeraldIngotIngot_ITEM);
		}
	};
	public static final Item INSTANCE = new AxeItem(EMERALDINGOTAXE_TOOL_MATERIAL, 0, (float) -3, (new FabricItemSettings().group(ItemGroup.TOOLS))) {
	};
}
