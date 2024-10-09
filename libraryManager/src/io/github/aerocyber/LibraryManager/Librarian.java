package io.github.aerocyber.LibraryManager;

import java.util.Date;
import java.util.Vector;

public class Librarian extends User{
	
	Date joinedAsLibrarian;
	Vector<Book> booksIssuedTillDate;

	public Librarian(String name, String address, Date dob, Vector<Book> booksBorrowed, int memberId, Date memberSince, Date joinedAsLibrarian, Vector<Book> booksTillDate) {
		super(name, address, dob, booksBorrowed, memberId, memberSince);
		this.joinedAsLibrarian = joinedAsLibrarian;
		this.booksIssuedTillDate = booksTillDate;
	}
	
	public void issueBook(Book book) {
		this.booksIssuedTillDate.add(book);
	}

}
