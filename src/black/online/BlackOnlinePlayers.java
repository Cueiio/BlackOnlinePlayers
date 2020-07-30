package black.online;

import org.bukkit.plugin.java.*;

public class BlackOnlinePlayers extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("online").setExecutor(new BlackOnlinePlayers());
        getCommand("players").setExecutor(new BlackOnlinePlayers());
    }

    @Override
    public void onDisable() {

    }
}