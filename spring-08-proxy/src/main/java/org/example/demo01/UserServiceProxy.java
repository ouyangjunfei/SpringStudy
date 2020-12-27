package org.example.demo01;

public class UserServiceProxy implements UserService {
    private UserService userService;

    public UserServiceProxy() {
    }

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    private void log(String message) {
        System.out.println(message);
    }
}
