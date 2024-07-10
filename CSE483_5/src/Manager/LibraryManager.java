package Manager;

import java.util.ArrayList;
import java.util.List;

import models.Book;
import models.Record;

public class LibraryManager {
	private BookManager bookManager;
	private List<Record> records;

	public LibraryManager(BookManager bookManager) {
		this.bookManager = bookManager;
		this.records = new ArrayList<>();
	}

	public boolean borrowBook(String borrowerName, Book book) {
		if (book.getAvailableQuantity() > 0) {
			book.setAvailableQuantity(book.getAvailableQuantity() - 1);
			records.add(new Record(borrowerName, book.getTitle()));
			return true;
		}
		return false;
	}

	public List<Record> getRecords() {
		return records;
	}
}
