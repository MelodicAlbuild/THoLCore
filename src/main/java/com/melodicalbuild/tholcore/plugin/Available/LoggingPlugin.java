package com.melodicalbuild.tholcore.plugin.Available;

import com.melodicalbuild.tholcore.plugin.AvailablePlugins;
import com.melodicalbuild.tholcore.plugin.THoLPlugin;

public class LoggingPlugin extends THoLPlugin {
    public LoggingPlugin(String version, boolean prerelease) {
        super.name = "THoL Logging";
        super.shortName = "THoLLogging";
        super.pluginType = AvailablePlugins.Logging;
        super.version = version;
        super.prerelease = prerelease;
    }
}
