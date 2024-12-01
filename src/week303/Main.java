package week303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create new book
//		Book book1 = new Book("Doremon", "Fujiko", 100);
//		System.out.println("Book detail information: "+ book1.getBookDetail());
//		// borrow book
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input number of book do you want to borrow:");
//		int borrowNum = sc.nextInt();
//		book1.borrowBook(borrowNum);
//		// Return number of book
//		System.out.println("Input number of book do you want to return:");
//		int returnNum = sc.nextInt();
//		sc.close();
//		book1.returnBook(returnNum);
//		System.out.println("Remain number of " + book1.title + " " + book1.getNum());
//		// book1.getNum();
		
		/*
		 * Library
		 */
		// add book to library
		Library library = new Library();
		Book book1 = new Book("Doremon","Fujuko",100);
		Book book2 = new Book ("Little house on the prairie","Laura",10);
		Book book3 = new Book ("the little prince","Antoine de Saint-Exupéry",50);
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		System.out.println("Book in library:");
		for(Book book: library.getBooks()) {
			System.out.println(book.getBookTitle()+" by " + book.getAuthor());
		}
		//Remove book from the library
		library.removeBook(book3);
		System.out.println("Book in library:");
		for(Book book: library.getBooks()) {
			System.out.println(book.getBookTitle()+" by " + book.getAuthor());
		}
		//Search a book
		Scanner sc= new Scanner(System.in);
		System.out.println("Input title of book:");
		String titleBook= sc.next();
		sc.close();
		library.searchBooks(titleBook);

	}

}
