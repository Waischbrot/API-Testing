package de.waischbrot.apitesting.landsapi;

import de.waischbrot.apitesting.Main;
import me.angeschossen.lands.api.integration.LandsIntegration;
import me.angeschossen.lands.api.land.Area;
import me.angeschossen.lands.api.land.Land;
import me.angeschossen.lands.api.player.LandPlayer;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.Objects;
import java.util.UUID;

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

        assert land != null;
        land.getTrustedPlayers().forEach(land::untrustPlayer);

        LandPlayer landPlayer = landsIntegration.getLandPlayer(UUID.randomUUID());

        landsIntegration.wild(Objects.requireNonNull(landPlayer), Objects.requireNonNull(Bukkit.getWorld("world")));
    }
}
