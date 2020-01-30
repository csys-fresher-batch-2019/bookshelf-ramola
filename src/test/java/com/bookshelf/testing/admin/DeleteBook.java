package com.bookshelf.testing.admin;

import java.util.Scanner;

import com.bookshelf.Books;
import com.bookshelf.implementations.BooksDAOImpl;


public class DeleteBook {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();
		Books b=new Books();

		
		System.out.println("Enter the Book ID:");
	    b.bookId=s.nextInt();
		
	    bi.deleteBook(b);	
	}

}
