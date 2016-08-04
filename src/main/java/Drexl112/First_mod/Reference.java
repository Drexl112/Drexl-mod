package Drexl112.First_mod;

import net.minecraft.item.ItemStack;

public class Reference {
	
	public static final String MOD_ID ="dfm";
    public static final String NAME = "Drexls First Mod";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSIONS = "[1.9.4]";
    
    public static final String CLIENT_PROXY_CLASS ="Drexl112.First_mod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS ="Drexl112.First_mod.proxy.ServerProxy";
    
    public static enum FirstItems {
    	SPENCERFOOD("spencerfood", "ItemSpencerFood");
    	
    	private String unlocalizedName;
    	private String registryName;
    	
    	FirstItems(String unlocalizedName, String registryName) {
    		this.unlocalizedName = unlocalizedName;
    		this.registryName = registryName;
    	}
    	
    	public String getUnlocalizedName() {
			return unlocalizedName;
		}
    	
    	public String getRegistryName() {
			return registryName;
		}
    }
    public static enum FirstBlocks {
    	spencerblock("spencerblock", "BlockSpencerBlock");
    	
    	private String unlocalizedName;
    	private String registryName;
    	
    	FirstBlocks(String unlocalizedName, String registryName) {
    		this.unlocalizedName = unlocalizedName;
    		this.registryName = registryName;
    	}
    	
    	public String getUnlocalizedName() {
			return unlocalizedName;
		}
    	
    	public String getRegistryName() {
			return registryName;
		}
    }
   }
 

