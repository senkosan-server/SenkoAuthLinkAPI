package com.senkoauhlink.senkoAuthLinkAPI.api.messages;

import com.velocitypowered.api.proxy.Player;

import java.util.Map;

public interface MessageProvider {

    String plain(String key, String lang, Map<String, String> placeholders);

    String plain(String key, String lang);

    net.kyori.adventure.text.Component msg(String key, Player player, Map<String, String> placeholders);

    net.kyori.adventure.text.Component msg(String key, Player player);

    String getPrefix(String lang);
}
