package com.senkoauhlink.senkoAuthLinkAPI.api.auth;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Locale;

import com.velocitypowered.api.proxy.Player;

public final class SessionManagerUtil {

    private SessionManagerUtil() {
    }

    public static String normalizedIp(String raw, int ipv6PrefixLength) {
        if (raw == null) {
            return "";
        }
        try {
            InetAddress address = InetAddress.getByName(raw);
            if (address instanceof Inet6Address && ipv6PrefixLength > 0) {
                byte[] bytes = address.getAddress();
                int groups = Math.max(1, Math.min(8, ipv6PrefixLength / 16));
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < groups; i++) {
                    if (i > 0) {
                        sb.append(':');
                    }
                    sb.append(String.format(Locale.ROOT, "%x",
                            ((bytes[i * 2] & 0xff) << 8) | (bytes[i * 2 + 1] & 0xff)));
                }
                return sb.toString();
            }
            return address.getHostAddress();
        } catch (Exception e) {
            return raw;
        }
    }

    public static String addressOf(Player player) {
        InetSocketAddress addr = player.getRemoteAddress();
        return addr == null ? "" : addr.getHostString();
    }
}
