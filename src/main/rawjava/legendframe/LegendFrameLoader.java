/*
 * This plugin is copyright Legend Arena, 2014-current. See LICENSE.md for full license file.
 */

package legendframe;

import org.bukkit.plugin.java.JavaPlugin;

public class LegendFrameLoader extends JavaPlugin {

    @SuppressWarnings("ResultOfMethodCallIgnored") //we really do not care if we discard output, because we're just testing to see if it actually loaded or not
    public void onEnable() {

        getLogger().info(" ");
        getLogger().info(" ");
        getLogger().info("LegendFrame: Made with love, by Legend Arena.");
        getLogger().info(" ");
        getLogger().info(" ");

        boolean didAThingBreak = false;
        try {
            new KotlinTest().test();
        } catch(Exception ex) {
            getLogger().warning("Kotlin testing failed! Most Kotlin based plugins will probably not work.");
            didAThingBreak = true;
        }
        if(!didAThingBreak)
            getLogger().info("Kotlin works just fine - enjoy!");
    }

    public void onDisable() {
        //
    }

}
