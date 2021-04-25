package sepinula.bcnation.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import sepinula.bcnation.BCNation;

public class TMEntity {

    public static void BCNation(){
        registerEntity();
    }

    public static void registerEntity(){
        createEntity(EntityJavalim.class, "Javalim", 0xEC4545, 0x001EFF);
        createEntity(EntityNero.class, "Nero", 0xEC4545, 0x001EFF);
    }

    public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
        int randomId = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, BCNation.instance, 32, 1, true);
        createEgg(randomId, solidColor, spotColor);
    }

    private static void createEgg(int randomId, int solidColor, int spotColor) {
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
    }
}

