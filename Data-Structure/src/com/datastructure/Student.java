package com.datastructure;

public class Student implements A {
    @Override
    public void setUp() {
        System.out.println("just creating an interface");
    }
    @Override
    public void newUpdate() {
        System.out.println("updated");
    }

    String name;
    int mark;
    char grade;

    public String printValue() {
        return name;
    }
}
