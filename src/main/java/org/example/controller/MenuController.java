package org.example.controller;

import org.example.Game;
import org.example.gui.GUI;
import org.example.model.ArenaBuilder;
import org.example.model.Menu;
import org.example.state.GameState;

import java.io.IOException;

public class MenuController extends Controller<Menu> {
    public MenuController(Menu menu) {
        super(menu);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case UP1:
                getModel().previousEntry();
                break;
            case DOWN1:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedExit()) game.setState(null);
                if (getModel().isSelectedStart()) game.setState(new GameState(new ArenaBuilder().createArena()));
        }
    }
}