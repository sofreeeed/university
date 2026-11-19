package ru.mirea.practice5.lab24.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    JMenu file = new JMenu("File");
    JMenuBar menu = new JMenuBar();
    JMenuItem nw = new JMenuItem("New");
    JMenuItem open = new JMenuItem("Open");
    JMenuItem save = new JMenuItem("Save");
    JMenuItem exit = new JMenuItem("Exit");
    IDocument document;
    ICreateDocument factory = new TextCreateDocument();

    public Window(){
        setSize(400,500);
        setLayout(new FlowLayout());
        add(menu);
        menu.add(file);
        file.add(nw);
        file.add(open);
        file.add(save);
        file.add(exit);

        nw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                document = factory.createNew();
            }
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                document = factory.createOpen();
                document.Open();
            }
        });

        exit.addActionListener(e-> System.exit(0));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
