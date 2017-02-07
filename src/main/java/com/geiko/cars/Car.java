package com.geiko.cars;

import com.geiko.carParts.Engine;
import com.geiko.carParts.Wheel;
/**
 * Created by Андрей on 07.02.2017.
 */

public class Car {
    protected Engine engine;
    protected Wheel wheel;

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString(){
        return "Car:\n "+wheel+engine;
    }
}
