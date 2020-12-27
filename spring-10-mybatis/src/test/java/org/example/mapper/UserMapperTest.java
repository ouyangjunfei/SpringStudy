package org.example.mapper;

import org.example.pojo.User;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    @Test
    public void selectUser() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper mapper = context.getBean("userMapperImplByDaoSupport", UserMapper.class);

        List<User> userList = mapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }

        Map<String, Object> map = new HashMap<>();

        map.put("id", 1);
        map.put("pwd", "qweqwe");

        int result = mapper.updateUserById(map);

        System.out.println(result);
    }

    @Test
    @SuppressWarnings("SpellCheckingInspection")
    public void updateUserById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SqlSessionTemplate sqlSessionTemplate = context.getBean("sqlSessionTemplate", SqlSessionTemplate.class);

        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();

        map.put("id", 1);
        map.put("pwd", "qweqwe");

        int result = mapper.updateUserById(map);

        System.out.println(result);
    }
}