package io.github.aerocyber.LibraryManager;

import java.util.Date;
import java.util.Vector;

public class User {
	
	String name;
	Date dob;
	String address;
	Vector<Book> borrowedBooks;
	int memberId;
	Date memberSince;

	public User(String name, String address, Date dob, Vector<Book> booksBorrowed, int memberId, Date memberSince) {
		this.name = name;
		this.address = address;
		this.borrowedBooks = booksBorrowed;
		this.memberId = memberId;
		this.dob = dob;
		this.memberSince = memberSince;
	}

}
