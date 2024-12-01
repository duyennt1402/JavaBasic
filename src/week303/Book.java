package week303;

public class Book {
	/*
	 * Create Book class, 
	 * Have: Title, author, available copies
	 * Can: Borrow book, return book, get book's detail
	 */
	String title;
	String author;
	int number;

	// Contructor
	public Book(String title, String author, int number) {
		this.title = title;
		this.author = author;
		this.number = number;

	}
	// Get Book detail
	public String getBookDetail() {
		return "Title" + title+" , Author: "+ author+ ", Number: " +number;
	}
	public String getBookTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}

	// Method to borrow book
	public void borrowBook(int borrowNum) {
		if (borrowNum > number) {
			System.out
					.println("You only borrow " + number + " book. Please input number of book do you want to borrow");
		} else {
			number -= borrowNum;
			System.out.println("you borrow " + borrowNum + " book.Remain number of the book " + number);
		}
	}

	// Method to return book
	public void returnBook(int returnNum) {
		number += returnNum;
	}

	// Get number
	public int getNum() {
		return number;
	}
	// Get book detail

}
