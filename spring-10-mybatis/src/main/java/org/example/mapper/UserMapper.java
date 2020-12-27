package org.example.mapper;

import org.example.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> selectUser();

    int updateUserById(Map<String, Object> map);
}
