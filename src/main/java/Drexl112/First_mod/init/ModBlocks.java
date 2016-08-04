package Drexl112.First_mod.init;

import Drexl112.First_mod.blocks.BlockSpencerblock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block spencerblock;

	public static void init() {
		spencerblock = new BlockSpencerblock();
}

public static void register() {
	registerBlock(spencerblock);
}

private static void registerBlock(Block block) {
	GameRegistry.register(block);
	ItemBlock item = new ItemBlock(block);
	item.setRegistryName(block.getRegistryName());
	GameRegistry.register(item);
}

public static void registerRenders() {
	registerRender(spencerblock);
}

private static void registerRender(Block block) {
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	
}
}
