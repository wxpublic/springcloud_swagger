package com.itmayiedu;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-01-29 下午 2:22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc //swagger文档api
public class AppPay {
    public static void main(String[] args) {
        SpringApplication.run(AppPay.class);
    }
}
