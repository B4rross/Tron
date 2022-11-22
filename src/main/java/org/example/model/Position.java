package org.example.model;

public class Position {
    private int x;
    private int y;

    public Position(int x_, int y_){
        x=x_;
        y=y_;
    }

    public int getY(){
        return y;
    }

    public int getX(){
        return x;
    }

    public Position getLeft() {
        return new Position(x - 1, y);
    }

    public Position getRight() {
        return new Position(x + 1, y);
    }

    public Position getUp() {
        return new Position(x, y - 1);
    }

    public Position getDown() {
        return new Position(x, y + 1);
    }
}
