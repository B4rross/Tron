import org.example.controller.Controller;
import org.example.controller.Player2Controller;
import org.example.model.Arena;
import org.example.model.Player;
import org.example.model.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerMovementTest {

    private Player2Controller controller;
    private Player hero;
    private Arena arena;

    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10);

        hero = new Player(5, 5, 1);
        arena.setPlayer2(hero);

        controller = new Player2Controller(arena);
    }

    @Test
    void moveHeroRightEmpty() {
        controller.movePlayerRight();
        assertEquals(6, hero.getPos().getX());
    }
    @Test
    void moveHeroRightBlocked() {
        arena.addPath1(new Position(6,5));
        controller.movePlayerRight();
        assertEquals(5, hero.getPos().getX());
    }

}
