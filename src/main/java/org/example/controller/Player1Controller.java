package org.example.controller;

import org.example.Game;
import org.example.gui.GUI;
import org.example.model.Arena;
import org.example.model.Position;

public class Player1Controller extends GameController {
    public Player1Controller(Arena arena) {
        super(arena);
    }

    public void setDirectionLeft() { getModel().getPlayer1().setDirection(4); }
    public void setDirectionRight() {
        getModel().getPlayer1().setDirection(2);
    }
    public void setDirectionUp() {
        getModel().getPlayer1().setDirection(1);
    }
    public void setDirectionDown() {
        getModel().getPlayer1().setDirection(3);
    }

    public void movePlayerLeft() { movePlayer(getModel().getPlayer1().getPos().getLeft()); }

    public void movePlayerRight() {
        movePlayer(getModel().getPlayer1().getPos().getRight());
    }

    public void movePlayerUp() {
        movePlayer(getModel().getPlayer1().getPos().getUp());
    }

    public void movePlayerDown() {
        movePlayer(getModel().getPlayer1().getPos().getDown());
    }



    private void movePlayer(Position position) {
        if (getModel().isEmpty(position)) {
            getModel().getPlayer1().setPos(position);
        }
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {

        getModel().addPath1(getModel().getPlayer1().getPos());

        if (action == GUI.ACTION.UP1) setDirectionUp();
        if (action == GUI.ACTION.RIGHT1) setDirectionRight();
        if (action == GUI.ACTION.DOWN1) setDirectionDown();
        if (action == GUI.ACTION.LEFT1) setDirectionLeft();


        switch (getModel().getPlayer1().getDirection()){
            case 1: movePlayerUp();
                break;
            case 2: movePlayerRight();
                break;
            case 3: movePlayerDown();
                break;
            case 4: movePlayerLeft();
                break;
        }

    }
}
