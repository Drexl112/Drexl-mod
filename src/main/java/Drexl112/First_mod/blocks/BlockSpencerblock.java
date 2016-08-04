package Drexl112.First_mod.blocks;

import Drexl112.First_mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSpencerblock extends Block {

	public BlockSpencerblock() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.FirstBlocks.spencerblock.getUnlocalizedName());
		setRegistryName(Reference.FirstBlocks.spencerblock.getRegistryName());
	}

}

