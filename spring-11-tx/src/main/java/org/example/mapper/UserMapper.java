package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    int addUser(User user);

    int deleteUserById(@Param("id") int id);
}
