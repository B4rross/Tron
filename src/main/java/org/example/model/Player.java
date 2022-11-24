package org.example.model;

public class Player extends Element{
    private int direction;
    public Player(int x, int y, int d) {
        super(x, y);
        direction=d;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getDirection(){
        return direction;
    }
}
