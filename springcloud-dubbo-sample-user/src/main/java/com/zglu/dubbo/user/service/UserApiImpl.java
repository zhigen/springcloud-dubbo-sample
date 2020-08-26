package com.zglu.dubbo.user.service;

import com.zglu.dubbo.common.api.UserApi;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author zglu
 */
@Service
public class UserApiImpl implements UserApi {
    @Override
    public String user() {
        return "user";
    }
}
