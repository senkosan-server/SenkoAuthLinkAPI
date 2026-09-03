package com.senkoauhlink.senkoAuthLinkAPI.api.event;

import com.senkoauhlink.senkoAuthLinkAPI.api.model.PlayerAccount;
import com.velocitypowered.api.proxy.Player;

public class AuthEvent {

    private final Player player;
    private final PlayerAccount account;
    private final String ip;

    public AuthEvent(Player player, PlayerAccount account, String ip) {
        this.player = player;
        this.account = account;
        this.ip = ip;
    }

    public Player getPlayer() { return player; }
    public PlayerAccount getAccount() { return account; }
    public String getIp() { return ip; }
}
