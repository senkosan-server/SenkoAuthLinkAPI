package com.senkoauhlink.senkoAuthLinkAPI.api.event;

import com.velocitypowered.api.proxy.Player;

public class DisconnectEvent {

    private final Player player;

    public DisconnectEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() { return player; }
}
