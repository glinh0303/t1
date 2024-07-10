package views;

import javax.swing.*;

public class BookRegisterUI extends JFrame {
    private JTextField titleField;
    private JTextField authorField;
    private JTextField genreField;
    private JTextField quantityField;
    private JButton addButton;
    private JButton removeButton;

    public BookRegisterUI() {
        // Initialize UI components
        titleField = new JTextField();
        authorField = new JTextField();
        genreField = new JTextField();
        quantityField = new JTextField();
        addButton = new JButton("Add");
        removeButton = new JButton("Remove");

        // Set layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Horizontal grouping
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(titleField)
                        .addComponent(authorField)
                        .addComponent(genreField)
                        .addComponent(quantityField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(addButton)
                        .addComponent(removeButton))
        );

        // Vertical grouping
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(titleField)
                        .addComponent(addButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(authorField)
                        .addComponent(removeButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(genreField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityField))
        );

        // Set frame properties
        setTitle("Book Register");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the frame on screen
    }

    // Getter methods for UI components
    public JTextField getTitleField() {
        return titleField;
    }

    public JTextField getAuthorField() {
        return authorField;
    }

    public JTextField getGenreField() {
        return genreField;
    }

    public JTextField getQuantityField() {
        return quantityField;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }
}
