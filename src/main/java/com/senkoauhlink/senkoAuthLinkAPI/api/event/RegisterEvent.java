package com.senkoauhlink.senkoAuthLinkAPI.api.event;

import com.senkoauhlink.senkoAuthLinkAPI.api.model.PlayerAccount;
import com.velocitypowered.api.proxy.Player;

public class RegisterEvent {

    private final Player player;
    private final PlayerAccount account;

    public RegisterEvent(Player player, PlayerAccount account) {
        this.player = player;
        this.account = account;
    }

    public Player getPlayer() { return player; }
    public PlayerAccount getAccount() { return account; }
}
