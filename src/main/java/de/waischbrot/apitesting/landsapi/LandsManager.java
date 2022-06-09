package de.waischbrot.apitesting.landsapi;

import de.waischbrot.apitesting.Main;
import me.angeschossen.lands.api.integration.LandsIntegration;
import me.angeschossen.lands.api.land.Area;
import me.angeschossen.lands.api.land.Land;
import org.bukkit.Location;

public class LandsManager {

    private final Main plugin;
    private final LandsIntegration landsIntegration;

    public LandsManager(Main plugin) {
        this.plugin = plugin;
        landsIntegration = new LandsIntegration(plugin);
    }

    public void test(Location location) {

        Area area = landsIntegration.getAreaByLoc(location);

        Land land = landsIntegration.getLand(location);

    }
}
