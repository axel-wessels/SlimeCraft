package nl.axel.slimecraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import nl.axel.slimecraft.proxy.CommonProxy;
import nl.axel.slimecraft.util.Reference;

/*
 * Initialization of the mod and registration of the proxies
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class SlimeCraft {
    @Mod.Instance(Reference.MOD_ID)
    public static SlimeCraft instance;

    @SidedProxy(clientSide = Reference.CLASS_PROXY_CLIENT, serverSide = Reference.CLASS_PROXY_COMMON)
    public static CommonProxy proxy;
}
