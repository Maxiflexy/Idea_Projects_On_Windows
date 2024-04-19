package com.practice.junitlearningpractice;

import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {

    @Test
    public void test() {
        ReverseString reverse = new ReverseString();
        assertEquals("avaJ", reverse.reverseString("Java"));
    }
}