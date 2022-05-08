package com.samraitan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerM implements KeyListener {

    public int num;
    private Player player;
    private im im;

    public PlayerM(Player player,im im) {
        this.player = player;
        this.im = im;

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_UP:
                this.player.moveUp();
                this.im.moveUp();
                num = 1;
                break;
            case KeyEvent.VK_DOWN:
                this.player.moveDown();
                this.im.moveDown();
                num = 2;
                break;
            case KeyEvent.VK_LEFT:
                this.player.moveLeft();
                this.im.moveLeft();
                num = 3;
                break;
            case KeyEvent.VK_RIGHT:
                this.player.moveRight();
                this.im.moveRight();
                num = 4;
                break;
            case KeyEvent.VK_SPACE:
                this.player.stop();
                this.im.stop();
                num = 5;
                break;
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}

