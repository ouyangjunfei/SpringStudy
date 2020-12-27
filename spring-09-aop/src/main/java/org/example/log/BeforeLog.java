package org.example.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    /**
     * @param method 要执行的目标对象的方法
     * @param args   参数
     * @param target 目标对象
     * @throws Throwable 异常
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if (target != null) {
            System.out.println(target.getClass().getName() + "的" + method.getName() + "方法被执行了");
        } else {
            System.out.println("target为null");
        }
    }
}
