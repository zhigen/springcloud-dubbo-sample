package com.zglu.dubbo.common.api;

/**
 * @author zglu
 */
public interface UserApi {
    String user();

    default String defaultUser() {
        return "default user";
    }
}
