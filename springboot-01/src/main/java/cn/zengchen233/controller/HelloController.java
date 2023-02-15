package cn.zengchen233.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengchen
 * @title HelloController
 * @description
 * @create 2023/2/14
 */
@RestController
@RequestMapping("/user")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
