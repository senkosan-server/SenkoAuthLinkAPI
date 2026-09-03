package com.senkoauhlink.senkoAuthLinkAPI.api.model;

public enum AuthState {
    NEW,
    PENDING_REGISTER,
    PENDING_LOGIN,
    PENDING_2FA,
    AUTHENTICATED
}
