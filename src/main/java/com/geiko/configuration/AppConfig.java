package com.geiko.configuration;

import com.geiko.carParts.*;
import com.geiko.cars.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Андрей on 07.02.2017.
 */
@Configuration
public class AppConfig {
    @Bean
    public Engine engine(){
        return new Engine(50);
    }

    @Bean
    public Tyres tyres(){
        return new Tyres(16,"Tyres");
    }

    @Bean
    public WinterTyres winterTyres(){
        return  new WinterTyres(15,"WinterTyres");
    }

    @Bean
    public  SummerTyres summerTyres(){
        return new SummerTyres(17,"SummerTyres");
    }

    @Bean
    public Wheel wheel(){
        return new Wheel(tyres());
    }

    @Bean
    public Car car(){
        return new Car(engine(),wheel());
    }
}
