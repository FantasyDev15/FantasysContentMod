
package com.fantasymods.fantasys_content.block;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import java.util.List;
import java.util.Collections;

public class AfterFinalBlockBlock extends Block {
	public AfterFinalBlockBlock() {
		super(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.ANVIL).strength(2.8f, 10.5f).luminance(0).velocityMultiplier(1.1f));
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
