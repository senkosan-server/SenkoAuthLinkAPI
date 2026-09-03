package com.senkoauhlink.senkoAuthLinkAPI.api.model;

public final class PendingLink {

    private final String code;
    private final String username;
    private final long createdAt;
    private final long expiresAt;

    public PendingLink(String code, String username, long createdAt, long expiresAt) {
        this.code = code;
        this.username = username;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
    }

    public String getCode() { return code; }
    public String getUsername() { return username; }
    public long getCreatedAt() { return createdAt; }
    public long getExpiresAt() { return expiresAt; }

    public boolean isExpired() {
        return System.currentTimeMillis() > expiresAt;
    }
}
