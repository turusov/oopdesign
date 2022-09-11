package ru.sber.oopdesign;

public class Circle implements FigureGetSquare {
    private double r;
    public Circle(double r){
        this.r = r;
    }
    @Override
    public double getSquare() {
        return Math.pow(r,2) * 3.14;
    }
}
