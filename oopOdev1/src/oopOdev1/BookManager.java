package oopOdev1;


public class BookManager {
	public void addBook(Book book) {
		System.out.println(book.name + " eklendi");
	}
	public void deleteBook(Book book) {
		System.out.println(book.name + " silindi");
	}
}
