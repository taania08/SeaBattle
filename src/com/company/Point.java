package com.company;

public class Point {

    private Integer x;
    private Integer y;

    public Point (Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    public void shows() {
        System.out.println("x = " + x + " y = " + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


}
