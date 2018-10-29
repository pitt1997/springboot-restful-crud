package com.cn.springboot04web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
//
//    @RequestMapping({"/","/index.html"})   //多种请求的表示
//    public String index(){
//        return "index";//模板引擎拼串路径，找templates下面的index.html页面
//    }



    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "hello";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object>  map) {
    map.put("hello","<h1>你好！</h1>");
    map.put("users", Arrays.asList("zs","ls","ww"));

    return "success";
    }


}
