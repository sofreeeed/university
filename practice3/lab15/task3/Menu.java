package ru.mirea.practice3.lab15.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    JTextField txt = new JTextField(10);
    JMenuBar menubar  = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu save =  new JMenu("save");
    JMenuItem del = new JMenuItem("exit");
    JMenuItem copy = new JMenuItem("copy");
    JMenuItem paste = new JMenuItem("paste");
    JMenuItem cut = new JMenuItem("cut");
    JMenu edit = new JMenu("edit");
    JMenuItem help = new JMenuItem("help");
    JButton one = new JButton("Button 1");
    JButton two = new JButton("Button 2");
    public Menu(){
        setSize(500,500);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);
        file.add(save);
        file.add(del);
        edit.add(copy);
        edit.add(paste);
        edit.add(cut);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(menubar);
        del.addActionListener(e -> System.exit(0));
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection str = new StringSelection(txt.getText());
                Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
                clip.setContents(str, null);
            }
        });
        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection str = new StringSelection(txt.getText());
                Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
                clip.setContents(str, null);
                txt.setText("");
            }
        });
        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Transferable content = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
                    txt.setText(txt.getText()+(String) content.getTransferData(DataFlavor.stringFlavor));
                }catch(Exception ex){
                    System.out.println("error");
                }
            }
        });

        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "save - сохранить\nexit-выйти\ncopy-сохранить в буфер\npaste-вставить\ncut-вырезать и сохранить", "alert",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(one);
        add(two);
        add(txt);
    }
}
