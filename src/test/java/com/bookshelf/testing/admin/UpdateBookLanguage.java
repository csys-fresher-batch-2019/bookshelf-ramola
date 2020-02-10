package com.bookshelf.testing.admin;

import java.util.Scanner;
import com.bookshelf.implementations.BooksDAOImpl;
import com.bookshelf.model.Books;
import com.bookshelf.model.Logger;

public class UpdateBookLanguage {
	private static final Logger log=Logger.getInstance();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();
		
		Books b=new Books();

		log.debug("Enter the Book Name which has to be updated : ");
	    b.setBookName(s.nextLine());
	    log.debug("The Language to be updated : ");
		b.setBookLanguage(s.nextLine());

		bi.updateBookLanguage(b);

	}

}
