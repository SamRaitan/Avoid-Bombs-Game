package com.samraitan;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.Random;

import static com.samraitan.Main.WINDOW_HEIGTH;
import static com.samraitan.Main.WINDOW_WIDTH;

public class GameScena extends JPanel // implements ActionListener
 {

    private int x;
    private int y;
    private int x2 = 40;
    private int y2 = 40;
    private Player player;
    private  PlayerM playerM ;
    private Obstacles obstacles;
    private WinA winA;
    private JLabel label;
    private JLabel label2;
    private JButton jButton;
    private boolean flag = true;
    private ImageIcon imageIcon;
    private ImageIcon imageIcon2;
    private ImageIcon imageIcon3;
    private im im;



     public GameScena(int x, int y, int width, int height) {

         this.imageIcon3 = new ImageIcon("player.jpeg");
        this.imageIcon = new ImageIcon("bomb.jpeg");
        this.imageIcon2 = new ImageIcon("castle.jpeg");
        this.imageIcon3 = new ImageIcon("player.jpeg");




        this.setLayout(null);
        label = new JLabel(" you lose  :-( ",SwingConstants.CENTER);
        label.setFont(new Font("Serif",Font.BOLD,40));
        label.setForeground(Color.white);
        label.setBackground(new Color(113, 87, 148));
        label.setOpaque(true);
        this.add(label);
        label.setVisible(false);
        label.setBounds(300,230,340,40);

        this.setLayout(null);
        label2 = new JLabel(" you win  :-) ",SwingConstants.CENTER);
        label2.setFont(new Font("Times",Font.BOLD,40));
        label2.setForeground(Color.black);
        label2.setBackground(Color.decode("#FFD700"));
        label2.setOpaque(true);
        this.add(label2);
        label2.setVisible(false);
        label2.setBounds(300,230,340,40);


        this.setBackground( new Color(247, 247, 247) );
        this.setBounds(x, y, width, height);
        this.x = 40;
        this.y  = 40;
        this.player = new Player(this.x,this.y,20,20, new Color(247, 247, 247));
        this.winA =new WinA(560,560,40,40,new Color(247, 247, 247));
        this.im = new im(this.x2,this.y2,20,20);


        this.MainGameLoop();

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.imageIcon2.paintIcon(this,g,560,560);

        //g.setColor(new Color(247, 247, 247));
        g.setColor(Color.red);
        g.drawRect(600,280 , 20, 20);
        this.imageIcon.paintIcon(this,g,587,265-2);

        g.setColor(Color.red);
        g.fillRect(280,80 , 20, 20);
        this.imageIcon.paintIcon(this,g,270-3,65-2);

        g.setColor(Color.red);
        g.fillRect(440,200 , 20, 20);
        this.imageIcon.paintIcon(this,g,430-3,185-2);

        g.setColor(Color.red);
        g.fillRect(440,500 , 20, 20);
        this.imageIcon.paintIcon(this,g,430-3,485-2);

        g.setColor(Color.red);
        g.fillRect(160,320 , 20, 20);
        this.imageIcon.paintIcon(this,g,150-3,305-2);

        g.setColor(Color.red);
        g.fillRect(100,540 , 20, 20);
        this.imageIcon.paintIcon(this,g,90-3,525-2);

        g.setColor(Color.red);
        g.fillRect(80,340 , 20, 20);
        this.imageIcon.paintIcon(this,g,70-3,325-2);

        g.setColor(Color.red);
        g.fillRect(280,300, 20, 20);
        this.imageIcon.paintIcon(this,g,270-3,285-2);

        g.setColor(Color.red);
        g.fillRect(40,200 , 20, 20);
        this.imageIcon.paintIcon(this,g,30-3,185-2);

        g.setColor(Color.red);
        g.fillRect(160,520 , 20, 20);
        this.imageIcon.paintIcon(this,g,150-3,505-2);

        g.setColor(Color.red);
        g.fillRect(200,240, 20, 20);
        this.imageIcon.paintIcon(this,g,190-3,225-2);

        g.setColor(Color.red);
        g.fillRect(160,40 , 20, 20);
        this.imageIcon.paintIcon(this,g,150-3,25-2);

        g.setColor(Color.red);
        g.fillRect(120,180 , 20, 20);
        this.imageIcon.paintIcon(this,g,110-3,165-2);

        g.setColor(Color.red);
        g.fillRect(20,100 , 20, 20);
        this.imageIcon.paintIcon(this,g,10-3,85-2);

        g.setColor(Color.red);
        g.fillRect(360,20 , 20, 20);
        this.imageIcon.paintIcon(this,g,350-3,5-2);



        g.setColor(Color.red);
        g.fillRect(400,400 , 20, 20);
        this.imageIcon.paintIcon(this,g,400-13,400-17);

        g.setColor(Color.red);
        g.fillRect(500,120 , 20, 20);
        this.imageIcon.paintIcon(this,g,500-13,120-17);

        g.setColor(Color.red);
        g.fillRect(220,420 , 20, 20);
        this.imageIcon.paintIcon(this,g,220-13,420-17);

        g.setColor(Color.red);
        g.fillRect(540,540 , 20, 20);
        this.imageIcon.paintIcon(this,g,540-13,540-17);

        g.setColor(Color.red);
        g.fillRect(540,580 , 20, 20);
        this.imageIcon.paintIcon(this,g,540-13,580-17);

        g.setColor(Color.red);
        g.fillRect(580,540 , 20, 20);
        this.imageIcon.paintIcon(this,g,580-13,540-17);

        g.setColor(Color.red);
        g.fillRect(620,380 , 20, 20);
        this.imageIcon.paintIcon(this,g,620-13,380-17);

        g.setColor(Color.red);
        g.fillRect(460,280 , 20, 20);
        this.imageIcon.paintIcon(this,g,460-13,280-17);

        g.setColor(Color.red);
        g.fillRect(0,440 , 20, 20);
        this.imageIcon.paintIcon(this,g,0-13,440-17);



        this.imageIcon3.paintIcon(this,g,this.x2-4,this.y2-3);

        //this.im.paint(g);
        this.winA.paint(g);
        this.player.paint(g);
    }

    public int collide () {
        if (player.getX() ==600 && player.getY()==280){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==280 && player.getY()==80){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==440 && player.getY()==200){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==440 && player.getY()==500){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==160 && player.getY()==320){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==100 && player.getY()==540){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==80 && player.getY()==340){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==280 && player.getY()==300){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==40 && player.getY()==200){
            this.label.setVisible(true);
            tryAgain();
            return -1;
        }
        if (player.getX() ==160 && player.getY()==520){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==200 && player.getY()==240){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==160 && player.getY()==40){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==120 && player.getY()==180){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() ==20 && player.getY()==100){
            this.label.setVisible(true);
            tryAgain();
            return -1;
        }
        if (player.getX() ==360 && player.getY()==20){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }


        if (player.getX() ==400 && player.getY()==400){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        } if (player.getX() ==500 && player.getY()==120){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        } if (player.getX() ==220 && player.getY()==420){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        } if (player.getX() ==540 && player.getY()==540){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        } if (player.getX() ==540 && player.getY()==580){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        } if (player.getX() ==580 && player.getY()==540){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        } if (player.getX() ==620 && player.getY()==380){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        } if (player.getX() ==460 && player.getY()==280){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        } if (player.getX() ==0 && player.getY()==440){
            this.label.setVisible(true);
            this.jButton.setVisible(true);
            return -1;
        }
        if (player.getX() > 540 && player.getX()< 600 && player.getY() > 540 && player.getY()<600 ){
            this.label2.setVisible(true);
            this.winA =new WinA(560,580,40,20,Color.black);
            return -1;
        }

        return 0;
    }

    public void tryAgain () {
   //
   //
   //    JFrame j = new JFrame();
   //     j.setSize(320, 315);
   //     j.setVisible(true);
   //     j.setResizable(false);
   //     j.setLayout(null);
   //     j.setLocationRelativeTo(null);
   //
   //     JButton jButton = new JButton("try again");
   //     jButton.setFont(new Font("Times", Font.ITALIC, 20));
   //     //jButton.addActionListener(this);
   //     jButton.setForeground(Color.black);
   //     jButton.setBackground(Color.black);
   //     jButton.setOpaque(true);
   //     jButton.setBounds(100, 120, 120, 40);
   //     jButton.setVisible(true);
   //
   //
   //     j.add(jButton);
   //
   //
    }

    public int limits () {
        if (player.getY() >= 600) {
            //player.moveUp();
            this.label.setVisible(true);
            return -1;
        }
        if (player.getY() < 0) {
            //player.moveDown();
            this.label.setVisible(true);
            return -1;
        }
        if (player.getX() >= 640) {
            //player.moveLeft();
            this.label.setVisible(true);
            return -1;
        }
        if (player.getX() < 0) {
            //player.moveRight();
            this.label.setVisible(true);
            return -1;
        }
        return 0;
    }

    public void MainGameLoop () {
        new Thread(() ->{
            PlayerM playerM = new PlayerM(this.player,this.im);
            this.setFocusable(true);
            this.requestFocus();
            this.addKeyListener(playerM);


            while (flag){

                limits();
                if (limits() == -1){
                    flag =false;
                }
                collide();
                if (collide()==-1){
                    flag =false;
                }




                switch (playerM.num) {
                    case 1:
                        this.player.moveUp();
                        this.y2 = player.getY();
                        if (collide()==-1){
                            flag =false;
                        }
                        if (limits() == -1){
                        flag =false;
                    }
                        break;    
                    case 2:       
                        this.player.moveDown();
                        this.y2 = player.getY();
                        if (collide()==-1){
                            flag =false;
                        }
                        if (limits() == -1){
                            flag =false;
                        }
                        break;
                    case 3:
                        this.player.moveLeft();
                        this.x2 = player.getX();
                        if (collide()==-1){
                            flag =false;
                        }
                        if (limits() == -1){
                            flag =false;
                        }
                        break;
                    case 4:
                        this.player.moveRight();
                        this.x2 = player.getX();
                        if (collide()==-1){
                            flag =false;
                        }
                        if (limits() == -1){
                            flag =false;
                        }
                        break;
                    case 5:
                        this.player.stop();
                        this.x2 = player.getX();
                        this.y2 = player.getY();
                        break;
                }
             //   player.moveDown();
             //   player.moveRight();
             //   player.moveLeft();
             //   player.moveUp();


                try {
                    Thread.sleep(80);
                    repaint();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


        }).start();

        Thread t1 = new Thread(() -> {

        });

    }

}


