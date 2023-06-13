package libraryproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookFrame extends JFrame {
    private JTextField nameField;
    private JTextField authorField;
    private JButton addButton;

    public AddBookFrame() {
        // Create layout
        setLayout(new GridLayout(3, 2, 10, 10)); // add gaps between grid cells

        // Set padding for the frame
        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create and add label and text field for book name
        JLabel nameLabel = new JLabel("Book Name:");
        nameField = new JTextField();
        nameField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // add padding
        add(nameLabel);
        add(nameField);

        // Create and add label and text field for author
        JLabel authorLabel = new JLabel("Author:");
        authorField = new JTextField();
        authorField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // add padding
        add(authorLabel);
        add(authorField);

        // Create and add button for adding book
        addButton = new JButton("Add Book");
        addButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // add padding
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = nameField.getText();
                String author = authorField.getText();

                // Display added book info
                // Replace this with actual function to add book to your book list
                JOptionPane.showMessageDialog(null, "Added Book: " + name + " by " + author);

                // Clear text fields
                nameField.setText("");
                authorField.setText("");
            }
        });
        add(addButton);

        // Set window parameters
        setTitle("Add New Book");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddBookFrame();
    }
}
