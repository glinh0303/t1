package views;

import java.awt.event.ActionListener;

import javax.swing.*;

import models.Book;

public class BookBorrowUI extends JFrame {
    private JComboBox<Book> bookComboBox;
    private JButton borrowButton;

    public BookBorrowUI() {
        // Initialize UI components
        bookComboBox = new JComboBox<>();
        borrowButton = new JButton("Borrow");

        // Set layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Horizontal grouping
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(bookComboBox)
                .addComponent(borrowButton)
        );

        // Vertical grouping
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(bookComboBox)
                .addComponent(borrowButton)
        );

        // Set frame properties
        setTitle("Book Borrow");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the frame on screen
    }

    // Method to populate the book combo box with a list of books
    public void setBookList(Book[] books) {
        DefaultComboBoxModel<Book> model = new DefaultComboBoxModel<>(books);
        bookComboBox.setModel(model);
    }

    // Method to add action listener to the borrow button
    public void addBorrowButtonListener(ActionListener listener) {
        borrowButton.addActionListener(listener);
    }
}
