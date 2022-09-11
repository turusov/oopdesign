package ru.sber.oopdesign;


public class Rectangle implements FigureGetSquare {
    private double a,b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return a*b;
    }
}
