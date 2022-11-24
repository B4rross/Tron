package org.example.view;

import org.example.gui.GUI;
import org.example.model.Element;

public interface ElementViewer<T extends Element> {
    void draw(T element, GUI gui);
}
