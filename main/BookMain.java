package com.montran.main;

import java.util.Scanner;
import com.montran.pojo.Book;
import com.montran.util.BookUtil;

public class BookMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		BookUtil bookUtil=new BookUtil(100); //Will accept book details of 100 books
		Book book; //book pojo obj used to initialize var- param constr of Book()
		int bookId;             //Book pojo var
		String bookName;        //Book pojo var
		double bookPrice;       //Book pojo var
		int numberOfBooks;
		Book books[]=null;
		boolean result;
		String newName;
		double newPrice;
		String continueChoice;
		
		System.out.println("Welcome to the Crosswords");
		do {
			books = bookUtil.getAllBooks();
			for (Book bookTemp : books) {
				if (bookTemp != null) {
					System.out.println(bookTemp.getBookId() + "\t" + bookTemp.getBookName() + "\t" + bookTemp.getBookPrice());
				}
			}
		System.out.println("Menu");
		System.out.println("1. Add Single Book	");
		System.out.println("2. Add Multiple Books");
		System.out.println("3. Update Existing Book");
		System.out.println("4. Delete Existing Book");
		System.out.println("5. Print Single Book Details");
		System.out.println("6. Exit");
		System.out.println("Enter your choice");
		int bookChoice = scanner.nextInt();
		switch (bookChoice) {
		case 1: {
			System.out.println("Enter book ID");
			bookId=scanner.nextInt();
			System.out.println("Enter book name");
			scanner.nextLine();
			bookName=scanner.nextLine();
			System.out.println("Enter book price");
			bookPrice=scanner.nextDouble();
			book=new Book(bookId,bookName,bookPrice); 
			result=bookUtil.addNewBook(book);
			if(result)
				System.out.println("The book is added successfully");
			else
				System.out.println("Could not add the book");
			break;
		}
		case 2:{
			System.out.println("How many books do you want to add ?");
			numberOfBooks = scanner.nextInt();
			if (numberOfBooks < (bookUtil.getMaxIndex() - bookUtil.getNextIndex())) {
				books = new Book[numberOfBooks];
				for (int i = 0; i < numberOfBooks; i++) {
					System.out.println("Enter BookId");
					bookId = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Book Name");
					
					bookName = scanner.nextLine();
					System.out.println("Book Price");
					bookPrice = scanner.nextDouble();

					book=new Book(bookId,bookName,bookPrice); 
					books[i] = book;
				}
				bookUtil.addAllBooks(books);
				System.out.println("Books are added !!");
			} else
				System.out.println("No space available !!");
			break;
			/*
			System.out.println("How many books do you want to add ?");
			numberOfBooks = scanner.nextInt();
			if (numberOfBooks<(bookUtil.getMaxIndex()-bookUtil.getNextIndex())) {
			    books=new Book[numberOfBooks];
				for (int i=0;i<numberOfBooks;i++) {
			        System.out.println("Enter details of book"+ ++i);
			        System.out.println("Enter book ID");
					bookId=scanner.nextInt();
					System.out.println("Enter book name");
					scanner.next();
					bookName=scanner.nextLine();
					System.out.println("Enter book price");
					bookPrice=scanner.nextDouble();
					book=new Book(bookId,bookName,bookPrice);
					books[i]=book;	
				}
				 System.out.println("Books are added successfully");
			}
			else
				System.out.println("Could not add books as max. limit ");
			break;*/
		}
		case 3:{
			System.out.println("Enter book ID");
			bookId=scanner.nextInt();
			book = bookUtil.getBookByBookId(bookId);
			if (book != null) {
				System.out.println(book);
				scanner.next();
				System.out.println("Book New Name");
				newName = scanner.nextLine();
				scanner.next();
				System.out.println("Book New Price");
				newPrice = scanner.nextDouble();

				result = bookUtil.updateBook(bookId, newName, newPrice);
				if (result)
					System.out.println("Book details are updated successfully !!");
				else
					System.out.println("Failed to update book details");
			} else
				System.out.println("No Book Found !!");
			break;
		}
		case 4:
			System.out.println("Enter BookId");
			bookId = scanner.nextInt();
			book = bookUtil.getBookByBookId(bookId);
			if (book != null) {
				result = bookUtil.deleteBook(bookId);
				if (result)
					System.out.println("Book deleted successfully ");
				else
					System.out.println("Failed to delete book");
			} else
				System.out.println("No Book Found !!");
			break;
		case 5:
			System.out.println("Enter BookId");
			bookId = scanner.nextInt();
			book = bookUtil.getBookByBookId(bookId);
			if (book != null) {
				System.out.println(book);
			} else
				System.out.println("No Book Found !!");
			break;
		case 6:
			System.out.println("Thank you");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		System.out.println("Do you want to continue yes- no ??");
		continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
	System.out.println("Thank you");
		}
}	

