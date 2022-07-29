package rbasamoyai.createbigcannons.config;

import com.simibubi.create.foundation.config.ConfigBase;

public class CBCCfgCannons extends ConfigBase {

	public final ConfigInt maxCannonLength = i(64, 3, "maxCannonLength", Comments.maxCannonLength);
	public final ConfigFloat powderChargeSpread = f(2.0f, 0.0f, "powderChargeSpread", Comments.powderChargeSpread);
	public final ConfigFloat barrelSpreadReduction = f(1.0f, 0.0f, "barrelSpreadReduction", Comments.barrelSpreadReduction);
	public final ConfigInt slidingBreechStrength = i(4, 0, "slidingBreechStrength", Comments.slidingBreechStrength);
	public final ConfigBool cannonsBlocksAreAttached = b(true, "cannonsBlocksAreAttached", Comments.cannonBlocksAreAttached);
	
	public CBCCfgCannons() {
		super();
	}
	
	@Override public String getName() { return "cannons"; }
	
	private static class Comments {
		static String maxCannonLength = "Maximum length of cannons that can be built.";
		static String powderChargeSpread = "How much each Powder Charges used affects the spread of a fired projectile.";
		static String barrelSpreadReduction = "How much each cannon barrel reduces the spread of a fired projectile passing through.";
		static String slidingBreechStrength = "Maximum amount of Powder Charges that sliding breech blocks can safely handle.";
		static String cannonBlocksAreAttached = "If cannon blocks should be attached to each other. When pushed, attached cannon blocks will move together.";
	}

}
