package com.senkoauhlink.senkoAuthLinkAPI.api.auth;

import com.velocitypowered.api.proxy.Player;

public interface AuthService {

    void register(Player player, String password1, String password2);

    void login(Player player, String password);

    void logout(Player player);

    void changePassword(Player player, String oldPassword, String newPassword1, String newPassword2);

    void setLang(Player player, String lang);
}
