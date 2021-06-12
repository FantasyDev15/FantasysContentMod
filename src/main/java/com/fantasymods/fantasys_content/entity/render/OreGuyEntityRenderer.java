
package com.fantasymods.fantasys_content.entity.render;

import net.minecraft.util.Identifier;
import net.minecraft.client.render.entity.model.ChickenEntityModel;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

import com.fantasymods.fantasys_content.entity.OreGuyEntity;

public class OreGuyEntityRenderer extends MobEntityRenderer<OreGuyEntity, ChickenEntityModel<OreGuyEntity>> {
	public OreGuyEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new ChickenEntityModel<>(), 0.5f);
	}

	public static void clientInit() {
		EntityRendererRegistry.INSTANCE.register(OreGuyEntity.ENTITY, (dispatcher, context) -> new OreGuyEntityRenderer(dispatcher));
	}

	@Override
	public Identifier getTexture(OreGuyEntity entity) {
		return new Identifier("fantasys_mod:textures/chicken.png");
	}
}
