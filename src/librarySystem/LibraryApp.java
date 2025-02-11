package librarySystem;

public class LibraryApp {
	
	public static void main(String[] args) {
		
		Library library = new Library();
		library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99));
		library.addBook(new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99));
		library.addBook(new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 45.99));
		
		String search = "978-0201633610";
		Book findBook = library.searchByISBN(search);
		
		if(findBook != null) {
			System.out.println("Book found: " + findBook);
			System.out.println();
		}
		else {
			System.out.println("Book with ISBN: " + search + " not found.");
			System.out.println();
		}
		library.displayBooks();
	}
}
