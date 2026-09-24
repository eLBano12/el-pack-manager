package com.elbano12.elpackmanager.fabric;

import com.elbano12.elpackmanager.PackManager;
import net.fabricmc.api.ModInitializer;

public final class ElPackManagerFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PackManager.initialize();
    }
}
