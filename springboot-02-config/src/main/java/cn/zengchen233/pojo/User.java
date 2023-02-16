package cn.zengchen233.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

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
@Validated //数据校验
public class User {
    private String name;
    private int age;
    @Email(message = "邮箱格式错误")
    private String email;
}
