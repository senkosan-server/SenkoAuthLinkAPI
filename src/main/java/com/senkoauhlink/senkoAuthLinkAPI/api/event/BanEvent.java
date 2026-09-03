package com.senkoauhlink.senkoAuthLinkAPI.api.event;

import com.senkoauhlink.senkoAuthLinkAPI.api.model.Ban;
import com.velocitypowered.api.proxy.Player;

public class BanEvent {

    private final Player player;
    private final Ban ban;

    public BanEvent(Player player, Ban ban) {
        this.player = player;
        this.ban = ban;
    }

    public Player getPlayer() { return player; }
    public Ban getBan() { return ban; }
}
