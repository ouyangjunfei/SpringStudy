package org.example.demo02;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();

        handler.setRenter(host);

        Renter proxy = (Renter) handler.getProxy();

        proxy.rent();
    }
}
