package com.samraitan;

import java.awt.*;

public class Obstacles {

        private int x;
        private int y;
        private int width;
        private int height;
        private Color color;

        public Obstacles(int x, int y, int width, int height, Color red) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = red;
        }

        public void paint(Graphics graphics) {

            graphics.fillRect(this.x, this.y, this.width, this.height);
        }


}
