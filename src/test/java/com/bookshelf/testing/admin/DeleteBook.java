package com.bookshelf.testing.admin;

import java.util.Scanner;

import com.bookshelf.implementations.BooksDAOImpl;
import com.bookshelf.model.Books;


public class DeleteBook {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();
		Books b=new Books();

		
		System.out.println("Enter the Book ID:");
	    b.bookId=s.nextInt();
		
	    bi.deleteBook(b);	
	}

}
