package org.example.diy;

//使用注解的方式实现AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* org.example.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("===方法执行前===");
    }

    @After("execution(* org.example.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("===方法执行后===");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* org.example.service.UserServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");
        Object proceed = pjp.proceed();
        System.out.println("环绕后");
        return proceed;
    }
}
