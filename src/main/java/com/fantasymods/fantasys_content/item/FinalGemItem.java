
package com.fantasymods.fantasys_content.item;

import net.minecraft.util.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import com.fantasymods.fantasys_content.FantasysModMod;

public class FinalGemItem extends Item {
	public FinalGemItem() {
		super(new FabricItemSettings().group(FantasysModMod.FantasysMod).maxDamage(10).rarity(Rarity.EPIC));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
		return (float) (1F);
	}

	@Environment(EnvType.CLIENT)
	@Override
	public boolean hasGlint(ItemStack stack) {
		return true;
	}

	@Override
	public int getEnchantability() {
		return 0;
	}
}
