import jdk.nashorn.internal.runtime.JSONListAdapter;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Game extends JFrame {


//    private static Bird bird = null;




    private static ArrayList<Box> boxList = new ArrayList<>();


    public Game() {
        boxList.add(new Box(0,600,Main.width,40));
        boxList.add(new Box(150,150,40,40));
//        this.add(new Box(0,500,Main.width,40));


    }

    private Box box(int x, int y, int w, int h) {
        return new Box(x,y,w,h);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.fillRect(0,0,Main.width,Main.height);


        // GAME INSTANCEING UNDER HERE!!!!!!


        for(Box b : boxList) {
            b.paint(g);
            b.repaint(b.getX(),b.getY(),b.getWidth(),b.getHeight());
        }


    }

}
