package com.design.composite;

public class Square implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Square with color " + fillColor);
    }
}
