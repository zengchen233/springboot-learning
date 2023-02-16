package cn.zengchen233.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @TableName user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User implements Serializable {
    private Integer id;

    private String name;

    private String pwd;

    private static final long serialVersionUID = 1L;
}