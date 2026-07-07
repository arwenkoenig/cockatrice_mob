// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Cockatrice_01<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "cockatrice_01"), "main");
	private final ModelPart tail;
	private final ModelPart head;
	private final ModelPart wings;
	private final ModelPart legs;
	private final ModelPart bb_main;

	public Cockatrice_01(ModelPart root) {
		this.tail = root.getChild("tail");
		this.head = root.getChild("head");
		this.wings = root.getChild("wings");
		this.legs = root.getChild("legs");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(34, 14).addBox(-1.0F, -6.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 14.0F, 8.0F));

		PartDefinition tail_frill_r1 = tail.addOrReplaceChild("tail_frill_r1", CubeListBuilder.create().texOffs(34, 22).addBox(-1.0F, -2.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(30, 8).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-3.0F, -7.0F, 1.0F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 33).addBox(0.0F, -9.0F, 2.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 34).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, -7.0F));

		PartDefinition wings = partdefinition.addOrReplaceChild("wings", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -4.0F, -11.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(30, 1).addBox(-1.0F, -4.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 18).addBox(-11.0F, -4.0F, -11.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(30, 1).mirror().addBox(-11.0F, -4.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.0F, 17.0F, 8.0F));

		PartDefinition legs = partdefinition.addOrReplaceChild("legs", CubeListBuilder.create().texOffs(31, 37).addBox(0.0F, -6.0F, 1.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(30, 33).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(31, 37).addBox(-5.0F, -6.0F, 1.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(30, 33).addBox(-6.0F, 0.0F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 24.0F, 1.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wings.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}