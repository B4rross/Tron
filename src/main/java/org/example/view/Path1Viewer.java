package org.example.view;

import org.example.gui.GUI;
import org.example.model.Path;

public class Path1Viewer implements ElementViewer<Path> {
    @Override
    public void draw(Path path, GUI gui) {
        gui.drawPath1(path.getPos());
    }
}
