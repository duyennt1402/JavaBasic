package week303;
import java.util.ArrayList;
public class Library {
	/*
	 * Create a Library class 
	 * Have: List of books
	 * Can: add new book, find a book by title/author, list all books
	 */
	// Store a list of Book object
	ArrayList<Book> books;
	//Contructors 
	
public Library() {
	// create a new ArrayList to hold Book objects
	books= new ArrayList<Book>();
}
// Method to add Book 
public void addBook(Book book) {
	books.add(book);

}
//Method to remove book
public void removeBook(Book book) {
	books.remove(book);
}
public ArrayList<Book> getBooks(){
	return books;
}	
public ArrayList<Book> searchBooks(String titleBook) {
	for(Book book:books) {
		if(book.getBookTitle().contains(titleBook)||book.getAuthor().contains(titleBook)) {
			return books;
		} 
		System.out.println(book.getBookDetail());
	}
	return null; 
}
}
