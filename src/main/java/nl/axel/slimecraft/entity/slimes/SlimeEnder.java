package nl.axel.slimecraft.entity.slimes;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import nl.axel.slimecraft.entity.SlimeBasic;
import nl.axel.slimecraft.util.Names;

public class SlimeEnder extends SlimeBasic {
    public SlimeEnder(World world) {
        super(world, Names.ENDER_SLIME, Item.getItemFromBlock(Blocks.STONE), Item.getItemFromBlock(Blocks.IRON_ORE), true);
    }
}
