package com.senkoauhlink.senkoAuthLinkAPI.api.auth;

import com.senkoauhlink.senkoAuthLinkAPI.api.model.AuthState;
import com.senkoauhlink.senkoAuthLinkAPI.api.model.PlayerSession;
import com.velocitypowered.api.proxy.Player;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface SessionManager {

    PlayerSession createSession(Player player, int ipv6PrefixLength);

    Optional<PlayerSession> getSession(UUID playerUUID);

    Collection<PlayerSession> getAllSessions();

    void removeSession(UUID playerUUID);

    long countByIp(String ip, boolean onlyUnauthed, int ipv6PrefixLength);

    Long getIpCooldown(String ip, int ipv6PrefixLength);

    void setIpCooldown(String ip, long untilMillis, int ipv6PrefixLength);

    void clearIpCooldown(String ip, int ipv6PrefixLength);

    static String normalizedIp(String raw, int ipv6PrefixLength) {
        return SessionManagerUtil.normalizedIp(raw, ipv6PrefixLength);
    }

    static String addressOf(Player player) {
        return SessionManagerUtil.addressOf(player);
    }
}
