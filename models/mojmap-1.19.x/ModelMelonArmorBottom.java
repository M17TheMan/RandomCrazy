// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMelonArmorBottom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "melonarmorbottom"), "main");
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;
	private final ModelPart rightBoot;
	private final ModelPart leftBoot;

	public ModelMelonArmorBottom(ModelPart root) {
		this.rightLeg = root.getChild("rightLeg");
		this.leftLeg = root.getChild("leftLeg");
		this.rightBoot = root.getChild("rightBoot");
		this.leftBoot = root.getChild("leftBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition rightBoot = partdefinition.addOrReplaceChild("rightBoot",
				CubeListBuilder.create().texOffs(42, 22)
						.addBox(-3.0F, 8.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(48, 17)
						.addBox(-3.0F, 10.0F, -5.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition RightLegLayer_r1 = rightBoot.addOrReplaceChild("RightLegLayer_r1",
				CubeListBuilder.create().texOffs(50, 15).addBox(-6.9F, 0.0F, -1.0F, 5.0F, 0.0F, 1.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(3.9F, 8.0F, -3.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition leftBoot = partdefinition.addOrReplaceChild("leftBoot",
				CubeListBuilder.create().texOffs(42, 22).mirror()
						.addBox(-2.0F, 8.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false)
						.texOffs(48, 17).mirror()
						.addBox(-2.0F, 10.0F, -5.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.25F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LeftLegLayer_r1 = leftBoot.addOrReplaceChild("LeftLegLayer_r1",
				CubeListBuilder.create().texOffs(50, 15).mirror()
						.addBox(-2.1F, 0.0F, -1.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.25F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, 8.0F, -3.0F, -0.9599F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}