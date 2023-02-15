package cn.zengchen233.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author zengchen
 * @title User
 * @description
 * @create 2023/2/14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    private String name;
    private int age;
}
