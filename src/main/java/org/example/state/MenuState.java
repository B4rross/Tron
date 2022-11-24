package org.example.state;

import org.example.controller.Controller;
import org.example.controller.MenuController;
import org.example.model.Menu;
import org.example.view.MenuViewer;
import org.example.view.Viewer;

public class MenuState extends State<Menu> {
    public MenuState(Menu model) {
        super(model);
    }

    @Override
    protected Viewer<Menu> getViewer() {
        return new MenuViewer(getModel());
    }

    @Override
    protected Controller<Menu> getController() {
        return new MenuController(getModel());
    }
}
