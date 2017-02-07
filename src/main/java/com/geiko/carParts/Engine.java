package com.geiko.carParts;

/**
 * Created by Андрей on 07.02.2017.
 */
public class Engine {
    protected int engineCapacity;
    protected boolean engineOn = false;

    public Engine(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    @Override
    public String toString(){
        return " Engine:\n  Engine Capacity: "+getEngineCapacity();
    }
}
