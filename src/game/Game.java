package game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.function.BiConsumer;

public class Game extends JFrame {


//    private static Bird bird = null;




    private static ArrayList<Box> boxList = new ArrayList<>();


    Game() {
        boxList.add(new Box(150,150,40,40));
        boxList.add(new Box(0,600,Main.width,40));
//        this.add(new game.Box(0,500,game.Main.width,40));


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


        BiConsumer<Integer, Box> renderBox = new BiConsumer<Integer, Box>() {
            @Override
            public void accept(Integer p, Box b) {
                b.paint(g);
            }


            ArrayList<Integer> ro = new ArrayList<>();

            @Override
            public BiConsumer<Integer, Box> andThen(BiConsumer<? super Integer, ? super Box> after) {
                if(after == null) {
                    return null;
                } else {
                    after.andThen((q,w) -> {
                    }).accept(ro.size(),new Box(0,0,Main.width,50));

                }
                return this::accept;
            }
        };

        renderBox.andThen((a,b) -> {

        }).accept(50,new Box(150,20,50,50));

//        renderBox.accept(60,new game.Box(200,200,30,30));

        boxList.forEach((a) -> {
            renderBox.accept(51, a);
        });

    }

}
