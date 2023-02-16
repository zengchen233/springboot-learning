package cn.zengchen233.controller;

import cn.zengchen233.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author zengchen
 * @title JdbcController
 * @description
 * @create 2023/2/16
 */
@RestController
public class JdbcController {

    @Autowired(required = false)
    JdbcTemplate jdbcTemplate;

    /**
     * @description 获取数据库所有信息
     * @param
     * @return java.util.List<cn.zengchen233.pojo.User>
     */
    @GetMapping("/list")
    public List<User> getUserList() {
        String sql = "select * from user";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return userList;
    }

    @GetMapping("/add")
    public String addUser() {
        String sql = "insert into user values(1,'wtf','123123')";
        jdbcTemplate.update(sql);
        return "增添用户成功";
    }

    @GetMapping("/del/{id}")
    public String delUser(@PathVariable("id") int id) {
        String sql = "delete from user where id = ?";
        jdbcTemplate.update(sql, id);
        return "删除用户成功";
    }

    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id) {
        String sql = "update user set name = ?, pwd = ? where id = " + id;
        Object[] states = new Object[2];
        states[0] = "zcc";
        states[1] = "123123";
        jdbcTemplate.update(sql, states);
        return "修改用户成功";
    }
}
