package sepinula.bcnation;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.Logger;
import sepinula.bcnation.creativetabs.TabBCNation;
import sepinula.bcnation.creativetabs.TabBCNationNpcs;
import sepinula.bcnation.lib.Reference;
import sepinula.bcnation.proxies.CommonProxy;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER)
public class BCNation {

    @Mod.Instance
    public static BCNation instance;

    @SidedProxy(clientSide ="sepinula.bcnation.proxies.ClientProxy", serverSide ="sepinula.bcnation.proxies.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs bcnTab = new TabBCNation(CreativeTabs.getNextID(), "bcnTab");
    public static CreativeTabs bcnTabNpcs = new TabBCNationNpcs(CreativeTabs.getNextID(), "bcnTabNpcs");

    public static Logger Log = FMLLog.getLogger();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        AddedItems.registerItems();
        AddedBlocks.registerBlocks();
        proxy.registerRenders();
        Log.info("Mod PreInit");
    }

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event){
        Log.info("Mod Init");
        proxy.registerRenders();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        Log.info("Mod postInit");
    }

}
