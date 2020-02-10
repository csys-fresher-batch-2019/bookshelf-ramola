package com.bookshelf.testing.admin;

import java.util.Scanner;

import com.bookshelf.implementations.BooksDAOImpl;
import com.bookshelf.model.Books;
import com.bookshelf.model.Logger;


public class DeleteBook {
	private static final Logger log=Logger.getInstance();

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();
		Books b=new Books();

		
		log.debug("Enter the Book ID:");
	    b.setBookId(s.nextInt());
		
	    bi.deleteBook(b);	
	}

}
