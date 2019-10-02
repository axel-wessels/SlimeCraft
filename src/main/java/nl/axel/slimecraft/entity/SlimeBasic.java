package nl.axel.slimecraft.entity;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.world.World;
import net.minecraft.item.Item;

public class SlimeBasic extends EntitySlime {

    public SlimeBasic(World world, String name, Item favoriteFood, Item drop, boolean isVegetarian) {
        super(world);
    }

    public SlimeBasic(World world, String name, Item favoriteFood, Item drop, boolean isVegetarian, boolean isLit) {
        super(world);
    }

    @Override
    public int getSlimeSize() {
        return 3;
    }
}
