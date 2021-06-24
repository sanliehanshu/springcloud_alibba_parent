package com.windsun.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @ClassName : ProductsController
 * @Description :
 * @Author : ws
 * @Date: 2021-06-24 09:57
 * @Version 1.0
 */
@RestController
@Slf4j
public class ProductsController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/product")
    public String products(@RequestParam("id") Integer id){
        log.info("进入商品服务，id：{}",id);
        return  "商品服务，id："+id+"，port："+port;
    }
}
