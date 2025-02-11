package librarySystem;

public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	@Override
	public String toString() {
		return title + " by " + author + " (ISBN: " + ISBN + ", $" + price + ")";
	}
	
	/**
	 * parameterized constructor, that will create a Book object with
	 * a title, author, ISBN, and price
	 * @param title
	 * 						This argument is the title of the book
	 * @param author
	 * 						This argument is the author of the book
	 * @param ISBN
	 * 						This argument is the ISBN for the book
	 * @param price
	 * 						This argument is the price of the book
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * This method will compare the object passed ISBN with the other books in the array
	 * 
	 * @param other
	 * 					This argument holds the book object to be compared
	 * @return
	 * 					Returns true if two books have the same ISBN. Returns False
	 * 					otherwise
	 */
	@Override
	public boolean equals(Object other) {
		if(this.ISBN.equals(((Book) other).getISBN())) {
			return true;
		}
		return false;	
		}

}
