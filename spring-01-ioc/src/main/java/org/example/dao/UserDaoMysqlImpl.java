package org.example.dao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("通过MYSQL获取数据");
    }
}

