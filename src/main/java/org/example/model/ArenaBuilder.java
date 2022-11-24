package org.example.model;

public class ArenaBuilder {
    public Arena createArena() {
        Arena arena = new Arena(100, 50);

        arena.setPlayer1(createPlayer1());
        arena.setPlayer2(createPlayer2());

        return arena;
    }

    private Player createPlayer1() {
        return new Player(5, 25,2);
    }

    private Player createPlayer2() {
        return new Player(95, 25,4);
    }
}
