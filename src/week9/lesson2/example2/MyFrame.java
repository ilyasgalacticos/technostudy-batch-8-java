package week9.lesson2.example2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    public JButton click;

    public MyFrame(){
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        click = new JButton("CLICK ME");
        click.setBounds(20,20,200,40);
        add(click);
        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("HELLO");
            }
        });
    }

}
