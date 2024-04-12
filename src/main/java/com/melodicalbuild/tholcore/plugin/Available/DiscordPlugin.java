package com.melodicalbuild.tholcore.plugin.Available;

import com.melodicalbuild.tholcore.plugin.AvailablePlugins;
import com.melodicalbuild.tholcore.plugin.THoLPlugin;

public class DiscordPlugin extends THoLPlugin {
    public DiscordPlugin(String version, boolean prerelease) {
        super.name = "THoL Discord";
        super.shortName = "THoLDiscord";
        super.pluginType = AvailablePlugins.Discord;
        super.version = version;
        super.prerelease = prerelease;
    }
}
