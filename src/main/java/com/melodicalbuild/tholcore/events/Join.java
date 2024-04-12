package com.melodicalbuild.tholcore.events;

import com.melodicalbuild.tholcore.THoLCore;
import com.melodicalbuild.tholcore.plugin.THoLPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
    private THoLCore plugin;

    public Join(THoLCore plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent ev) {
        if(ev.getPlayer().getName().equals("MelodicAlbuild") || ev.getPlayer().getName().equals("CPL_Verduct")) {
            for(THoLPlugin plugin1 : THoLCore.plugins) {
                THoLCore.pluginManager.SendLogToPlayer(plugin1, ev.getPlayer());
            }
        }
    }
}
