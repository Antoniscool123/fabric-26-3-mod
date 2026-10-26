package com.example.mod;

import net.fabricmc.api.ModInitializer;

public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "fabric_26_3_mod";

    @Override
    public void onInitialize() {
        System.out.println("Fabric 26.3 mod initialized for Minecraft 1.16.5");
    }
}
