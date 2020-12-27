package org.example.mapper;

import org.example.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class UserMapperImplByDaoSupport extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int updateUserById(Map<String, Object> map) {
        return getSqlSession().getMapper(UserMapper.class).updateUserById(map);
    }
}
