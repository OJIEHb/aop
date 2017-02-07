package com.geiko.carParts;

/**
 * Created by Андрей on 07.02.2017.
 */
public class Engine {
    protected int engineCapacity;

    public Engine(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString(){
        return " Engine:\n  Engine Capacity: "+getEngineCapacity();
    }
}
