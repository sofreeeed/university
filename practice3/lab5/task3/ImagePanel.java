package ru.mirea.practice3.lab5.task3;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

public class ImagePanel extends JPanel {
    private BufferedImage bi;

    public ImagePanel(String image){
        try {
            this.bi = ImageIO.read(new File(image));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bi,0,0,getWidth(),getHeight(),this);
    }
}
