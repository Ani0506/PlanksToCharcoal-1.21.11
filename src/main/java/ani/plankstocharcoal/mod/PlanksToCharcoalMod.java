package ani.plankstocharcoal.mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlanksToCharcoalMod implements ModInitializer {
	public static final String MOD_ID = "planks-to-charcoal-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("PlanksToCharcoal Mod Initialized!");
	}
}