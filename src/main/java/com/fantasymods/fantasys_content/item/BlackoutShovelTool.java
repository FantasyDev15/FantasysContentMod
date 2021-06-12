
package com.fantasymods.fantasys_content.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.fantasymods.fantasys_content.FantasysModMod;

public class BlackoutShovelTool {
	public static final ToolMaterial BLACKOUTSHOVEL_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 6280;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 24F;
		}

		@Override
		public float getAttackDamage() {
			return 18F;
		}

		@Override
		public int getMiningLevel() {
			return 20;
		}

		@Override
		public int getEnchantability() {
			return 140;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(FantasysModMod.FinalGem_ITEM);
		}
	};
	public static final Item INSTANCE = new ShovelItem(BLACKOUTSHOVEL_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(ItemGroup.TOOLS))) {
	};
}
