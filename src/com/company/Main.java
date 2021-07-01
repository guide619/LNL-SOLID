package com.company;

import com.company.L.Rectangle;
import com.company.L.Square;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rc = new Rectangle(4,4);
        System.out.println(rc.area());
        Square sq = new Square(4);
        System.out.println(sq.area());
    }
}
