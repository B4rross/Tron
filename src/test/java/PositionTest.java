import org.example.model.Element;
import org.example.model.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {



    @Test
    public void LeftTest(){
        Position position = new Position(1,2);
        position=position.getLeft();
        assertEquals(0, position.getX());
        assertEquals(2, position.getY());
    }

    @Test
    public void UpTest(){
        Position position = new Position(1,2);
        position=position.getUp();
        assertEquals(1, position.getX());
        assertEquals(1, position.getY());
    }

    @Test
    public void DownTest(){
        Position position = new Position(1,2);
        position=position.getDown();
        assertEquals(1, position.getX());
        assertEquals(3, position.getY());
    }

    @Test
    public void RightTest(){
        Position position = new Position(1,2);
        position=position.getRight();
        assertEquals(2, position.getX());
        assertEquals(2, position.getY());
    }
}
