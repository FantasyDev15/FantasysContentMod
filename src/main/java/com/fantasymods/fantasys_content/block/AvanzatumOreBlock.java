
package com.fantasymods.fantasys_content.block;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import java.util.List;
import java.util.Collections;

import com.fantasymods.fantasys_content.FantasysModMod;

public class AvanzatumOreBlock extends Block {
	public AvanzatumOreBlock() {
		super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(18F, 20.96481356314738F).luminance(0)
				.breakByTool(FabricToolTags.PICKAXES, 12).requiresTool());
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(FantasysModMod.AvanzatumIngot_ITEM));
	}
}