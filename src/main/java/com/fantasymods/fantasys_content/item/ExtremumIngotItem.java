
package com.fantasymods.fantasys_content.item;

import net.minecraft.util.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import com.fantasymods.fantasys_content.FantasysModMod;

public class ExtremumIngotItem extends Item {
	public ExtremumIngotItem() {
		super(new FabricItemSettings().group(FantasysModMod.FantasysMod).maxCount(64).rarity(Rarity.EPIC));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
		return (float) (1F);
	}

	@Override
	public int getEnchantability() {
		return 0;
	}
}
