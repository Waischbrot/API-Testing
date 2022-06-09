package de.waischbrot.apitesting;

import de.waischbrot.apitesting.landsapi.LandsManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private LandsManager landsManager;

    @Override
    public void onEnable() {
        landsManager = new LandsManager(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public LandsManager getLandsManager() {
        return landsManager;
    }
}
