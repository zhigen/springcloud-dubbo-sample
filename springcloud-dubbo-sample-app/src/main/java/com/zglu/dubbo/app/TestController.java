package com.zglu.dubbo.app;

import com.zglu.dubbo.common.api.GoodsApi;
import com.zglu.dubbo.common.api.UserApi;
import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zglu
 */
@Log4j2
@RestController
public class TestController {
    @Reference
    private GoodsApi goodsApi;
    @Reference
    private UserApi userApi;

    @GetMapping
    public void test(){
        log.info(goodsApi.goods());
        log.info(goodsApi.goodsAndUser());
        log.info(userApi.user());
        log.info(userApi.defaultUser());
    }
}
