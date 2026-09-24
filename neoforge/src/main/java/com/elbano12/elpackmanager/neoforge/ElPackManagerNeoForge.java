package com.elbano12.elpackmanager.neoforge;

import com.elbano12.elpackmanager.PackManager;
import net.neoforged.fml.common.Mod;

@Mod(PackManager.MOD_ID)
public final class ElPackManagerNeoForge {
    public ElPackManagerNeoForge() {
        PackManager.initialize();
    }
}
