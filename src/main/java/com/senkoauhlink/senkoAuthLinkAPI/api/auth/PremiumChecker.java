package com.senkoauhlink.senkoAuthLinkAPI.api.auth;

import com.senkoauhlink.senkoAuthLinkAPI.api.model.PremiumInfo;
import com.velocitypowered.api.proxy.Player;

import java.util.concurrent.CompletableFuture;

public interface PremiumChecker {

    CompletableFuture<PremiumInfo> isPremium(String name);

    PremiumInfo isPremiumSync(String name);
}
