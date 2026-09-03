package com.senkoauhlink.senkoAuthLinkAPI.api.config;

public final class AuthConfig {

    private final boolean requireRegistration;
    private final int minPasswordLength;
    private final int maxPasswordLength;
    private final int maxLoginAttempts;
    private final int loginTimeoutSeconds;
    private final int cooldownSeconds;
    private final int rejoinGraceMinutes;
    private final int maxPlayersPerIp;
    private final int ipv6PrefixLength;
    private final boolean ipLimitExemptAuth;
    private final String gateServer;
    private final String initialServer;
    private final boolean limboEnabled;
    private final boolean premiumEnabled;
    private final boolean premiumForceOnlineAuth;
    private final boolean premiumAuthFallback;
    private final int premiumAuthFallbackMinutes;
    private final String premiumApiUrl;
    private final int premiumCacheTtlHours;
    private final boolean discordEnabled;
    private final boolean discordCheckMembershipOnLogin;
    private final boolean discordNotifyOnLogin;
    private final int discordLinkCodeLength;
    private final int discordLinkExpirationMinutes;
    private final String discordVerifyCommand;
    private final int twoFactorConfirmSeconds;
    private final String defaultLanguage;
    private final String databaseFile;

    private AuthConfig(Builder builder) {
        this.requireRegistration = builder.requireRegistration;
        this.minPasswordLength = builder.minPasswordLength;
        this.maxPasswordLength = builder.maxPasswordLength;
        this.maxLoginAttempts = builder.maxLoginAttempts;
        this.loginTimeoutSeconds = builder.loginTimeoutSeconds;
        this.cooldownSeconds = builder.cooldownSeconds;
        this.rejoinGraceMinutes = builder.rejoinGraceMinutes;
        this.maxPlayersPerIp = builder.maxPlayersPerIp;
        this.ipv6PrefixLength = builder.ipv6PrefixLength;
        this.ipLimitExemptAuth = builder.ipLimitExemptAuth;
        this.gateServer = builder.gateServer;
        this.initialServer = builder.initialServer;
        this.limboEnabled = builder.limboEnabled;
        this.premiumEnabled = builder.premiumEnabled;
        this.premiumForceOnlineAuth = builder.premiumForceOnlineAuth;
        this.premiumAuthFallback = builder.premiumAuthFallback;
        this.premiumAuthFallbackMinutes = builder.premiumAuthFallbackMinutes;
        this.premiumApiUrl = builder.premiumApiUrl;
        this.premiumCacheTtlHours = builder.premiumCacheTtlHours;
        this.discordEnabled = builder.discordEnabled;
        this.discordCheckMembershipOnLogin = builder.discordCheckMembershipOnLogin;
        this.discordNotifyOnLogin = builder.discordNotifyOnLogin;
        this.discordLinkCodeLength = builder.discordLinkCodeLength;
        this.discordLinkExpirationMinutes = builder.discordLinkExpirationMinutes;
        this.discordVerifyCommand = builder.discordVerifyCommand;
        this.twoFactorConfirmSeconds = builder.twoFactorConfirmSeconds;
        this.defaultLanguage = builder.defaultLanguage;
        this.databaseFile = builder.databaseFile;
    }

    public boolean isRequireRegistration() { return requireRegistration; }
    public int getMinPasswordLength() { return minPasswordLength; }
    public int getMaxPasswordLength() { return maxPasswordLength; }
    public int getMaxLoginAttempts() { return maxLoginAttempts; }
    public int getLoginTimeoutSeconds() { return loginTimeoutSeconds; }
    public int getCooldownSeconds() { return cooldownSeconds; }
    public int getRejoinGraceMinutes() { return rejoinGraceMinutes; }
    public int getMaxPlayersPerIp() { return maxPlayersPerIp; }
    public int getIpv6PrefixLength() { return ipv6PrefixLength; }
    public boolean isIpLimitExemptAuth() { return ipLimitExemptAuth; }
    public String getGateServer() { return gateServer; }
    public String getInitialServer() { return initialServer; }
    public boolean isLimboEnabled() { return limboEnabled; }
    public boolean isPremiumEnabled() { return premiumEnabled; }
    public boolean isPremiumForceOnlineAuth() { return premiumForceOnlineAuth; }
    public boolean isPremiumAuthFallback() { return premiumAuthFallback; }
    public int getPremiumAuthFallbackMinutes() { return premiumAuthFallbackMinutes; }
    public String getPremiumApiUrl() { return premiumApiUrl; }
    public int getPremiumCacheTtlHours() { return premiumCacheTtlHours; }
    public boolean isDiscordEnabled() { return discordEnabled; }
    public boolean isDiscordCheckMembershipOnLogin() { return discordCheckMembershipOnLogin; }
    public boolean isDiscordNotifyOnLogin() { return discordNotifyOnLogin; }
    public int getDiscordLinkCodeLength() { return discordLinkCodeLength; }
    public int getDiscordLinkExpirationMinutes() { return discordLinkExpirationMinutes; }
    public String getDiscordVerifyCommand() { return discordVerifyCommand; }
    public int getTwoFactorConfirmSeconds() { return twoFactorConfirmSeconds; }
    public String getDefaultLanguage() { return defaultLanguage; }
    public String getDatabaseFile() { return databaseFile; }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private boolean requireRegistration = true;
        private int minPasswordLength = 4;
        private int maxPasswordLength = 32;
        private int maxLoginAttempts = 5;
        private int loginTimeoutSeconds = 60;
        private int cooldownSeconds = 30;
        private int rejoinGraceMinutes = 5;
        private int maxPlayersPerIp = 3;
        private int ipv6PrefixLength = 64;
        private boolean ipLimitExemptAuth = true;
        private String gateServer = "";
        private String initialServer = "";
        private boolean limboEnabled = true;
        private boolean premiumEnabled = false;
        private boolean premiumForceOnlineAuth = false;
        private boolean premiumAuthFallback = true;
        private int premiumAuthFallbackMinutes = 10;
        private String premiumApiUrl = "https://api.mojang.com/users/profiles/minecraft/{name}";
        private int premiumCacheTtlHours = 24;
        private boolean discordEnabled = false;
        private boolean discordCheckMembershipOnLogin = false;
        private boolean discordNotifyOnLogin = true;
        private int discordLinkCodeLength = 6;
        private int discordLinkExpirationMinutes = 5;
        private String discordVerifyCommand = "!senko verify {code}";
        private int twoFactorConfirmSeconds = 120;
        private String defaultLanguage = "ru";
        private String databaseFile = "database.db";

        private Builder() {}

        public Builder requireRegistration(boolean v) { this.requireRegistration = v; return this; }
        public Builder minPasswordLength(int v) { this.minPasswordLength = v; return this; }
        public Builder maxPasswordLength(int v) { this.maxPasswordLength = v; return this; }
        public Builder maxLoginAttempts(int v) { this.maxLoginAttempts = v; return this; }
        public Builder loginTimeoutSeconds(int v) { this.loginTimeoutSeconds = v; return this; }
        public Builder cooldownSeconds(int v) { this.cooldownSeconds = v; return this; }
        public Builder rejoinGraceMinutes(int v) { this.rejoinGraceMinutes = v; return this; }
        public Builder maxPlayersPerIp(int v) { this.maxPlayersPerIp = v; return this; }
        public Builder ipv6PrefixLength(int v) { this.ipv6PrefixLength = v; return this; }
        public Builder ipLimitExemptAuth(boolean v) { this.ipLimitExemptAuth = v; return this; }
        public Builder gateServer(String v) { this.gateServer = v; return this; }
        public Builder initialServer(String v) { this.initialServer = v; return this; }
        public Builder limboEnabled(boolean v) { this.limboEnabled = v; return this; }
        public Builder premiumEnabled(boolean v) { this.premiumEnabled = v; return this; }
        public Builder premiumForceOnlineAuth(boolean v) { this.premiumForceOnlineAuth = v; return this; }
        public Builder premiumAuthFallback(boolean v) { this.premiumAuthFallback = v; return this; }
        public Builder premiumAuthFallbackMinutes(int v) { this.premiumAuthFallbackMinutes = v; return this; }
        public Builder premiumApiUrl(String v) { this.premiumApiUrl = v; return this; }
        public Builder premiumCacheTtlHours(int v) { this.premiumCacheTtlHours = v; return this; }
        public Builder discordEnabled(boolean v) { this.discordEnabled = v; return this; }
        public Builder discordCheckMembershipOnLogin(boolean v) { this.discordCheckMembershipOnLogin = v; return this; }
        public Builder discordNotifyOnLogin(boolean v) { this.discordNotifyOnLogin = v; return this; }
        public Builder discordLinkCodeLength(int v) { this.discordLinkCodeLength = v; return this; }
        public Builder discordLinkExpirationMinutes(int v) { this.discordLinkExpirationMinutes = v; return this; }
        public Builder discordVerifyCommand(String v) { this.discordVerifyCommand = v; return this; }
        public Builder twoFactorConfirmSeconds(int v) { this.twoFactorConfirmSeconds = v; return this; }
        public Builder defaultLanguage(String v) { this.defaultLanguage = v; return this; }
        public Builder databaseFile(String v) { this.databaseFile = v; return this; }

        public AuthConfig build() {
            return new AuthConfig(this);
        }
    }
}
