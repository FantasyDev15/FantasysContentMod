
package com.fantasymods.fantasys_content.item;

import net.minecraft.world.World;
import net.minecraft.util.Rarity;
import net.minecraft.text.Text;
import net.minecraft.text.LiteralText;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

import com.fantasymods.fantasys_content.FantasysModMod;

public class DefinitiveToolRodItem extends Item {
	public DefinitiveToolRodItem() {
		super(new FabricItemSettings().group(FantasysModMod.FantasysMod).maxCount(64).fireproof().rarity(Rarity.EPIC));
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
	@Environment(EnvType.CLIENT)
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		tooltip.add(new LiteralText("WHAT THE HELL IS WRONG"));
	}

	@Override
	public int getEnchantability() {
		return 0;
	}
}
