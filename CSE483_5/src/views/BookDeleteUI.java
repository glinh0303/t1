package views;

import java.awt.event.ActionListener;

import javax.swing.*;

import models.Book;

public class BookDeleteUI extends JFrame {
    private JComboBox<Book> bookComboBox;
    private JButton deleteButton;

    public BookDeleteUI() {
        // Initialize UI components
        bookComboBox = new JComboBox<>();
        deleteButton = new JButton("Delete");

        // Set layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Horizontal grouping
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(bookComboBox)
                .addComponent(deleteButton)
        );

        // Vertical grouping
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(bookComboBox)
                .addComponent(deleteButton)
        );

        // Set frame properties
        setTitle("Book Delete");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the frame on screen
    }

    // Method to populate the book combo box with a list of books
    public void setBookList(Book[] books) {
        DefaultComboBoxModel<Book> model = new DefaultComboBoxModel<>(books);
        bookComboBox.setModel(model);
    }

    // Method to add action listener to the delete button
	public void addDeleteButtonListener(ActionListener listener) {
        deleteButton.addActionListener(listener);
    }
}
