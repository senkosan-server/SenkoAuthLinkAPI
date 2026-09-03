package com.senkoauhlink.senkoAuthLinkAPI.api.event;

import com.senkoauhlink.senkoAuthLinkAPI.api.model.PlayerAccount;
import com.velocitypowered.api.proxy.Player;

public class LinkEvent {

    private final Player player;
    private final PlayerAccount account;
    private final String discordId;
    private final boolean linked;

    public LinkEvent(Player player, PlayerAccount account, String discordId, boolean linked) {
        this.player = player;
        this.account = account;
        this.discordId = discordId;
        this.linked = linked;
    }

    public Player getPlayer() { return player; }
    public PlayerAccount getAccount() { return account; }
    public String getDiscordId() { return discordId; }
    public boolean isLinked() { return linked; }
}
