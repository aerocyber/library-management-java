package io.github.aerocyber.LibraryManager;

import java.sql.*;
import java.util.*;
import io.github.aerocyber.LibraryManager.Book;

public abstract class DatabaseHandler {
	
	private String dbUrl;
	private String dbUserName;
	private String dbPassword;
	private String dbName;
	private Connection connection = null;

	public DatabaseHandler(String dbUrl, String dbName, String username, String password) throws SQLException {
		this.dbName = dbName;
		this.dbPassword = password;
		this.dbUrl = dbUrl;
		this.dbUserName = username;
		this.connectDB();
	}
	
	private void connectDB()  throws SQLException {
		this.connection = DriverManager.getConnection(this.dbUrl);
	}
	
	abstract void registerUser(String newUser, String newPassword);
	abstract void deleteUser(String newUser, String newPassword);
	abstract void addLibrarian(String newUser, String newPassword);
	abstract void deleteLibrarian(String newUser, String newPassword);
	
	abstract Vector<Book> getBooks();
	abstract int getBooksCount();
	abstract Vector<Book> getBorrowedBooks();
	abstract int getBorrowedBooksCount();
	abstract Vector<Book> getAvailableBooks();
	abstract int getAvailableBooksCount();
	

}
