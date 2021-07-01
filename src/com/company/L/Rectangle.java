package com.company.L;

public class Rectangle  {
    Integer width;
    Integer height;
    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return  this.height*this.width;
    }
}
