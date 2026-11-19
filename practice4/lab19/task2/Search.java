package ru.mirea.practice4.lab19.task2;

import ru.mirea.practice4.lab21.task2.Array;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Search extends JFrame {
    JTextField txt = new JTextField(10);
    JButton one =  new JButton("search");
    JTextField txt2 =new JTextField(20);

    JButton two = new JButton("sort");
    Student[] st = new Student[]{new Student("Ivan", 10), new Student("Dima", 13), new Student("Valera", 15), new Student("Dima2",18), new Student("Igor",20)};
    public Search(){
        setLayout(new GridLayout(3,1));
        setSize(500,500);
        for(int i=0;i<3;i++){
            JPanel pan = new JPanel();
            if(i==2){
                pan.setLayout(new GridLayout(1,2));
                pan.add(one);
                pan.add(two);
            }
            else if(i==0){
                pan.setLayout(new GridLayout(1,1));
                pan.add(txt);
            }
            else{
                pan.setLayout(new GridLayout(1,1));
                pan.add(txt2);
            }
            add(pan);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txt2.setFocusable(false);
        txt2.setEditable(false);
        one.setForeground(Color.RED);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt2.setText("");
                int c=0;
                for(int i=0;i<st.length;i++){
                    if(st[i].getName().contains(txt.getText())){
                        txt2.setText(txt2.getText()+" "+ st[i]);
                        c=1;
                  }
              }
                if (c==0){
                    throw new InnException("никто не найден");
                }
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<String> str = new ArrayList<>();
                String s;
                String cur_str=txt2.getText();
                int start=0;
                for(int i=0;i<cur_str.length();i++) {
                    String current = String.valueOf(cur_str.charAt(i));
                    String next = "";
                    if (i + 1 != cur_str.length()) {
                        next = String.valueOf(cur_str.charAt(i+1));;
                    }
                    if (current.matches("[0-9]") && (next.equals(" ") || next.isEmpty())) {
                        str.add(cur_str.substring(start, i + 1).trim());
                        start=i+2;
                    }
                }

                Object[][] gda = new Object[str.size()][2];
                for(int i=0;i< gda.length;i++) {
                    gda[i] = str.get(i).split(" ");
                    System.out.println(gda[i][0]+" "+gda[i][1].getClass());
                }

                for(int i=0;i<gda.length-1;i++){
                    Object[] cur = gda[i];
                    int x1 = Integer.parseInt((String) gda[i][1]);
                    int x2 = Integer.parseInt((String) gda[i+1][1]);
                    System.out.println(x1);
                    if(x1<x2){
                        gda[i] = gda[i+1];
                        gda[i+1] = cur;
                    }
                }
                txt2.setText("");
                for(int i=0;i< gda.length;i++){
                    txt2.setText(txt2.getText()+" "+gda[i][0]+" "+ gda[i][1]);
                }
            }
        });
        }

    public static class InnException extends RuntimeException {
        public InnException(String errorMessage) {
            super(errorMessage);
        }
    }
}
