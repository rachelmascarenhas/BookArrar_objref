package com.montran.util;

import com.montran.pojo.Book;

public class BookUtil { //to accept book details

	public Book[] books;
	private int nextIndex = 0;
	private int maxIndex;
	
	
	
	public BookUtil(int bookLength) {
		books=new Book[bookLength];
		maxIndex=bookLength;
	}
	

	public int getMaxIndex() {
		return maxIndex;
	}
    
	

	public int getNextIndex() {
		return nextIndex;
	}


	public boolean addNewBook(Book book) {  //Add new book --taking book obj as input
		if (nextIndex >= 0 && nextIndex < maxIndex) {
			books[nextIndex] = book;
			nextIndex++;
			return true;
		}
		return false;
	}
	
	public boolean addAllBooks(Book[] books) {
		for (Book book: books) {   //for each loop 
			addNewBook(book);
		}
		return true;
    }

	
	public boolean updateBook(int bookid , String newName , double newPrice) {
		for (Book book : books) {
			if (bookid==book.getBookId()) {
				book.setBookName(newName);
				book.setBookPrice(newPrice);
				return true;		
		}		
		
	}
		return false;
}

	public boolean deleteBook(int bookId) {
		for (int i = 0; i < books.length; i++) {
			if (books[i].getBookId() == bookId) {
				books[i] = null;
				return true;
			}
		}
		return false;
	}


	public Book getBookByBookId(int bookId) {
		for (Book book : books) {
			if (book != null) {
				if (book.getBookId() == bookId)
					return book;
			}

		}
		return null;

	}
     
     
     public Book[] getAllBooks() {
 		return books;
 	}





}	
