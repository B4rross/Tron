package org.example.model;


import java.util.ArrayList;
import java.util.List;

public class Arena {

    private int score1;
    private int score2;
    private final int width;
    private final int height;

    private Player player1;
    private Player player2;

    private final List<Path> paths1 = new ArrayList<>();
    private final List<Path> paths2 = new ArrayList<>();

    public Arena(int width, int height) {
        score1=0;
        score2=0;
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
    public int getScore1(){
        return score1;
    }
    public int getScore2(){
        return score2;
    }

    public void addPath1(Position position){
        Path path = new Path(position.getX(), position.getY());
        paths1.add(path);
    }

    public void addPath2(Position position){
        Path path = new Path(position.getX(), position.getY());
        paths2.add(path);
    }

    public void restartArena(int i1, int i2){
        paths1.clear();
        paths2.clear();
        player1.setPos(new Position(5, 25));
        player1.setDirection(2);
        player2.setPos(new Position(95, 25));
        player2.setDirection(4);
        score1+=i1;
        score2+=i2;
    }

    public boolean isEmpty(Position position) {
        if (position.getX()<0 || position.getY()<0 || position.getY()>49 || position.getX()>99){
            return false;
        }
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
