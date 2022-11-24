package org.example.view;

import org.example.gui.GUI;
import org.example.model.Arena;
import org.example.model.Element;
import org.example.model.Position;

import java.util.List;

public class GameViewer extends Viewer<Arena> {
    public GameViewer(Arena arena) {
        super(arena);
    }

    @Override
    public void drawElements(GUI gui) {
        drawElements(gui, getModel().getPaths1(), new Path1Viewer());
        drawElements(gui, getModel().getPaths2(), new Path2Viewer());
        drawElement(gui, getModel().getPlayer1(), new Player1Viewer());
        drawElement(gui, getModel().getPlayer2(), new Player2Viewer());
    }

    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }

    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
}
