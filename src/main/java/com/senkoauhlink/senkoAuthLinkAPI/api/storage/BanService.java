package com.senkoauhlink.senkoAuthLinkAPI.api.storage;

import com.senkoauhlink.senkoAuthLinkAPI.api.model.Ban;

import java.util.Optional;

public interface BanService {

    Optional<Ban> getBan(String username);

    void ban(String username, String reason, long bannedAt, long expiresAt);

    void unban(String username);
}
