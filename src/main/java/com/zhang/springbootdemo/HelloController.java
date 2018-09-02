package com.zhang.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author created by Zhangdazhuang
 * @version v.0.1
 * @date 2018/9/1
 * @备注 测试
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello11";
    }

    @RequestMapping("/hello1")
    public String hello1() {
        return "hello123";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "hello12";
    }

    /**
     * Spring boot默认使用的jackson的json解析框架
     *
     * @return
     */
    @RequestMapping("/getDemo")
    public Demo getDemo() {
        //栈保存变量，对象的引用
        //堆申请对象内存空间
        Demo demo = new Demo(1, "张三");
        demo.setCreateTime(new Date());
        demo.setRemarks("这是备注信息");
        return demo;
    }




}
