package com.melodicalbuild.tholcore.plugin.Available;

import com.melodicalbuild.tholcore.plugin.AvailablePlugins;
import com.melodicalbuild.tholcore.plugin.THoLPlugin;

public class CorePlugin extends THoLPlugin {
    public CorePlugin(String version, boolean prerelease) {
        super.name = "THoL Core";
        super.shortName = "THoLCore";
        super.pluginType = AvailablePlugins.Core;
        super.version = version;
        super.prerelease = prerelease;
    }
}
