package net.surpriseface.randomcrazymod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMelonArmorTop<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("randomcrazymod", "model_melon_armor_top"), "main");
	public final ModelPart melonHelm;
	public final ModelPart body;
	public final ModelPart leftArm;
	public final ModelPart rightArm;

	public ModelMelonArmorTop(ModelPart root) {
		this.melonHelm = root.getChild("melonHelm");
		this.body = root.getChild("body");
		this.leftArm = root.getChild("leftArm");
		this.rightArm = root.getChild("rightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition melonHelm = partdefinition.addOrReplaceChild("melonHelm", CubeListBuilder.create(), PartPose.offset(-4.8F, 0.0F, 9.4F));
		PartDefinition cube_r1 = melonHelm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(28, 0).addBox(-4.0F, -3.0F, -5.9F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(34, 0).addBox(-3.0F, -4.0F, -4.9F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-5.0F, -2.0F, -6.9F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(16, 0).addBox(-6.0F, -1.0F, -7.9F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -8.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bottom = melonHelm.addOrReplaceChild("bottom", CubeListBuilder.create(), PartPose.offset(-4.0F, -8.0F, 0.0F));
		PartDefinition cube_r2 = bottom.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(27, 20).addBox(0.4F, 0.0F, -4.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9F, 8.0F, -3.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r3 = bottom.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(47, 20).addBox(0.2654F, -9.0F, 5.7263F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9F, 8.0F, -3.0F, -1.7279F, 1.1781F, -1.5708F));
		PartDefinition cube_r4 = bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 20).addBox(0.2654F, -9.0F, -3.672F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9F, 8.0F, -3.0F, -1.4312F, 1.1781F, -1.5708F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 14).addBox(-4.0F, -0.1F, -2.4F, 8.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.6F, 0.0F, 9.1F));
		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm",
				CubeListBuilder.create().texOffs(52, 16).mirror().addBox(-4.5F, -2.0F, 1.7F, 5.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 15).mirror()
						.addBox(-4.5F, -2.0F, -0.3F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 15).mirror().addBox(-4.5F, -2.0F, -2.3F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-8.9F, 2.0F, 9.0F));
		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(50, 15).addBox(-0.6F, -2.0F, -2.7F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 16)
				.addBox(-0.6F, -2.0F, 1.3F, 5.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 15).addBox(-0.6F, -2.0F, -0.7F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 9.4F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		melonHelm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.melonHelm.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.melonHelm.xRot = headPitch / (180F / (float) Math.PI);
		this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
