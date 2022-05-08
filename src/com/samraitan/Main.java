package com.samraitan;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main extends JFrame {
    public static final int WINDOW_WIDTH = 640;
    public static final int WINDOW_HEIGTH = 630;

    public static void main(String[] args) {
        Main window = new Main();
    }
    public Main() {
        GameScena gameScena = new GameScena(0,0,WINDOW_WIDTH,WINDOW_HEIGTH);

        this.add(gameScena);
        this.setSize(WINDOW_WIDTH,WINDOW_HEIGTH);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);




    }
}
