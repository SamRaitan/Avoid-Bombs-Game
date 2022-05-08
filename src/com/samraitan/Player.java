package com.samraitan;

import java.awt.*;

public class Player {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Player (int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public void moveRight () {
           this.x += 20 ;
    }
    public void moveLeft () {
        this.x -= 20;
    }
    public void moveUp () {
        this.y -= 20 ;
    }
    public void moveDown () {
        this.y += 20 ;
    }
    public void stop () {
        this.y = y ;
        this.x = x ;
    }



    public void paint (Graphics graphics) {
        graphics.setColor(color);
        graphics.drawRect(this.x,this.y,this.width,this.height);
    }


    public int getX() {
        return x;
    }
    public int getY() { return y; }
}
