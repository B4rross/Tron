package org.example.view;

import org.example.gui.GUI;
import org.example.model.Player;

public class Player1Viewer implements ElementViewer<Player> {
    @Override
    public void draw(Player player, GUI gui) {
        gui.drawPlayer1(player.getPos());
    }
}