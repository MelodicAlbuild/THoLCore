package com.melodicalbuild.tholcore;

import com.melodicalbuild.tholcore.commands.ExecuteBungeeCommand;
import com.melodicalbuild.tholcore.events.Join;
import com.melodicalbuild.tholcore.plugin.Available.CorePlugin;
import com.melodicalbuild.tholcore.plugin.PluginManager;
import com.melodicalbuild.tholcore.plugin.THoLPlugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

public final class THoLCore extends JavaPlugin {

    static Logger log = Bukkit.getLogger();

    public static List<THoLPlugin> plugins = new ArrayList<>();
    public static PluginManager pluginManager = new PluginManager(log);

    @Override
    public void onEnable() {
        pluginManager.EnablePlugin(new CorePlugin("1.0-Pre3", true));
        getServer().getPluginManager().registerEvents(new Join(this), this);
        getServer().getMessenger().registerOutgoingPluginChannel(this, "melodicalbuild:send");

        Objects.requireNonNull(getCommand("executebungee")).setExecutor(new ExecuteBungeeCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
