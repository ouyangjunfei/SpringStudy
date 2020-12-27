package org.example.demo01;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

//用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成得到代理类
     *
     * @return 代理类
     */
    public Object getProxy() {
        System.out.println(target.getClass().getClassLoader().toString());
        System.out.println(Arrays.toString(target.getClass().getInterfaces()));
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    /**
     * 处理代理实例，并放回结果
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，使用反射机制实现，最后执行时会进入此方法
        beforeMethod(method.getName());
        Object result = method.invoke(target, args);
        afterMethod(method.getName());
        return result;
    }

    private void beforeMethod(String message) {
        System.out.println(message + "方法开始执行");
    }

    private void afterMethod(String message) {
        System.out.println(message + "方法结束执行");
    }
}
