package com.zglu.dubbo.common.api;

/**
 * @author zglu
 */
public interface UserApi {
    /**
     * user
     *
     * @return String
     */
    String user();

    /**
     * defaultUser
     *
     * @return String
     */
    default String defaultUser() {
        return "default user";
    }
}
