package com.company;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private List <Point> points = new ArrayList<>();
    private List <Boolean> hits = new ArrayList<>();
    private Point source;
    private String orientation;
    private Integer size;

    public Ship(Point source, String orientation, Integer size) {
        this.source = source;
        this.orientation = orientation;
        this.size = size;
    }

    public boolean isSunk(){
        //...
    }

    public boolean recieveAttack (Point p){
        //...
    }


}
