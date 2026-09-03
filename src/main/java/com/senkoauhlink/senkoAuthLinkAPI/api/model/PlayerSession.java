package com.senkoauhlink.senkoAuthLinkAPI.api.model;

import java.util.UUID;

public final class PlayerSession {

    private final UUID playerUUID;
    private final String playerName;
    private final String ip;
    private final AuthState status;
    private final int attempts;
    private final String lang;
    private final String initialServer;
    private final long requestAt;

    public PlayerSession(UUID playerUUID, String playerName, String ip,
                         AuthState status, int attempts, String lang,
                         String initialServer, long requestAt) {
        this.playerUUID = playerUUID;
        this.playerName = playerName;
        this.ip = ip;
        this.status = status;
        this.attempts = attempts;
        this.lang = lang;
        this.initialServer = initialServer;
        this.requestAt = requestAt;
    }

    public UUID getPlayerUUID() { return playerUUID; }
    public String getPlayerName() { return playerName; }
    public String getIp() { return ip; }
    public AuthState getStatus() { return status; }
    public int getAttempts() { return attempts; }
    public String getLang() { return lang; }
    public String getInitialServer() { return initialServer; }
    public long getRequestAt() { return requestAt; }

    public boolean isAuthenticated() {
        return status == AuthState.AUTHENTICATED;
    }

    public boolean isPendingAuth() {
        return status == AuthState.PENDING_LOGIN
                || status == AuthState.PENDING_REGISTER
                || status == AuthState.PENDING_2FA;
    }
}
