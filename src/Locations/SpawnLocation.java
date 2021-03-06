package Locations;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class SpawnLocation {

	private GunGame plugin;

	public SpawnLocation(GunGame plugin) {
		this.plugin = plugin;
	}

	public void onSpawnLocation(Player p) {
		String world = this.plugin.cfg.getString("spawn.world");
		double x = this.plugin.cfg.getDouble("spawn.x");
		double y = this.plugin.cfg.getDouble("spawn.y");
		double z = this.plugin.cfg.getDouble("spawn.z");
		float yaw = this.plugin.cfg.getInt("spawn.yaw");
		float pitch = this.plugin.cfg.getInt("spawn.pitch");

		Location loc = new Location(Bukkit.getWorld(world), x, y, z, yaw, pitch);
		p.teleport(loc);
	}
}
