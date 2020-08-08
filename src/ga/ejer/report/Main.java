package ga.ejer.report;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("report").setExecutor(new CommandReport());
    }

    @Override
    public void onDisable() {

    }
}
