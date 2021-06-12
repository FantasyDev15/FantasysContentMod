
package com.fantasymods.fantasys_content.entity.render;

import net.minecraft.util.Identifier;
import net.minecraft.client.render.entity.model.PigEntityModel;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

import com.fantasymods.fantasys_content.entity.EnderPigEntity;

public class EnderPigEntityRenderer extends MobEntityRenderer<EnderPigEntity, PigEntityModel<EnderPigEntity>> {
	public EnderPigEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new PigEntityModel<>(), 0.5f);
	}

	public static void clientInit() {
		EntityRendererRegistry.INSTANCE.register(EnderPigEntity.ENTITY, (dispatcher, context) -> new EnderPigEntityRenderer(dispatcher));
	}

	@Override
	public Identifier getTexture(EnderPigEntity entity) {
		return new Identifier("fantasys_mod:textures/ender_domuz.png");
	}
}
