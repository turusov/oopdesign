package ru.sber.oopdesign;

import org.junit.Test;
import org.w3c.dom.css.Rect;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testRectangleGetSquare() {
        var rectangle = new Rectangle(5, 3);
        assertEquals("must be 15.0", 15, rectangle.getSquare(), 0.001);
    }
}