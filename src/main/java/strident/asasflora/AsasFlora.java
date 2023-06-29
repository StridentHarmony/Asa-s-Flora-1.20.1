package strident.asasflora;

import net.fabricmc.api.ModInitializer;
import strident.asasflora.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsasFlora implements ModInitializer {
	public static final String MOD_ID = "asas-flora";
    public static final Logger LOGGER = LoggerFactory.getLogger("asas-flora");

	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();
	}
}