package org.example.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Renter renter;

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    /**
     * 生成得到代理类
     *
     * @return 代理类
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(Renter.class.getClassLoader(), new Class<?>[]{Renter.class}, this);
    }

    /**
     * 处理代理实例，并放回结果
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，使用反射机制实现，最后执行时会进入此方法
        beforeMethod();
        Object result = method.invoke(renter, args);
        afterMethod();
        return result;
    }

    private void beforeMethod() {
        System.out.println("前");
    }

    private void afterMethod() {
        System.out.println("后");
    }
}
