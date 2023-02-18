package cn.zengchen233.controller;

import cn.zengchen233.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengchen
 * @title HelloController
 * @description
 * @create 2023/2/17
 */
@Api(tags = "Hello控制类")
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @ApiOperation("返回一个User实体类")
    @PostMapping("/user")
    public User user() {
        return new User();
    }

    @GetMapping("/aaa")
    public String aaa(@ApiParam("用户名") String username) {
        return "Hello " + username;
    }

}
