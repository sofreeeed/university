package ru.mirea.practice3.lab5.task1;

import java.awt.*;
import javax.swing.*;

public class Main {
    static int count_RM=0;
    static int count_M=0;
    static String Scorer=" ";
    public static void main(String[] args){
        String real= "C:/Users/leoni/Downloads/Aq.gif";
        String milan = "C:/Users/leoni/Downloads/ac-milan-logo-2880x1800-18107.jpg";
        JFrame frame  = new JFrame("Milan vs Real Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(1000,1000));
        JButton b1= new JButton("Мадрид");
        JButton b2= new JButton("Милан");
        JLabel l1 = new JLabel("Result "+count_RM+" x "+count_M);
        JLabel l2 = new JLabel("Last Scorer: ");
        JLabel l3 = new JLabel("Winner ");
        JLabel image = new JLabel(" ",SwingConstants.CENTER);
        ImageIcon rl = new ImageIcon(real);
        ImageIcon ml = new ImageIcon(milan);

        b1.addActionListener(Se -> {
            image.setIcon(rl);
            count_RM++;
            Scorer="Мадрид";
            l2.setText("Last Scorer: "+Scorer);
            l1.setText("Result "+count_RM+" x "+count_M);
            l3.setText("Winner " + winner(count_RM, count_M));
        });
        b2.addActionListener(e -> {
            image.setIcon(ml);

            count_M++;
            Scorer="Милан";
            l2.setText("Last Scorer: "+Scorer);
            l1.setText("Result "+count_RM+" x "+count_M);
            l3.setText("Winner " + winner(count_RM, count_M));
        });
        JPanel labelsPanel = new JPanel(new GridLayout(3, 1));
        labelsPanel.add(l1);
        labelsPanel.add(l2);
        labelsPanel.add(l3);
        labelsPanel.add(image);

        panel.add(b1,BorderLayout.WEST);
        panel.add(b2,BorderLayout.EAST);
        panel.add(labelsPanel,BorderLayout.CENTER);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static String winner(int a, int b){
        if (a>b){
            return "Real Madrid";
        }
        else if(a<b){
            return "Milano";
        }
        else return "ничья";
    }
}
