package com.senkoauhlink.senkoAuthLinkAPI.api.auth;

import com.velocitypowered.api.proxy.Player;

public interface TwoFactorService {

    void enable2FA(Player player);

    void disable2FA(Player player);

    void confirm2FAHere(Player player);

    boolean confirm2FA(java.util.UUID playerUUID, String discordUserId);

    boolean deny2FA(java.util.UUID playerUUID, String discordUserId);
}
