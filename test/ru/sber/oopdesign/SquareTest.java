package ru.sber.oopdesign;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void testSquareGetSquare() {
        var Square = new Square(5);
        assertEquals("must be 25.0", 25, Square.getSquare(), 0.001);
    }
}