package com.geiko.cars;

import com.geiko.carParts.Engine;
import com.geiko.carParts.Wheel;
/**
 * Created by Андрей on 07.02.2017.
 */

public class Car {
    protected Engine engine;
    protected Wheel wheel;
    protected boolean isDoorOpen = false;

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

    public void startCar(){
        engine.setEngineOn(true);
    }

    public void stopCar(){
        engine.setEngineOn(false);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public void openDoor() {
        isDoorOpen = true;
    }

    public void closeDoor() {
        isDoorOpen = true;
    }

    @Override
    public String toString(){
        return "Car:\n "+getWheel()+getEngine();
    }
}
