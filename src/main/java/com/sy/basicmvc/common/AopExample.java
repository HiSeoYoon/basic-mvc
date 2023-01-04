package com.sy.basicmvc.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Aspect
public class AopExample {

    private final static Logger log = Logger.getGlobal();

    @Pointcut("execution(* com.sy.basicmvc.controller.*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Object[] objects = joinPoint.getArgs();

        for(Object param: objects){
            log.info("get parameter : " + param);
        }
        log.info("method name : " + method.getName());
    }

    @AfterReturning(value = "pointCut()", returning="returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue){
        log.info("return value : " + returnValue);
    }
}
