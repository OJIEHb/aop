package com.geiko.carParts;

/**
 * Created by Андрей on 07.02.2017.
 */
public class Tyres {
    protected int size;
    protected String name;

    public Tyres(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Tyres:\n   Name: "+getName()+"\n   Size: "+getSize()+"\n";
    }
}
