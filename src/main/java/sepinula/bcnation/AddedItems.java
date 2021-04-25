package sepinula.bcnation;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.EnumHelperClient;
import sepinula.bcnation.items.*;


import java.util.ArrayList;
import java.util.List;

public class AddedItems {

    public static void BCNation(){
        registerItems();
    }

    public static List<Item> ItemList=new ArrayList<Item>();

    //Items
    public static Item GrimorioAsta;
    public static Item GrimorioYuno;
    public static Item DemonSlayer;
    public static Item DemonSlayerNPC;

    //Materials
    public static Item.ToolMaterial DemonSlayerMaterial;



    public static void registerItems(){

        //Register Materials
        DemonSlayerMaterial = EnumHelperClient.addToolMaterial("DemonSlayerMaterial", 3, -1, 5.0F, 0.0F,30);

        //Items
        ItemList.add(GrimorioAsta = new ItemGrimorioAsta().setCreativeTab(BCNation.bcnTab));
        ItemList.add(GrimorioYuno = new ItemGrimorioYuno().setCreativeTab(BCNation.bcnTab));
        ItemList.add(DemonSlayer = new ItemDemonSlayer(DemonSlayerMaterial).setCreativeTab(BCNation.bcnTab));

        //Items Npcs
        ItemList.add(DemonSlayerNPC = new ItemDemonSlayerNPC(DemonSlayerMaterial).setCreativeTab(BCNation.bcnTabNpcs));


        //Registra todos os items na lista
        for(Item Item:ItemList){
            GameRegistry.registerItem(Item, Item.getUnlocalizedName());
        }
    }
}
