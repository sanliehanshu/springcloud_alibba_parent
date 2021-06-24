package com.windsun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 项目名称：springcloud_alibba_parent
 * 类 名 称：ConfigClientApplication
 * 类 描 述：
 * 创建时间：2021/6/24 21:00
 * 创 建 人：wangsheng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }
}
