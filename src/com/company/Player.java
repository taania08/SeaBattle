package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private Integer id;
    private String name;

    private List <Ship> fleet = new ArrayList<>();

    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean fleetSunk(){
        //...
    }

    public boolean recieveAttack (Point p){
        
    }
}
