package com.lsn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuShengnan
 * @date 2021/10/24 16:03
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        System.out.println("hello docker");
        return "hello docker";
    }
}
