package io.github.aerocyber.LibraryManager;

import java.util.Date;
import io.github.aerocyber.LibraryManager.Librarian;
import io.github.aerocyber.LibraryManager.User;

public class Book {
	
	String name;
	String author;
	Date publishedDate;
	Date dateAddedToLibrary;
	Date dateBorrowed;
	Date returnDate;
	Boolean isBorrowed;
	Librarian issuer;
	User issuedTo;

	public Book(String name, String author, Date dateAdded, Date borrowed, Date returnDate, Date publishedDate) {
		this.name = name;
		this.author = author;
		this.publishedDate = publishedDate;
		this.dateAddedToLibrary = dateAdded;
		this.dateBorrowed = borrowed;
		this.returnDate = returnDate;
		this.isBorrowed = true;
	}
	
	public Book(String name, String author, Date dateAdded, Date publishedDate) {
		this.name = name;
		this.author = author;
		this.publishedDate = publishedDate;
		this.dateAddedToLibrary = dateAdded;
		this.dateBorrowed = null;
		this.returnDate = null;
		this.isBorrowed = false;
	}

}
