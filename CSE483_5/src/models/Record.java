package models;

public class Record {
	private String borrowerName;
	private String borrowedBookTitle;

	// Constructor
	public Record(String borrowerName, String borrowedBookTitle) {
		this.borrowerName = borrowerName;
		this.borrowedBookTitle = borrowedBookTitle;
	}

	// Getters and setters
	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public String getBorrowedBookTitle() {
		return borrowedBookTitle;
	}

	public void setBorrowedBookTitle(String borrowedBookTitle) {
		this.borrowedBookTitle = borrowedBookTitle;
	}
}
