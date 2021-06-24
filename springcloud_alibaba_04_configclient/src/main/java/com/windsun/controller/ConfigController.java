package com.windsun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：springcloud_alibba_parent
 * 类 名 称：ConfigController
 * 类 描 述：
 * 创建时间：2021/6/24 21:30
 * 创 建 人：wangsheng
 */
@RestController
@RefreshScope  // 允许远端修改
public class ConfigController {

    @Value("${name}")
    private String name;

    @GetMapping("/test")
    public String demo(){
        return "config，name："+name;
    }
}
