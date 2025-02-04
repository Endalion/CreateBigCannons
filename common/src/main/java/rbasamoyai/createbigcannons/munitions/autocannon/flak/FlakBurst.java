package rbasamoyai.createbigcannons.munitions.autocannon.flak;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import rbasamoyai.createbigcannons.CreateBigCannons;
import rbasamoyai.createbigcannons.munitions.CannonDamageSource;
import rbasamoyai.createbigcannons.munitions.big_cannon.shrapnel.ShrapnelBurst;

public class FlakBurst extends ShrapnelBurst {

	public FlakBurst(EntityType<? extends FlakBurst> entityType, Level level) { super(entityType, level); }

	@Override
	protected DamageSource getDamageSource() {
		return new CannonDamageSource(CreateBigCannons.MOD_ID + ".flak", this, null, this.getProperties().damage().ignoresEntityArmor());
	}

}
