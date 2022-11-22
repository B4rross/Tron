package org.example.model;

public abstract class Element {
    protected Position pos;

    public Element(int x, int y){
        pos=new Position(x,y);
    }

    public Position getPos(){return pos;}

    public void setPos(Position pos_){pos=pos_;}

}
