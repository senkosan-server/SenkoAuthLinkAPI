package com.senkoauhlink.senkoAuthLinkAPI.api.discord;

import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;

import java.util.UUID;

public interface DiscordManager {

    void start(Object plugin, ProxyServer proxy);

    void stop();

    boolean isMemberOk(String discordId);

    void notifyLogin(String username, String ip);

    void notifyUnlink(String discordId, String username);

    void sendTwoFactorRequest(String discordId, UUID uuid, String playerName, String ip);

    boolean isEnabled();

    void setTwoFactorHandler(TwoFactorHandler handler);

    interface TwoFactorHandler {
        boolean confirm(UUID uuid, String discordUserId);
        boolean deny(UUID uuid, String discordUserId);
    }
}
