package cn.zengchen233.controller;

import cn.zengchen233.mapper.UserMapper;
import cn.zengchen233.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zengchen
 * @title UserController
 * @description
 * @create 2023/2/16
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/list")
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @GetMapping("/list/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userMapper.getUserById(id);
    }

    @GetMapping("/add")
    public String addUser() {
        User zcc = new User(10, "zcc", "123");
        userMapper.addUser(zcc);
        return "增加用户完成,用户信息为:" + zcc;
    }

    @GetMapping("/del")
    public String delError() {
        return "参数错误";
    }

    @GetMapping("/del/{id}")
    public String delUser(@PathVariable("id") int id) {
        userMapper.delUser(id);
        return "用户删除成功";
    }
}
