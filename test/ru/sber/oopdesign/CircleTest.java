package ru.sber.oopdesign;

import org.junit.Assert;
import org.junit.Test;
import ru.sber.oopdesign.Circle;

public class CircleTest extends Assert {

    @Test
    public void testCircleGetSquare(){
        var circle = new Circle(3);
        assertEquals("must be 28.26", 28.26, circle.getSquare(), 0.001);
    }
    @Test
    public void testCircleGetSquareZero(){
        var circle = new Circle(3);
        assertEquals("must be 0", 0, new Circle(0).getSquare(), 0.001);
    }
}