
package com.fantasymods.fantasys_content.block;

import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.text.Text;
import net.minecraft.text.LiteralText;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.block.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class OPBlockBlock extends Block {
	private static boolean always(BlockState state, BlockView world, BlockPos pos) {
		return true;
	}

	public OPBlockBlock() {
		super(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.ANCIENT_DEBRIS).strength(2.1999999999999997F, 11.5F).luminance(8)
				.breakByTool(FabricToolTags.PICKAXES, 7).requiresTool().emissiveLighting(OPBlockBlock::always)
				.velocityMultiplier(1.2000000000000002f));
	}

	@Override
	@Environment(EnvType.CLIENT)
	public void appendTooltip(ItemStack stack, BlockView world, List<Text> tooltip, TooltipContext options) {
		tooltip.add(new LiteralText("That OP block that the"));
		tooltip.add(new LiteralText("speedrunners put in their"));
		tooltip.add(new LiteralText("videos like wth."));
	}

	@Override
	public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
		return true;
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
