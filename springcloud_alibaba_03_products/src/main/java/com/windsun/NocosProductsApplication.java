package com.windsun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : NocosUsersApplication
 * @Description :
 * @Author : ws
 * @Date: 2021-06-24 09:49
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NocosProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NocosProductsApplication.class,args);
    }
}
