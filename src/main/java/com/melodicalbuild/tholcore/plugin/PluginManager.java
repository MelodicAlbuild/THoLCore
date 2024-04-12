package com.melodicalbuild.tholcore.plugin;

import com.melodicalbuild.tholcore.THoLCore;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

public class PluginManager {
    private final Logger log;

    public PluginManager(Logger log) {
        this.log = log;
    }

    public boolean EventsEnabled = false;
    public boolean CoreEnabled = false;
    public boolean DiscordEnabled = false;

    public void EnablePlugin(THoLPlugin plugin) {
        switch (plugin.pluginType) {
            case Events:
                EventsEnabled = true;
                break;
            case Core:
                CoreEnabled = true;
                break;
            case Discord:
                DiscordEnabled = true;
                break;
        }

        THoLCore.plugins.add(plugin);

    }

    public void LogCreation(THoLPlugin plugin) {
        if(plugin.prerelease) {
            String message = "&3[&a" + plugin.name + "&3]&f: &4~~~ THoL Warning ~~~";
            log.warning(ChatColor.translateAlternateColorCodes('&', message));

            message = "&3[&a" + plugin.name + "&3]&f: &4The " + plugin.name + " Plugin is currently in a Pre-Release " +
                    "Version: " + plugin.version;
            log.warning(ChatColor.translateAlternateColorCodes('&', message));

            message = "&3[&a" + plugin.name + "&3]&f: &4Some Objects may be Unstable, Please Report all Bugs.";
            log.warning(ChatColor.translateAlternateColorCodes('&', message));

            message = "&3[&a" + plugin.name + "&3]&f: &4The Most Recent Stable Version can be found at: " +
                    "&fhttps://github.com/MelodicAlbuild/" + plugin.shortName + "/releases/latest";
            log.warning(ChatColor.translateAlternateColorCodes('&', message));

            message = "&3[&a" + plugin.name + "&3]&f: &4~~~~~~~~~~~~~~~~~~~~~~~";
            log.warning(ChatColor.translateAlternateColorCodes('&', message));
        } else {
            log.info(ChatColor.GOLD + "[" + ChatColor.GREEN + plugin.name + ChatColor.GOLD + "]" + ChatColor.WHITE +
                    ": " + ChatColor.DARK_AQUA + "~~~ " + plugin.name + " ~~~");

            log.info(ChatColor.GOLD + "[" + ChatColor.GREEN + plugin.name + ChatColor.GOLD + "]" + ChatColor.WHITE +
                    ": " + ChatColor.DARK_AQUA + "The " + plugin.name + " Plugin is running in Version: " + plugin.version);

            log.info(ChatColor.GOLD + "[" + ChatColor.GREEN + plugin.name + ChatColor.GOLD + "]" + ChatColor.WHITE + ": " + ChatColor.DARK_AQUA + plugin.name + " Thanks you for your Download");

            log.info(ChatColor.GOLD + "[" + ChatColor.GREEN + plugin.name + ChatColor.GOLD + "]" + ChatColor.WHITE + ": " + ChatColor.DARK_AQUA + "~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    public void SendLogToPlayer(THoLPlugin plugin, Player player) {
        if(plugin.prerelease) {
            String message = " ";
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));

            message = "&3[&a" + plugin.name + "&3]&f: &4~~~ THoL Warning ~~~";
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));

            message = "&3[&a" + plugin.name + "&3]&f: &4The " + plugin.name + " Plugin is currently in a Pre-Release " +
                    "Version: " + plugin.version;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));

            message = "&3[&a" + plugin.name + "&3]&f: &4Some Objects may be Unstable, Please Report all Bugs.";
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));

            message = "&3[&a" + plugin.name + "&3]&f: &4The Most Recent Stable Version can be found at: " +
                    "&fhttps://github.com/MelodicAlbuild/" + plugin.shortName + "/releases/latest";
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));

            message = "&3[&a" + plugin.name + "&3]&f: &4~~~~~~~~~~~~~~~~~~~~~~~";
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        } else {
            player.sendMessage(" ");

            player.sendMessage(ChatColor.GOLD + "[" + ChatColor.GREEN + plugin.name + ChatColor.GOLD + "]" + ChatColor.WHITE +
                    ": " + ChatColor.DARK_AQUA + "~~~ " + plugin.name + " ~~~");

            player.sendMessage(ChatColor.GOLD + "[" + ChatColor.GREEN + plugin.name + ChatColor.GOLD + "]" + ChatColor.WHITE +
                    ": " + ChatColor.DARK_AQUA + "The " + plugin.name + " Plugin is running in Version: " + plugin.version);

            player.sendMessage(ChatColor.GOLD + "[" + ChatColor.GREEN + plugin.name + ChatColor.GOLD + "]" + ChatColor.WHITE + ": " + ChatColor.DARK_AQUA + plugin.name + " Thanks you for your Download");

            player.sendMessage(ChatColor.GOLD + "[" + ChatColor.GREEN + plugin.name + ChatColor.GOLD + "]" + ChatColor.WHITE + ": " + ChatColor.DARK_AQUA + "~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
