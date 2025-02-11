package librarySystem;


public class Library {

	private final Book[] books = new Book[5];
	private int count;
	
	/**
	 * This method will add a book to the array as long as there is no more than 5
	 * books already in the array
	 * 
	 * @param	book
	 * 					This argument holds the information of the book to be added
	 * @return	
	 * 					Return false if there is already 5 books in the array. Returns true
	 * 					if there is space in the array
	 */
	public boolean addBook(Book book) {
		if(count == getBooks().length) {
			System.out.println("Library full");
			System.out.println();
			return false;
		}
		System.out.println("Adding books...");
		books[count] = book;
		count++;
		System.out.println("Book added successfully.");
		System.out.println();
		return true;
	}
	/**
	 * This method will print out a list of all books in the array
	 * 
	 */
	public void displayBooks() {
		System.out.println("All books in the library:");
		int num = 1;
		for(int i=0; i<count;i++) {
		System.out.println(num + ". " + getBooks()[i]);
		num++;
		}
	}
	/**
	 * This method will remove a book from the array and shift the remainder of the books over
	 * 
	 * @param
	 * 			book
	 * 					Holds the info about the book that is to be removed
	 * 
	 * @return
	 * 			Returns True if the book was removed and everything shifted over
	 * 			Returns False if the book was not found in the array
	 * 
	 */
	public boolean removeBook(Book book) {
		for (int i=0; i<count; i++) {
			if (books[i].equals(book)) {
				System.out.println("Removing book: "+books[i]);
				//shift to left
				for (int j=i; j<count-1; j++) {
					books[j]=books[j+1];
				}
				books[--count]=null;
				return true;
			}
		}
		System.out.println("Book not found.");
		return false;
	}
	
	
	/**
	 * This method will search the array for a Book object with the matching ISBN
	 * and returns the object if found and null if not
	 * 
	 * @param ISBN
	 * 					This argument holds the ISBN value to search for
	 * @return
	 * 					Return null if the book is not found. Returns the book object
	 * 					if it has a matching ISBN
	 */
	public Book searchByISBN(String ISBN) {
		
		System.out.println("Searching for book with ISBN: " + ISBN);
		
		for(int i=0; i< count;i++) {
			if(books[i].getISBN().equals(ISBN)) {
				return books[i];
			}
				
		}
		return null;
	}	

	public Book[] getBooks() {
		return books;
	}

	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
