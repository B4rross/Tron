package org.example.controller;

import org.example.Game;
import org.example.gui.GUI;
import org.example.model.Arena;
import org.example.model.Position;

public class Player2Controller extends GameController {
    public Player2Controller(Arena arena) {
        super(arena);
    }

    public void setDirectionLeft() { getModel().getPlayer2().setDirection(4); }
    public void setDirectionRight() {
        getModel().getPlayer2().setDirection(2);
    }
    public void setDirectionUp() {
        getModel().getPlayer2().setDirection(1);
    }
    public void setDirectionDown() {
        getModel().getPlayer2().setDirection(3);
    }

    public void movePlayerLeft() { movePlayer(getModel().getPlayer2().getPos().getLeft()); }

    public void movePlayerRight() {
        movePlayer(getModel().getPlayer2().getPos().getRight());
    }

    public void movePlayerUp() {
        movePlayer(getModel().getPlayer2().getPos().getUp());
    }

    public void movePlayerDown() {
        movePlayer(getModel().getPlayer2().getPos().getDown());
    }



    private void movePlayer(Position position) {
        if (getModel().isEmpty(position)) {
            getModel().getPlayer2().setPos(position);
        }
        else getModel().restartArena(1,0);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {

        getModel().addPath2(getModel().getPlayer2().getPos());

        if (action == GUI.ACTION.UP2) setDirectionUp();
        if (action == GUI.ACTION.RIGHT2) setDirectionRight();
        if (action == GUI.ACTION.DOWN2) setDirectionDown();
        if (action == GUI.ACTION.LEFT2) setDirectionLeft();


        switch (getModel().getPlayer2().getDirection()){
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