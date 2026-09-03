package com.senkoauhlink.senkoAuthLinkAPI.api.event;

import com.velocitypowered.api.proxy.Player;

public class LogoutEvent {

    private final Player player;

    public LogoutEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() { return player; }
}
