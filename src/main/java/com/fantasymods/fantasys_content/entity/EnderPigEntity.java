
package com.fantasymods.fantasys_content.entity;

import org.jetbrains.annotations.Nullable;

import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.World;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.Identifier;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundEvent;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.DyeItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.entity.ai.goal.AttackWithOwnerGoal;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.Entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import com.fantasymods.fantasys_content.FantasysModMod;

@SuppressWarnings("deprecation")
public class EnderPigEntity extends TameableEntity {
	public static final EntityType<EnderPigEntity> ENTITY = Registry.register(Registry.ENTITY_TYPE, FantasysModMod.id("ender_pig"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EnderPigEntity::new).dimensions(EntityDimensions.fixed(0.9f, 0.9f)).fireImmune()
					.trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
	protected EnderPigEntity(EntityType<? extends EnderPigEntity> entityType, World world) {
		super(entityType, world);
		this.setAiDisabled(false);
		this.experiencePoints = 0;
	}

	public static void init() {
		FabricDefaultAttributeRegistry.register(ENTITY,
				EnderPigEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 60).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3)
						.add(EntityAttributes.GENERIC_ARMOR, 0).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 8)
						.add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 0.7999999999999999));
		Registry.register(Registry.ITEM, FantasysModMod.id("ender_pig_spawn_egg"),
				new SpawnEggItem(ENTITY, -16777216, -39220, new FabricItemSettings().group(FantasysModMod.FantasysMod)));
		BiomeModifications.create(new Identifier("fantasys_mod", "enderpig_entity_spawn")).add(ModificationPhase.ADDITIONS, BiomeSelectors.all(),
				ctx -> ctx.getSpawnSettings().addSpawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ENTITY, 14, 3, 6)));
	}

	@Override
	protected void initGoals() {
		super.initGoals();
		this.goalSelector.add(1, new FollowOwnerGoal(this, 1, (float) 10, (float) 2, false));
		this.goalSelector.add(2, new WanderAroundGoal(this, 1));
		this.goalSelector.add(3, new TrackOwnerAttackerGoal(this));
		this.goalSelector.add(4, new AttackWithOwnerGoal(this));
		this.goalSelector.add(5, new LookAroundGoal(this));
		this.goalSelector.add(6, new SwimGoal(this));
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return null;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.ENTITY_GENERIC_HURT;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_GENERIC_DEATH;
	}

	@Override
	public void travel(Vec3d dir) {
		Entity entity = this.getPassengerList().isEmpty() ? null : (Entity) this.getPassengerList().get(0);
		if (this.hasPlayerRider()) {
			this.yaw = entity.yaw;
			this.prevYaw = this.yaw;
			this.pitch = entity.pitch * 0.5F;
			this.setRotation(this.yaw, this.pitch);
			this.flyingSpeed = this.getMovementSpeed() * 0.15F;
			this.bodyYaw = entity.yaw;
			this.headYaw = entity.yaw;
			this.stepHeight = 1.0F;
			if (entity instanceof LivingEntity) {
				this.setMovementSpeed((float) this.getAttributeValue(EntityAttributes.GENERIC_MOVEMENT_SPEED));
				float forward = ((LivingEntity) entity).forwardSpeed;
				float strafe = 0;
				super.travel(new Vec3d(strafe, 0, forward));
			}
			this.prevHorizontalSpeed = this.horizontalSpeed;
			double d1 = this.getX() - this.prevX;
			double d0 = this.getZ() - this.prevZ;
			float f1 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;
			if (f1 > 1.0F)
				f1 = 1.0F;
			this.horizontalSpeed += (f1 - this.horizontalSpeed) * 0.4F;
			this.limbAngle += this.horizontalSpeed;
			return;
		}
		this.stepHeight = 0.5F;
		this.flyingSpeed = 0.02F;
		super.travel(dir);
	}

	@Override
	public boolean damage(DamageSource source, float amount) {
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.LIGHTNING_BOLT)
			return false;
		if (source.isExplosive())
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getName().equals("witherSkull"))
			return false;
		return super.damage(source, amount);
	}

	@Override
	public ActionResult interactMob(PlayerEntity sourceentity, Hand hand) {
		ItemStack itemstack = sourceentity.getStackInHand(hand);
		ActionResult retval = ActionResult.success(this.world.isClient);
		Item item = itemstack.getItem();
		if (this.world.isClient) {
			if (this.isTamed() && this.isOwner(sourceentity)) {
				return ActionResult.SUCCESS;
			} else {
				return !this.isBreedingItem(itemstack) || !(this.getHealth() < this.getMaxHealth()) && this.isTamed()
						? ActionResult.PASS
						: ActionResult.SUCCESS;
			}
		} else {
			if (this.isTamed()) {
				if (this.isOwner(sourceentity)) {
					if (!(item instanceof DyeItem)) {
						if (item.isFood() && this.isBreedingItem(itemstack) && this.getHealth() < this.getMaxHealth()) {
							this.eat(sourceentity, itemstack);
							this.heal((float) item.getFoodComponent().getHunger());
							return ActionResult.CONSUME;
						}
						retval = super.interactMob(sourceentity, hand);
						if (!retval.isAccepted() || this.isBaby()) {
							this.setSitting(!this.isSitting());
						}
						return retval;
					}
				}
			} else if (this.isBreedingItem(itemstack)) {
				this.eat(sourceentity, itemstack);
				if (this.random.nextInt(3) == 0) {
					this.setOwner(sourceentity);
					this.setSitting(true);
					this.world.sendEntityStatus(this, (byte) 7);
				} else {
					this.world.sendEntityStatus(this, (byte) 6);
				}
				this.setPersistent();
				return ActionResult.CONSUME;
			}
			retval = super.interactMob(sourceentity, hand);
			if (retval.isAccepted()) {
				this.setPersistent();
			}
		}
		sourceentity.startRiding(this);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		return retval;
	}

	@Override
	public boolean isBreedingItem(ItemStack stack) {
		if (stack == null)
			return false;
		if (FantasysModMod.BloonusIngot_ITEM.asItem() == stack.getItem())
			return true;
		return false;
	}

	@Override
	public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
		return ENTITY.create(world);
	}
}
