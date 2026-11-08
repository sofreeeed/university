package ru.mirea.practice3.lab12.task2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {
    private BufferedImage im;

    public ImagePanel(String x) {
        try {
            this.im = ImageIO.read(new File(x));
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.drawImage(im,0,0,getWidth(),getHeight(),this);
    }
}
