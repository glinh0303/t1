import javax.swing.*;
import java.awt.*;

import views.*;

public class Main {

	public static void main(String[] args) {
		// Create instances of the views
		BookRegisterUI bookRegisterUI = new BookRegisterUI();
		BookBorrowUI bookBorrowUI = new BookBorrowUI();
		BookDeleteUI bookDeleteUI = new BookDeleteUI();
		BookDisplayUI bookDisplayUI = new BookDisplayUI();

		// Set up the JFrame properties
		JFrame frame = new JFrame("Library Management System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);

		// Set the layout for the content pane of the JFrame
		frame.setLayout(new BorderLayout());

		// Create a JPanel to hold the views
		JPanel panel = new JPanel(new GridLayout(2, 2)); // Adjust layout as needed

		// Add the views to the panel
		panel.add(bookRegisterUI);
		panel.add(bookBorrowUI);
		panel.add(bookDeleteUI);
		panel.add(bookDisplayUI);

		// Add the panel to the content pane of the JFrame
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		// Make the JFrame visible
		frame.setVisible(true);
	}
}
