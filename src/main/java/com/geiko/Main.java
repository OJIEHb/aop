package com.geiko;

import com.geiko.cars.Car;
import com.geiko.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Андрей on 07.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = (Car) context.getBean("car");
        System.out.println(car);
    }
}
