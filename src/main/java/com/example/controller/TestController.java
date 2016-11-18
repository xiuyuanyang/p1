package com.example.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ucmed on 2016/11/18.
 */
@Controller
@RequestMapping
public class TestController {

    @RequestMapping("hi")
    @ResponseBody
    public String hello( @RequestParam(value = "username", required = false) String name ){

        return "hello www " + name ;
    }



    @RequestMapping("/ho/{name}")
    @ResponseBody
    public String sayHi(@PathVariable String name){

        //AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do",APP_ID,APP_PRIVATE_KEY,"json",CHARSET,ALIPAY_PUBLIC_KEY);

        return "ni hao " + name ;
    }
}
