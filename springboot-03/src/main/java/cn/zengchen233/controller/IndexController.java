package cn.zengchen233.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zengchen
 * @title IndexController
 * @description 在templates下面的页面只能通过controller跳转
 * @create 2023/2/16
 */
@Controller
public class IndexController {

    @GetMapping("/test")
    public String index() {
        return "test";
    }
}
