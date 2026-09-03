package com.senkoauhlink.senkoAuthLinkAPI.api.auth;

import com.velocitypowered.api.proxy.Player;

public interface PremiumService {

    void confirmPremium(Player player, String password1, String password2);

    void unlinkPremium(Player player, String password);

    boolean isPremiumEnabled();
}
