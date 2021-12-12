package com.corejava;

import java.awt.*;

public class PointComputation {
    public static void main(String[] args) {
        Point p1 = new Point(4,6);
        Point p2 = new Point(8,10);
        double length = Math.sqrt(Math.pow(p2.x - p1.x,2) + Math.pow(p2.y - p1.y,2));
        System.out.println(p1.distance(p2));
        System.out.println("Line of length is " + length);

    }
}
