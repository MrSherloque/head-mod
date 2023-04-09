package net.head.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;

public class heads implements ModInitializer {

    public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("heads", "fabric_item"), FABRIC_ITEM);
	}

}