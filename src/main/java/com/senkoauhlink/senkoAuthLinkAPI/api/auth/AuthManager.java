package com.senkoauhlink.senkoAuthLinkAPI.api.auth;

import com.velocitypowered.api.event.connection.PreLoginEvent;
import com.velocitypowered.api.proxy.Player;

public interface AuthManager {

    boolean isAuthed(Player player);

    void handlePreLogin(PreLoginEvent event);

    void handleLogin(Player player);

    void onDisconnect(Player player);

    void purgePremiumAuth(long now);

    void purgeTwoFactor(long now);
}
