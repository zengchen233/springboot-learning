package cn.zengchen233.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zengchen
 * @title Person
 * @description
 * @create 2023/2/14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Person {
    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private User user;
}
