package Manager;

import java.util.List;

import models.Book;
import models.Record;

public class DisplayManager {
	private BookManager bookManager;
	private LibraryManager libraryManager;

	public DisplayManager(BookManager bookManager, LibraryManager libraryManager) {
		this.bookManager = bookManager;
		this.libraryManager = libraryManager;
	}

	public List<Book> getBooks() {
		return bookManager.getBooks();
	}

	public List<Record> getRecords() {
		return libraryManager.getRecords();
	}
}
