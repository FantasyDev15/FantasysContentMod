
package com.fantasymods.fantasys_content.item;

import net.minecraft.util.Identifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import com.fantasymods.fantasys_content.FantasysModMod;

public final class FantasysModItemGroup {
	public static ItemGroup get() {
		return ITEM_GROUP;
	}
	private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("fantasys_mod", "fantasys_mod")).icon(() -> {
		return new ItemStack(FantasysModMod.GreenusIngot_ITEM);
	}).build();
}
