package com.samraitan;

import java.awt.*;

public class WinA {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public WinA (int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
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


