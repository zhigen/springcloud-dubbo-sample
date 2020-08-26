package com.zglu.dubbo.goods.service;

import com.zglu.dubbo.common.api.GoodsApi;
import com.zglu.dubbo.common.api.UserApi;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author zglu
 */
@Service
public class GoodsApiImpl implements GoodsApi {
    @Reference
    private UserApi userApi;

    @Override
    public String goods() {
        return "goods";
    }

    @Override
    public String goodsAndUser() {
        return "goods" + userApi.user();
    }
}
