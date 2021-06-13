package com.fantasymods.fantasys_content.procedures;

import net.minecraft.world.World;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.fantasymods.fantasys_content.world.EnderPigHealthGameRule;

public class EnderPigOnEntityTickUpdateProcedure {
	public static void executeProcedure(Map<String, Object> dependencies){
            if(dependencies.get("entity")==null){
                System.err.println("Failed to load dependency entity for procedure EnderPigOnEntityTickUpdate!");
                return;
            }
            if(dependencies.get("world")==null){
                System.err.println("Failed to load dependency world for procedure EnderPigOnEntityTickUpdate!");
                return;
            }
            	Entity entity = (Entity) dependencies.get("entity");
            	World world = (World) dependencies.get("world");
        if(entity instanceof LivingEntity) ((LivingEntity)entity).setHealth((float) world.getGameRules().getInt(EnderPigHealthGameRule.gamerule));
    }
}
