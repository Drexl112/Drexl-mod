package Drexl112.First_mod.init;

import Drexl112.First_mod.items.ItemSpencerFood;
import Drexl112.First_mod.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item spencerfood;
	
	public static void init() {
		spencerfood = new ItemSpencerFood();
	}
	
	public static void register() {
		GameRegistry.register(spencerfood);
	}
	
	public static void registerRenders() {
		registerRender(spencerfood);
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
}
