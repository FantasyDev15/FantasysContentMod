
package com.fantasymods.fantasys_content.item;

import net.minecraft.util.Lazy;
import net.minecraft.sound.SoundEvent;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.entity.EquipmentSlot;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.function.Supplier;

import com.fantasymods.fantasys_content.FantasysModMod;

public class GreenusArmorArmorMaterial implements ArmorMaterial {
	public static final GreenusArmorArmorMaterial GREENUSARMOR = new GreenusArmorArmorMaterial("greenus", 15, new int[]{2, 6, 5, 2}, 9, null, 0F, 0F,
			() -> {
				return Ingredient.ofItems(FantasysModMod.GreenusIngot_ITEM);
			});
	private static final int[] BASE_DURABILITY = {13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorValues;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Lazy<Ingredient> repairIngredient;
	GreenusArmorArmorMaterial(String name, int durabilityMultiplier, int[] armorValueArr, int enchantability, SoundEvent soundEvent, float toughness,
			float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorValues = armorValueArr;
		this.enchantability = enchantability;
		this.equipSound = soundEvent;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = new Lazy(repairIngredient);
	}

	public int getDurability(EquipmentSlot equipmentSlot_1) {
		return BASE_DURABILITY[equipmentSlot_1.getEntitySlotId()] * this.durabilityMultiplier;
	}

	public int getProtectionAmount(EquipmentSlot equipmentSlot_1) {
		return this.armorValues[equipmentSlot_1.getEntitySlotId()];
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}

	@Environment(EnvType.CLIENT)
	public String getName() {
		return this.name;
	}

	public float getToughness() {
		return this.toughness;
	}

	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
