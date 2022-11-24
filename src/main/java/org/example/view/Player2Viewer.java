package org.example.view;

import org.example.gui.GUI;
import org.example.model.Player;

public class Player2Viewer implements ElementViewer<Player> {
    @Override
    public void draw(Player player, GUI gui) {
        gui.drawPlayer2(player.getPos());
    }
}