package org.example.mapper;

import org.example.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperTest {
    @Test
    public void selectUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        List<User> userList = mapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}