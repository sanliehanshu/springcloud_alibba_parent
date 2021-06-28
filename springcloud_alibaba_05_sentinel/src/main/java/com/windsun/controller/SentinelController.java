package com.windsun.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
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

    /**
     * blockHandler 使用sentinel进行不同规则控制时的默认方案，必须指定SentinelResource；fallback：自定义业务出错时默认处理方案
     * @param id
     * @return
     */
    @GetMapping("/test")
    @SentinelResource(value = "testRes",blockHandler = "blockHandler",fallback = "fall")
    public String testSentinel(Integer id){
        if (id < 1) {
            throw new RuntimeException("id无效");
        }
        return "sentienel test ok";
    }

    public String blockHandler(Integer id, BlockException e){
        if (e instanceof FlowException) {
            return "流量控制";
        }
        if (e instanceof ParamFlowException) {
            return "热点参数限流";
        }
        if (e instanceof DegradeException) {
            return "降级";
        }
        if (e instanceof AuthorityException) {
            return "";
        }
        if (e instanceof SystemBlockException) {
            return "";
        }
        return "活动太火爆了，请等一会！";
    }

    public String fall(Integer id){
        return "自定义默认出错规则";
    }

    @GetMapping("/demo")
    public String demoSentinel(){
        return "sentienel demo ok";
    }

    @GetMapping("/demoTest")
    public String demoTestSentinel(){
        return "sentienel demoTest ok";
    }
}
