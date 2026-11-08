package ru.mirea.practice3.lab15.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Calculator extends JFrame{
    JTextField txt = new JTextField(10);
    JTextField txt1 = new JTextField(10);
    JButton fir = new JButton("1");
    JButton sec = new JButton("2");
    JButton third = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eigth = new JButton("8");
    JButton nine = new JButton("9");
    JButton zero = new JButton("0");
    JButton point = new JButton(".");
    JButton ravn = new JButton("=");
    JButton plus = new JButton("+");
    JButton del = new JButton("/");
    JButton umn = new JButton("*");
    JButton min = new JButton("-");
    private double current_text;
    private String current_operation;
    JRootPane root = getRootPane();
    Font fnt = new Font("Times new roman", Font.BOLD,40);
    public Calculator(){
        super("Calculator");
        txt.setFont(fnt);
        setSize(600,600);
        setLayout(new BorderLayout());
        txt.setPreferredSize(new Dimension(0,200));
        JPanel up = new JPanel(new BorderLayout());
        txt1.setPreferredSize(new Dimension(0,50));
        txt1.setEditable(false);
        txt1.setFocusable(false);
        txt.setEditable(false);
        up.add(txt1, BorderLayout.NORTH);
        up.add(txt, BorderLayout.CENTER);
        add(up, BorderLayout.NORTH);
        JPanel rowtwo = new JPanel(new GridLayout(4,4));
        rowtwo.add(seven);
        rowtwo.add(eigth);
        rowtwo.add(nine);
        rowtwo.add(del);
        rowtwo.add(four);
        rowtwo.add(five);
        rowtwo.add(six);
        rowtwo.add(umn);
        rowtwo.add(fir);
        rowtwo.add(sec);
        rowtwo.add(third);
        rowtwo.add(min);
        rowtwo.add(zero);
        rowtwo.add(point);
        rowtwo.add(ravn);
        rowtwo.add(plus);
        add(rowtwo, BorderLayout.CENTER);



        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText()+"7");
            }
        });
        zero.addActionListener(new Input(txt, "0"));
        fir.addActionListener(new Input(txt,"1"));
        sec.addActionListener(new Input(txt,"2"));
        third.addActionListener(new Input(txt,"3"));
        four.addActionListener(new Input(txt,"4"));
        five.addActionListener(new Input(txt,"5"));
        six.addActionListener(new Input(txt,"6"));
        eigth.addActionListener(new Input(txt,"8"));
        nine.addActionListener(new Input(txt,"9"));
        point.addActionListener(new Input(txt,"."));
        umn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (current_operation == null) {
                    try {
                        current_text = Double.parseDouble(txt.getText());
                        current_operation = "*";
                        txt1.setText(txt.getText() + current_operation);
                        txt.setText("");
                    } catch (Exception ex) {
                        txt.setText("error");
                    }
                }else {
                    double x = Double.parseDouble(txt.getText());
                    txt1.setText(txt1.getText() + txt.getText());
                    switch (current_operation) {
                        case "*":
                            txt1.setText(String.valueOf(current_text * x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                        case "+":
                            txt1.setText(String.valueOf(current_text + x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                        case "-":
                            txt1.setText(String.valueOf(current_text - x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                        case "/":
                            txt1.setText(String.valueOf(current_text / x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                    }
                    current_operation = "*";

                }
            }
        });
        min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (current_operation == null) {
                    if(txt.getText()==null) {
                        try {
                            current_text = Double.parseDouble(txt.getText());
                            current_operation = "+";
                            txt1.setText(txt.getText() + current_operation);
                            txt.setText("");
                        } catch (Exception ex) {
                            txt.setText("error");
                        }
                    }else{
                        txt.setText("-");
                    }
                } else {
                    if (txt.getText() != null) {
                        double x = Double.parseDouble(txt.getText());
                        txt1.setText(txt1.getText() + txt.getText());
                        switch (current_operation) {
                            case "*":
                                txt1.setText(String.valueOf(current_text * x));
                                current_text = Double.parseDouble(txt1.getText());
                                txt.setText("");
                                break;
                            case "+":
                                txt1.setText(String.valueOf(current_text + x));
                                current_text = Double.parseDouble(txt1.getText());
                                txt.setText("");
                                break;
                            case "-":
                                txt1.setText(String.valueOf(current_text - x));
                                current_text = Double.parseDouble(txt1.getText());
                                txt.setText("");
                                break;
                            case "/":
                                txt1.setText(String.valueOf(current_text / x));
                                current_text = Double.parseDouble(txt1.getText());
                                txt.setText("");
                                break;
                        }
                        current_operation = "-";
                    }else{
                        txt.setText("-");
                    }
                }
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (current_operation == null) {
                    try {
                        current_text = Double.parseDouble(txt.getText());
                        current_operation = "+";
                        txt1.setText(txt.getText() + current_operation);
                        txt.setText("");
                    } catch (Exception ex) {
                        txt.setText("error");
                    }
                } else {
                    double x = Double.parseDouble(txt.getText());
                    txt1.setText(txt1.getText() + txt.getText());
                    switch (current_operation) {
                        case "*":
                            txt1.setText(String.valueOf(current_text * x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                        case "+":
                            txt1.setText(String.valueOf(current_text + x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                        case "-":
                            txt1.setText(String.valueOf(current_text - x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                        case "/":
                            txt1.setText(String.valueOf(current_text / x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                    }
                    current_operation = "+";

                }
            }
        });
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (current_operation == null) {
                    try {
                        current_text = Double.parseDouble(txt.getText());
                        current_operation = "/";
                        txt1.setText(txt.getText() + current_operation);
                        txt.setText("");
                    } catch (Exception ex) {
                        txt.setText("error");
                    }
                }else{
                double x = Double.parseDouble(txt.getText());
                txt1.setText(txt1.getText() + txt.getText());
                switch (current_operation) {
                    case "*":
                        txt1.setText(String.valueOf(current_text * x));
                        current_text = Double.parseDouble(txt1.getText());
                        txt.setText("");
                        break;
                    case "+":
                        txt1.setText(String.valueOf(current_text + x));
                        current_text = Double.parseDouble(txt1.getText());
                        txt.setText("");
                        break;
                    case "-":
                        txt1.setText(String.valueOf(current_text - x));
                        current_text = Double.parseDouble(txt1.getText());
                        txt.setText("");
                        break;
                    case "/":
                        txt1.setText(String.valueOf(current_text / x));
                        current_text = Double.parseDouble(txt1.getText());
                        txt.setText("");
                        break;
                }
                current_operation = "/";
            }
            }
        });
        ravn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x = Double.parseDouble(txt.getText());
                    txt1.setText(txt1.getText() + txt.getText());
                    switch (current_operation){
                        case "*": txt.setText(String.valueOf(current_text * x));break;
                        case "+": txt.setText(String.valueOf(current_text + x));break;
                        case "-": txt.setText(String.valueOf(current_text - x)); break;
                        case "/": txt.setText(String.valueOf(current_text / x)); break;
                    }
                }catch(Exception ex){
                    txt.setText("error");
                    txt1.setText("error");
                }
            }
        });

        root.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "enter");
        root.getActionMap().put("enter", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x = Double.parseDouble(txt.getText());
                    txt1.setText(txt1.getText() + txt.getText());
                    switch (current_operation) {
                        case "*":
                            txt1.setText(String.valueOf(current_text * x));
                            break;
                        case "+":
                            txt1.setText(String.valueOf(current_text + x));
                            break;
                        case "-":
                            txt1.setText(String.valueOf(current_text - x));
                            break;
                        case "/":
                            txt1.setText(String.valueOf(current_text / x));
                            break;
                    }
                    txt.setText("");
                }catch(Exception ex){
                    txt.setText("");
                    txt1.setText("error");
                }
            }
        });

        root.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke('+'), "plus");
        root.getActionMap().put("plus", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (current_operation == null) {
                    try {
                        current_text = Double.parseDouble(txt.getText());
                        current_operation = "+";
                        txt1.setText(txt.getText() + current_operation);
                        txt.setText("");
                    } catch (Exception ex) {
                        txt.setText("error");
                    }
                } else {
                    double x = Double.parseDouble(txt.getText());
                    txt1.setText(txt1.getText() + txt.getText());
                    switch (current_operation) {
                        case "*":
                            txt1.setText(String.valueOf(current_text * x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                        case "+":
                            txt1.setText(String.valueOf(current_text + x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                        case "-":
                            txt1.setText(String.valueOf(current_text - x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                        case "/":
                            txt1.setText(String.valueOf(current_text / x));
                            current_text = Double.parseDouble(txt1.getText());
                            txt.setText("");
                            break;
                    }
                    current_operation = "+";

                }
            }
        });

        for(int i=0; i<10;i++){
            String n = i+"";
            root.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_0+i,0), i+"");
            root.getActionMap().put(i+"", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt.setText(txt.getText()+n);
                }
            });
        }




        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
