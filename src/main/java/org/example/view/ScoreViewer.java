package org.example.view;

import org.example.gui.GUI;
import org.example.model.Position;

public class ScoreViewer {
    public void draw(GUI gui, int s2, int width,int s1){
        String string="";
        String score="";
        for(int i=0; i < width/2-5; i++){
            string=string.concat("H");
        }
        score=score.concat(Integer.toString(s2));
        score=score.concat(" - ");
        score=score.concat(Integer.toString(s1));

        gui.drawText(new Position(0,0),string,"#FFFFFF");
        gui.drawText(new Position(width/2-3,0),score,"#FFFFFF");
        gui.drawText(new Position(width/2+5,0),string,"#FFFFFF");



    }
}
