package com.senkoauhlink.senkoAuthLinkAPI.api.model;

public final class PlayerAccount {

    private final String username;
    private final String uuid;
    private final String passwordHash;
    private final boolean premium;
    private final String premiumUuid;
    private final String discordId;
    private final boolean twoFactor;
    private final String lang;
    private final long registeredAt;
    private final long lastLoginAt;
    private final String lastIp;

    private PlayerAccount(Builder builder) {
        this.username = builder.username;
        this.uuid = builder.uuid;
        this.passwordHash = builder.passwordHash;
        this.premium = builder.premium;
        this.premiumUuid = builder.premiumUuid;
        this.discordId = builder.discordId;
        this.twoFactor = builder.twoFactor;
        this.lang = builder.lang;
        this.registeredAt = builder.registeredAt;
        this.lastLoginAt = builder.lastLoginAt;
        this.lastIp = builder.lastIp;
    }

    public String getUsername() { return username; }
    public String getUuid() { return uuid; }
    public String getPasswordHash() { return passwordHash; }
    public boolean isPremium() { return premium; }
    public String getPremiumUuid() { return premiumUuid; }
    public String getDiscordId() { return discordId; }
    public boolean isTwoFactor() { return twoFactor; }
    public String getLang() { return lang; }
    public long getRegisteredAt() { return registeredAt; }
    public long getLastLoginAt() { return lastLoginAt; }
    public String getLastIp() { return lastIp; }

    public Builder toBuilder() {
        return new Builder()
                .username(username)
                .uuid(uuid)
                .passwordHash(passwordHash)
                .premium(premium)
                .premiumUuid(premiumUuid)
                .discordId(discordId)
                .twoFactor(twoFactor)
                .lang(lang)
                .registeredAt(registeredAt)
                .lastLoginAt(lastLoginAt)
                .lastIp(lastIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String username;
        private String uuid;
        private String passwordHash;
        private boolean premium;
        private String premiumUuid;
        private String discordId;
        private boolean twoFactor;
        private String lang = "";
        private long registeredAt;
        private long lastLoginAt;
        private String lastIp;

        private Builder() {}

        public Builder username(String username) { this.username = username; return this; }
        public Builder uuid(String uuid) { this.uuid = uuid; return this; }
        public Builder passwordHash(String passwordHash) { this.passwordHash = passwordHash; return this; }
        public Builder premium(boolean premium) { this.premium = premium; return this; }
        public Builder premiumUuid(String premiumUuid) { this.premiumUuid = premiumUuid; return this; }
        public Builder discordId(String discordId) { this.discordId = discordId; return this; }
        public Builder twoFactor(boolean twoFactor) { this.twoFactor = twoFactor; return this; }
        public Builder lang(String lang) { this.lang = lang; return this; }
        public Builder registeredAt(long registeredAt) { this.registeredAt = registeredAt; return this; }
        public Builder lastLoginAt(long lastLoginAt) { this.lastLoginAt = lastLoginAt; return this; }
        public Builder lastIp(String lastIp) { this.lastIp = lastIp; return this; }

        public PlayerAccount build() {
            if (username == null || username.isBlank()) {
                throw new IllegalStateException("username must not be null or blank");
            }
            if (uuid == null || uuid.isBlank()) {
                throw new IllegalStateException("uuid must not be null or blank");
            }
            if (passwordHash == null || passwordHash.isBlank()) {
                throw new IllegalStateException("passwordHash must not be null or blank");
            }
            return new PlayerAccount(this);
        }
    }
}
