package com.senkoauhlink.senkoAuthLinkAPI.api.event;

import com.senkoauhlink.senkoAuthLinkAPI.api.model.PlayerAccount;
import com.velocitypowered.api.proxy.Player;

public class LoginEvent {

    private final Player player;
    private final PlayerAccount account;
    private final String ip;
    private final boolean isPremium;

    public LoginEvent(Player player, PlayerAccount account, String ip, boolean isPremium) {
        this.player = player;
        this.account = account;
        this.ip = ip;
        this.isPremium = isPremium;
    }

    public Player getPlayer() { return player; }
    public PlayerAccount getAccount() { return account; }
    public String getIp() { return ip; }
    public boolean isPremium() { return isPremium; }
}
