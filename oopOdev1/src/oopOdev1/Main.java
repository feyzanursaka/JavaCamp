package oopOdev1;

public class Main {
	public static void main(String[] args) {
		Book book1=new Book(1,1,"Suç ve Ceza","Roman");
		Book book2=new Book(1,2,"Satranç","Roman");
		
		Author author1 = new Author(1, "Fyodor", "Dostoyevski");
		Author author2 = new Author(1, "Stefan", "Zweig");
		
		Book[] books= {book1,book2};
		Author[] authors= {author1,author2};
		
		AuthorManager authorManager=new AuthorManager();
		for (Author author: authors) {
			authorManager.addAuthor(author);
			
		}
		BookManager bookManager=new BookManager();
		for (Book book: books) {
			bookManager.addBook(book);
		}
	}
}