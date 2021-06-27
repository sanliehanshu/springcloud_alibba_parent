package com.windsun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：springcloud_alibba_parent
 * 类 名 称：SentinelController
 * 类 描 述：
 * 创建时间：2021/6/27 21:12
 * 创 建 人：wangsheng
 */
@RestController
public class SentinelController {

    @GetMapping("/test")
    public String testSentinel(){
        return "sentienel ok";
    }
}
