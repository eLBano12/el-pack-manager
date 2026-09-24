package com.elbano12.elpackmanager;

/**
 * Shared entry point for eL Pack Manager.
 *
 * Loader-specific code is responsible for calling initialize().
 */
public final class PackManager {
    public static final String MOD_ID = "el_pack_manager";
    public static final String MOD_NAME = "eL Pack Manager";
    public static final String MOD_VERSION = "0.1.0";

    private PackManager() {
    }

    public static void initialize() {
        // Shared initialization will be added as the common systems are built.
    }
}
