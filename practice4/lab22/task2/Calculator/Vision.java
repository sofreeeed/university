package ru.mirea.practice4.lab22.task2.Calculator;

import javax.swing.*;
import java.awt.*;

public class Vision extends JFrame {
    JTextArea txt = new JTextArea();
    JTextArea txt1 = new JTextArea();
    JButton ranv = new JButton("=");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton fourth = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton zero = new JButton("0");
    JButton seven = new JButton("7");
    JButton eighth = new JButton("8");
    JButton nine = new JButton("9");
    JButton sum = new JButton("+");
    JButton substring = new JButton("-");
    JButton multiply = new JButton("*");
    JButton del = new JButton("/");
    JButton ls = new JButton("(");
    JButton rs = new JButton(")");
    Font fnt = new Font("Times new Roman", Font.BOLD, 20);
    JButton C = new JButton("C");
    JButton point = new JButton(".");
    JButton backspace = new JButton("<--");
    JButton CE = new JButton("CE");

    public Vision(){
        setLayout(new BorderLayout());
        setSize(500,600);

        txt.setLineWrap(true);
        txt.setWrapStyleWord(true);
        JPanel right = new JPanel(new BorderLayout());
        txt.setPreferredSize(new Dimension(200,0));
        right.add(txt,BorderLayout.CENTER);

        JPanel left = new JPanel(new BorderLayout());
        JPanel buttons = new JPanel(new GridLayout(5,4,5,5));
        txt1.setLineWrap(true);
        txt1.setWrapStyleWord(true);
        txt1.setPreferredSize(new Dimension(0,80));
        ranv.setPreferredSize(new Dimension(0, 50));
        txt1.setFont(fnt);
        txt1.setEditable(false);
        txt.setEditable(false);

        left.add(txt1, BorderLayout.NORTH);
        buttons.add(C);
        buttons.add(CE);
        buttons.add(point);
        buttons.add(backspace);
        buttons.add(seven);
        buttons.add(eighth);
        buttons.add(nine);
        buttons.add(sum);
        buttons.add(fourth);
        buttons.add(five);
        buttons.add(six);
        buttons.add(substring);
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(multiply);
        buttons.add(ls);
        buttons.add(zero);
        buttons.add(rs);
        buttons.add(del);
        left.add(ranv, BorderLayout.SOUTH);
        left.add(buttons, BorderLayout.CENTER);


        add(left,BorderLayout.CENTER);
        add(right, BorderLayout.EAST);

        one.addActionListener(new Input(txt1, "1"));
        two.addActionListener(new Input(txt1, "2"));
        three.addActionListener(new Input(txt1, "3"));
        fourth.addActionListener(new Input(txt1, "4"));
        five.addActionListener(new Input(txt1, "5"));
        six.addActionListener(new Input(txt1, "6"));
        seven.addActionListener(new Input(txt1, "7"));
        eighth.addActionListener(new Input(txt1, "8"));
        nine.addActionListener(new Input(txt1, "9"));
        zero.addActionListener(new Input(txt1, "0"));
        ls.addActionListener(new Input(txt1, "("));
        rs.addActionListener(new Input(txt1, ")"));
        point.addActionListener(new Input(txt1, "."));
        del.addActionListener(new Operation(txt1, "/"));
        multiply.addActionListener(new Operation(txt1, "*"));
        sum.addActionListener(new Operation(txt1,"+"));
        substring.addActionListener(new Operation(txt1, "-"));
        backspace.addActionListener(new BackSpace(txt1));
        ranv.addActionListener(new Ravenstvo(txt1));






        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
