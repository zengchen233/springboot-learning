package cn.zengchen233.mapper;

import cn.zengchen233.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author 曾晨
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-02-16 15:22:42
* @Entity cn.zengchen233.pojo.User
*/
@Mapper
@Repository
public interface UserMapper {

    List<User> queryUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int delUser(int id);
}
