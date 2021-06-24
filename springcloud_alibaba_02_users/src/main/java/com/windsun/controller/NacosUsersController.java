package com.windsun.controller;

import com.windsun.controller.feignclients.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : NacosUsersApplication
 * @Description :
 * @Author : ws
 * @Date: 2021-06-24 10:37
 * @Version 1.0
 */
@RestController
@Slf4j
public class NacosUsersController {

    @Resource
    private ProductClient productClient;

    @GetMapping("/user")
    public String user(@RequestParam("id") Integer id){
        String products = productClient.products(id);
        log.info("调用结果："+products);
        return "user"+products;
    }
}
