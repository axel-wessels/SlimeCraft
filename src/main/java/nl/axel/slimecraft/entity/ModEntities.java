package nl.axel.slimecraft.entity;

import nl.axel.slimecraft.SlimeCraft;
import nl.axel.slimecraft.entity.slimes.SlimeIron;
import nl.axel.slimecraft.util.Names;
import net.minecraftforge.fml.common.registry.EntityRegistry;


public class ModEntities {

    public static void init(){
        int id = 0;

        EntityRegistry.registerModEntity(Names.IRON_SLIME_REGISTRY, SlimeIron.class, Names.IRON_SLIME, id++, SlimeCraft.instance, 16, 3, true);

    }
}
