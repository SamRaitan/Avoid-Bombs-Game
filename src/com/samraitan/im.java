package com.samraitan;

import java.awt.*;

public class im {

        private int x;
        private int y;
        private int width;
        private int height;


        public im (int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;

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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void paint (Graphics graphics) {

        }


        public int getXx() {
            return x;
        }
        public int getYy() { return y; }
    }


