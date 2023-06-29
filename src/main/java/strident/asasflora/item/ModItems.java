package strident.asasflora.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import strident.asasflora.AsasFlora;

public class ModItems {
    public static final Item SPIDER_LILY = registerItem("spider_lily", new Item(new FabricItemSettings()));

    private static Item  registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AsasFlora.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        AsasFlora.LOGGER.debug("Registering mod items for " + AsasFlora.MOD_ID);
    }
}
