package ru.mirea.practice3.lab5.task4;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

public class ImagePanel extends JPanel{
    private BufferedImage[] bi;
    private int count=0;
    private Timer timer;

    public ImagePanel(String[] image, int delay){
        bi = new BufferedImage[image.length];
        for(int i=0; i<bi.length; i++) {
            try {
                this.bi[i] = ImageIO.read(new File(image[i]));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        timer = new Timer(delay, e->{
            if(bi.length>0){
                count =(count +1)%bi.length;
                repaint();
            }
        });
        timer.start();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bi[count],0,0,getWidth(),getHeight(),this);
    }
}
