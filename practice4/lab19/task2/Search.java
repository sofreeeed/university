package ru.mirea.practice4.lab19.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search extends JFrame {
    JTextField txt = new JTextField(10);
    JButton one =  new JButton("search");
    JTextField txt2 =new JTextField(20);
    Student[] st = new Student[]{new Student("Ivan", 10), new Student("Dima", 13), new Student("Valera", 15), new Student("Dima2",18), new Student("Igor",20)};
    public Search(){
        setLayout(new GridLayout(3,1));
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(txt);
        add(txt2);
        txt2.setFocusable(false);
        txt2.setEditable(false);
        add(one);
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
    }
    public static class InnException extends RuntimeException {
        public InnException(String errorMessage) {
            super(errorMessage);
        }
    }
}
