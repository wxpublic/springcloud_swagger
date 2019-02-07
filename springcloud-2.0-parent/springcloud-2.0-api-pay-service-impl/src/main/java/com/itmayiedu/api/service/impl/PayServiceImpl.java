package com.itmayiedu.api.service.impl;

import com.itmayiedu.api.service.IPayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-01-29 下午 2:11
 */
@RestController
@Api("Swagger_PayController")
public class PayServiceImpl implements IPayService{

    @ApiOperation("Swagger 演示接口 >> getPay")
    @GetMapping("/getPay")
    public String getPay(){
        System.out.println("我是支付服务，也是Swagger接口生成器的微服务客户端");
        return "Hello Everyone!I'M PayService And SwaggerClient.";
    }
}
