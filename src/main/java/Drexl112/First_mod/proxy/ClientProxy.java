package Drexl112.First_mod.proxy;

import Drexl112.First_mod.init.ModBlocks;
import Drexl112.First_mod.init.ModItems;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy implements CommonProxy {
	
	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}
	}
