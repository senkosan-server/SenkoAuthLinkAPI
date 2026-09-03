package com.senkoauhlink.senkoAuthLinkAPI.api;

import com.senkoauhlink.senkoAuthLinkAPI.api.auth.AuthManager;
import com.senkoauhlink.senkoAuthLinkAPI.api.auth.AuthService;
import com.senkoauhlink.senkoAuthLinkAPI.api.auth.LimboGate;
import com.senkoauhlink.senkoAuthLinkAPI.api.auth.LinkService;
import com.senkoauhlink.senkoAuthLinkAPI.api.auth.PremiumChecker;
import com.senkoauhlink.senkoAuthLinkAPI.api.auth.PremiumService;
import com.senkoauhlink.senkoAuthLinkAPI.api.auth.SessionManager;
import com.senkoauhlink.senkoAuthLinkAPI.api.auth.TwoFactorService;
import com.senkoauhlink.senkoAuthLinkAPI.api.discord.DiscordManager;
import com.senkoauhlink.senkoAuthLinkAPI.api.event.EventManager;
import com.senkoauhlink.senkoAuthLinkAPI.api.storage.BanService;
import com.senkoauhlink.senkoAuthLinkAPI.api.storage.LinkRepository;
import com.senkoauhlink.senkoAuthLinkAPI.api.storage.PlayerRepository;

public final class SenkoAuthLinkProvider {

    private static volatile SenkoAuthLinkProvider instance;

    private final AuthManager authManager;
    private final AuthService authService;
    private final SessionManager sessionManager;
    private final PlayerRepository playerRepository;
    private final BanService banService;
    private final LinkRepository linkRepository;
    private final DiscordManager discordManager;
    private final PremiumChecker premiumChecker;
    private final PremiumService premiumService;
    private final TwoFactorService twoFactorService;
    private final LinkService linkService;
    private final LimboGate limboGate;
    private final EventManager eventManager;

    private SenkoAuthLinkProvider(Builder builder) {
        this.authManager = builder.authManager;
        this.authService = builder.authService;
        this.sessionManager = builder.sessionManager;
        this.playerRepository = builder.playerRepository;
        this.banService = builder.banService;
        this.linkRepository = builder.linkRepository;
        this.discordManager = builder.discordManager;
        this.premiumChecker = builder.premiumChecker;
        this.premiumService = builder.premiumService;
        this.twoFactorService = builder.twoFactorService;
        this.linkService = builder.linkService;
        this.limboGate = builder.limboGate;
        this.eventManager = builder.eventManager;
    }

    public static SenkoAuthLinkProvider get() {
        return instance;
    }

    public static void setInstance(SenkoAuthLinkProvider provider) {
        instance = provider;
    }

    public AuthManager getAuthManager() { return authManager; }
    public AuthService getAuthService() { return authService; }
    public SessionManager getSessionManager() { return sessionManager; }
    public PlayerRepository getPlayerRepository() { return playerRepository; }
    public BanService getBanService() { return banService; }
    public LinkRepository getLinkRepository() { return linkRepository; }
    public DiscordManager getDiscordManager() { return discordManager; }
    public PremiumChecker getPremiumChecker() { return premiumChecker; }
    public PremiumService getPremiumService() { return premiumService; }
    public TwoFactorService getTwoFactorService() { return twoFactorService; }
    public LinkService getLinkService() { return linkService; }
    public LimboGate getLimboGate() { return limboGate; }
    public EventManager getEventManager() { return eventManager; }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private AuthManager authManager;
        private AuthService authService;
        private SessionManager sessionManager;
        private PlayerRepository playerRepository;
        private BanService banService;
        private LinkRepository linkRepository;
        private DiscordManager discordManager;
        private PremiumChecker premiumChecker;
        private PremiumService premiumService;
        private TwoFactorService twoFactorService;
        private LinkService linkService;
        private LimboGate limboGate;
        private EventManager eventManager;

        private Builder() {}

        public Builder authManager(AuthManager authManager) { this.authManager = authManager; return this; }
        public Builder authService(AuthService authService) { this.authService = authService; return this; }
        public Builder sessionManager(SessionManager sessionManager) { this.sessionManager = sessionManager; return this; }
        public Builder playerRepository(PlayerRepository playerRepository) { this.playerRepository = playerRepository; return this; }
        public Builder banService(BanService banService) { this.banService = banService; return this; }
        public Builder linkRepository(LinkRepository linkRepository) { this.linkRepository = linkRepository; return this; }
        public Builder discordManager(DiscordManager discordManager) { this.discordManager = discordManager; return this; }
        public Builder premiumChecker(PremiumChecker premiumChecker) { this.premiumChecker = premiumChecker; return this; }
        public Builder premiumService(PremiumService premiumService) { this.premiumService = premiumService; return this; }
        public Builder twoFactorService(TwoFactorService twoFactorService) { this.twoFactorService = twoFactorService; return this; }
        public Builder linkService(LinkService linkService) { this.linkService = linkService; return this; }
        public Builder limboGate(LimboGate limboGate) { this.limboGate = limboGate; return this; }
        public Builder eventManager(EventManager eventManager) { this.eventManager = eventManager; return this; }

        public SenkoAuthLinkProvider build() {
            if (authManager == null) throw new IllegalStateException("authManager is required");
            if (authService == null) throw new IllegalStateException("authService is required");
            if (sessionManager == null) throw new IllegalStateException("sessionManager is required");
            if (playerRepository == null) throw new IllegalStateException("playerRepository is required");
            if (banService == null) throw new IllegalStateException("banService is required");
            if (eventManager == null) throw new IllegalStateException("eventManager is required");
            return new SenkoAuthLinkProvider(this);
        }
    }
}
