package com.melodicalbuild.tholcore.plugin.Available;

import com.melodicalbuild.tholcore.plugin.AvailablePlugins;
import com.melodicalbuild.tholcore.plugin.THoLPlugin;

public class EventsPlugin extends THoLPlugin {
    public EventsPlugin(String version, boolean prerelease) {
        super.name = "THoL Events";
        super.shortName = "THoLEvents";
        super.pluginType = AvailablePlugins.Events;
        super.version = version;
        super.prerelease = prerelease;
    }
}
