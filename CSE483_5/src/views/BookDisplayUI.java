package views;

import javax.swing.*;

public class BookDisplayUI extends JFrame {
    private JTextArea bookListTextArea;

    public BookDisplayUI() {
        // Initialize UI components
        bookListTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(bookListTextArea);

        // Set layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Horizontal grouping
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(scrollPane)
        );

        // Vertical grouping
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(scrollPane)
        );

        // Set frame properties
        setTitle("Book Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the frame on screen
    }

    // Method to display the list of books in the text area
    public void displayBooks(String books) {
        bookListTextArea.setText(books);
    }
}
