package com.geiko.carParts;

/**
 * Created by Андрей on 07.02.2017.
 */
public class Wheel {
    protected Tyres tyres;

    public Wheel(Tyres tyres) {
        this.tyres = tyres;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    @Override
    public String toString(){
        return "Wheel:\n  "+tyres;
    }
}
