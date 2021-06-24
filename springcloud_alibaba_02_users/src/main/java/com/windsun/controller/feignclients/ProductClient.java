package com.windsun.controller.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName : ProductClient
 * @Description :
 * @Author : ws
 * @Date: 2021-06-24 10:40
 * @Version 1.0
 */
@FeignClient("NACOSPRODUCTS")
public interface ProductClient {

    @GetMapping("/product")
    String products(@RequestParam("id") Integer id);
}
