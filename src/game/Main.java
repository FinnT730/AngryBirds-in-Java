package game;

import javax.swing.*;

public class Main {


//    private static Bird bird = new Bird();
    public static final int width = 640;
    public static final int height = 640;

    public static void main(String[] args) {
        JFrame frame = new Game();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        frame.add(bird);
    }

}
