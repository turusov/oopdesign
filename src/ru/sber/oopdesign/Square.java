package ru.sber.oopdesign;

public class Square implements FigureGetSquare {
    private double a, square;
    public Square(double a){
        this.a = a;
    }
    @Override
    public double getSquare(){
        return a*a;
    }
}
