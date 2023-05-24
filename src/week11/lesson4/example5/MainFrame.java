package week11.lesson4.example5;

import javax.swing.*;

public class MainFrame extends JFrame {

    private JComboBox comboBox;
    private String [] cities = {"Almaty", "Istanbul", "Frankfurt"};
    public MainFrame(){
        setTitle("SELECT EXAMPLE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(null);

        comboBox = new JComboBox(cities);
        comboBox.setBounds(150, 50, 200, 20);
        add(comboBox);

    }
}
