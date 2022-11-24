package org.example.state;

import org.example.controller.ArenaController;
import org.example.controller.Controller;
import org.example.model.Arena;
import org.example.view.GameViewer;
import org.example.view.Viewer;

public class GameState extends State<Arena> {
    public GameState(Arena arena) {
        super(arena);
    }

    @Override
    protected Viewer<Arena> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<Arena> getController() {
        return new ArenaController(getModel());
    }
}
