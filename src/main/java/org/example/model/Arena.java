package org.example.model;


import java.util.ArrayList;
import java.util.List;

public class Arena {
    private final int width;
    private final int height;

    private Player player1;
    private Player player2;

    private List<Path> paths1 = new ArrayList<>();
    private List<Path> paths2 = new ArrayList<>();

    public Arena(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public List<Path> getPaths1() {
        return paths1;
    }

    public List<Path> getPaths2() {
        return paths2;
    }

    public void addPath1(Position position){
        Path path = new Path(position.getX(), position.getY());
        paths1.add(path);
    }

    public void addPath2(Position position){
        Path path = new Path(position.getX(), position.getY());
        paths2.add(path);
    }

    public boolean isEmpty(Position position) {
        for (Path path : paths1) {
            if (path.getPos().equals(position))
                return false;
        }
        for (Path path : paths2) {
            if (path.getPos().equals(position))
                return false;
        }
        return true;
    }
}
