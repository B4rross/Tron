package org.example.controller;

import org.example.Game;
import org.example.gui.GUI;
import org.example.model.Arena;
import org.example.model.Menu;
import org.example.state.MenuState;

import java.io.IOException;

public class ArenaController extends GameController {
    private final Player1Controller player1Controller;
    private final Player2Controller player2Controller;

    public ArenaController(Arena arena) {
        super(arena);

        this.player1Controller = new Player1Controller(arena);
        this.player2Controller = new Player2Controller(arena);

    }

    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT)
            game.setState(new MenuState(new Menu()));
        else {
            player1Controller.step(game, action, time);
            player2Controller.step(game, action, time);
        }
    }
}
