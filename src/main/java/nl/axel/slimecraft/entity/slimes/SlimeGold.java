package nl.axel.slimecraft.entity.slimes;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import nl.axel.slimecraft.entity.SlimeBasic;
import nl.axel.slimecraft.util.Names;

public class SlimeGold extends SlimeBasic {
    public SlimeGold(World world) {
        super(world, Names.GOLD_SLIME, Item.getItemFromBlock(Blocks.STONE), Item.getItemFromBlock(Blocks.IRON_ORE), true);
    }
}
