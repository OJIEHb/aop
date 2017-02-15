package com.geiko.aspects;

import com.geiko.cars.Car;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Андрей on 07.02.2017.
 */
@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.geiko.cars.Car.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before");
        System.out.println("Be executed: "+joinPoint.getSignature().getName());
    }
    @After("execution(* com.geiko.cars.Car.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After");
        System.out.println("executed: " + joinPoint.getSignature().getName());
    }
    @Around("execution(* com.geiko.cars.Car.set*(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Be executed: " + joinPoint.getSignature().getName());
        System.out.println("Arguments : " + Arrays.toString(joinPoint.getArgs()));
        joinPoint.proceed();
        System.out.println("executed: " + joinPoint.getSignature().getName());
    }

    @AfterThrowing(
            pointcut = "execution(* com.geiko.cars.Car.*(..))",
            throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println(e.getStackTrace());
    }
    @AfterReturning(
            pointcut = "execution(* com.geiko.cars.Car.get*(..))",
            returning= "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("After returning");
        System.out.println("executed: " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : \n" + result);
    }
}
