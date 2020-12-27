package org.example.mapper;

import org.apache.ibatis.session.SqlSession;
import org.example.pojo.User;

import java.util.List;
import java.util.Map;


public class UserMapperImpl implements UserMapper {

    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        return sqlSession.getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int updateUserById(Map<String, Object> map) {
        return sqlSession.getMapper(UserMapper.class).updateUserById(map);
    }
}
