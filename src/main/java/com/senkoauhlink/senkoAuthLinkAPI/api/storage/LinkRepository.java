package com.senkoauhlink.senkoAuthLinkAPI.api.storage;

import com.senkoauhlink.senkoAuthLinkAPI.api.model.PendingLink;

import java.util.Optional;

public interface LinkRepository {

    void insertPending(String code, String username, long createdAt, long expiresAt);

    Optional<PendingLink> findPending(String code);

    void deletePending(String code);

    void deletePendingByUsername(String username);

    void purgeExpiredLinks(long now);
}
