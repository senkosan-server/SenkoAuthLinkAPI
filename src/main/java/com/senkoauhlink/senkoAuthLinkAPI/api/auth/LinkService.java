package com.senkoauhlink.senkoAuthLinkAPI.api.auth;

import com.velocitypowered.api.proxy.Player;

public interface LinkService {

    void startLink(Player player);

    void unlinkDiscord(Player player, String password);

    boolean verifyLink(String code, String discordUserId);
}
