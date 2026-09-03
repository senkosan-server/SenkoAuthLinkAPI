package com.senkoauhlink.senkoAuthLinkAPI.api.storage;

import com.senkoauhlink.senkoAuthLinkAPI.api.model.PlayerAccount;

import java.util.Optional;

public interface PlayerRepository {

    Optional<PlayerAccount> findByUsername(String username);

    Optional<PlayerAccount> findByDiscordId(String discordId);

    boolean exists(String username);

    void create(PlayerAccount account);

    void updatePassword(String username, String passwordHash);

    void setPremium(String username, boolean premium, String premiumUuid);

    void setDiscord(String username, String discordId);

    void setLang(String username, String lang);

    void setTwoFactor(String username, boolean enabled);

    void touchLogin(String username, String ip, long now);

    void delete(String username);

    int count();
}
