package com.example;

public class Cube {
    private double side;

    public Cube(double s){
        this.side = s;
    }

    public double getVolume(){
        return Math.pow(this.side, 3);
    }

    public double getSurfaceArea(){
        return 4*Math.pow(this.side,  2);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}
