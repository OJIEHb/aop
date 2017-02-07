package com.geiko.aspects;

import com.geiko.cars.Car;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Андрей on 07.02.2017.
 */
@Aspect
@Component
public class LoggingAspect {
    @After("execution(* com.geiko.carParts.Engine.setEngineOn(boolean))")
    public void logAfterSetEngineOn(JoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        for (Object arg: args) {
            try{
                if((Boolean)arg){
                    System.out.println("Engine on!");
                }else{
                    System.out.println("Engine off!");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @After("execution(* com.geiko.cars.Car.startCar())")
    public void logAfterStartCar(JoinPoint joinPoint) throws Throwable {
        System.out.println("Start car!");
    }

    @Before("execution(* com.geiko.cars.Car.stopCar())")
    public void logAfterStopCar(JoinPoint joinPoint) throws Throwable {
        System.out.println("Stop car!");
    }

    @Around("execution(* com.geiko.cars.Car.openDoor(..))")
    public void logAroundOpenDoor(ProceedingJoinPoint joinPoint) throws Throwable {
        Car car = (Car)joinPoint.getTarget();
        if (car.isDoorOpen()||car.getEngine().isEngineOn()){
            System.out.println("Sorry! Try close the door or off engine!");
        }else{
            joinPoint.proceed();
            System.out.println("Door is open!");
        }
    }

    @Around("execution(* com.geiko.cars.Car.closeDoor(..))")
    public void logAroundCloseDoor(ProceedingJoinPoint joinPoint) throws Throwable {
        Car car = (Car)joinPoint.getTarget();
        if (!car.isDoorOpen()){
            System.out.println("Sorry! Door is already closed!");
        }else{
            joinPoint.proceed();
            System.out.println("Door is closed!");
        }
    }

}
