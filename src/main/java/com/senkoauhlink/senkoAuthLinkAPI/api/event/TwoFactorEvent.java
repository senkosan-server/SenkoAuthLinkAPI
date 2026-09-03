package com.senkoauhlink.senkoAuthLinkAPI.api.event;

import com.senkoauhlink.senkoAuthLinkAPI.api.model.PlayerAccount;
import com.velocitypowered.api.proxy.Player;

public class TwoFactorEvent {

    private final Player player;
    private final PlayerAccount account;
    private final String ip;
    private final boolean confirmed;

    public TwoFactorEvent(Player player, PlayerAccount account, String ip, boolean confirmed) {
        this.player = player;
        this.account = account;
        this.ip = ip;
        this.confirmed = confirmed;
    }

    public Player getPlayer() { return player; }
    public PlayerAccount getAccount() { return account; }
    public String getIp() { return ip; }
    public boolean isConfirmed() { return confirmed; }
}
