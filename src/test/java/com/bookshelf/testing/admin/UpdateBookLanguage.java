package com.bookshelf.testing.admin;

import java.util.Scanner;
import com.bookshelf.implementations.BooksDAOImpl;
import com.bookshelf.model.Books;

public class UpdateBookLanguage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();
		
		Books b=new Books();

		System.out.println("Enter the Book Name which has to be updated : ");
	    b.bookName=s.nextLine();
		System.out.println("The Language to be updated : ");
		b.bookLanguage=s.nextLine();

		bi.updateBookLanguage(b);

	}

}
