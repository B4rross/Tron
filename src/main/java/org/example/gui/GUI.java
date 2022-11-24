package org.example.gui;
import org.example.model.Position;

import java.io.IOException;

public interface GUI {

        ACTION getNextAction() throws IOException;

        void drawPlayer1(Position position);

        void drawPlayer2(Position position);

        void drawPath1(Position position);

        void drawPath2(Position position);

        void drawText(Position position, String text, String color);

        void clear();

        void refresh() throws IOException;

        void close() throws IOException;

        enum ACTION {UP1, RIGHT1, DOWN1, UP2, RIGHT2, DOWN2, LEFT2, LEFT1, NONE, QUIT, SELECT}

}
