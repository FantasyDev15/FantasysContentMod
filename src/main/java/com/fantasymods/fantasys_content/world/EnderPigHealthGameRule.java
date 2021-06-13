
package com.fantasymods.fantasys_content.world;

import net.minecraft.world.GameRules;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;

public class EnderPigHealthGameRule {
	public static final GameRules.Key<GameRules.IntRule> gamerule = GameRuleRegistry.register("enderPigHealth", GameRules.Category.MOBS,
			GameRuleFactory.createIntRule(60));
}
