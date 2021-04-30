package oopOdev1;

public class AuthorManager {
	public void addAuthor(Author author) {
		System.out.println(author.firstName+author.lastName+" eklendi");
	}
	public void deleteAuthor(Author author) {
		System.out.println(author.firstName+author.lastName+" silindi");
	}
}
