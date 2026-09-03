package com.senkoauhlink.senkoAuthLinkAPI.api.model;

public final class Ban {

    private final String username;
    private final String reason;
    private final long bannedAt;
    private final long expiresAt;

    public Ban(String username, String reason, long bannedAt, long expiresAt) {
        this.username = username;
        this.reason = reason;
        this.bannedAt = bannedAt;
        this.expiresAt = expiresAt;
    }

    public String getUsername() { return username; }
    public String getReason() { return reason; }
    public long getBannedAt() { return bannedAt; }
    public long getExpiresAt() { return expiresAt; }

    public boolean isPermanent() {
        return expiresAt <= 0;
    }

    public boolean isExpired() {
        if (isPermanent()) {
            return false;
        }
        return System.currentTimeMillis() > expiresAt;
    }
}
