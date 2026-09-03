package com.senkoauhlink.senkoAuthLinkAPI.api.auth;

import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.server.RegisteredServer;

public interface LimboGate {

    boolean isAvailable();

    void hold(Player player);

    boolean release(Player player);

    boolean release(Player player, RegisteredServer target);

    void onDisconnect(Player player);
}
