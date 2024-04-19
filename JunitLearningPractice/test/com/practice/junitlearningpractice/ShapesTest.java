package com.practice.junitlearningpractice;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapesTest {
        Shapes shape = new Shapes();
    @Test
    public void testComputeSquareArea(){
        assertEquals(576, shape.computeSquareArea(24));
    }
    @Test
    public void testComputeCircleArea(){
        assertEquals(78.55, shape.computeCircleArea(5));
    }

}