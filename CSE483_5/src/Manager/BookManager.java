package Manager;

import java.util.ArrayList;
import java.util.List;

import models.Book;

public class BookManager {
	private List<Book> books;

	public BookManager() {
		this.books = new ArrayList<>();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBook(Book book) {
		books.remove(book);
	}

	public List<Book> getBooks() {
		return books;
	}
}
