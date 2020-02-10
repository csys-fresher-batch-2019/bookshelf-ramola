package com.bookshelf.testing.users;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bookshelf.implementations.BooksDAOImpl;
import com.bookshelf.model.Books;
import com.bookshelf.model.Logger;


public class ExtractLanguageSpecificBooks {
	private static final Logger log=Logger.getInstance();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();


		log.debug("Enter the Language:");
		String bookLanguage=s.next();
		log.debug("View books of Language-> "+bookLanguage);

		List<Books> l=new ArrayList<Books>();
		
				
		l=bi.extractLanguageSpecificBooks(bookLanguage);
		
		for(Books b:l)
		{
			log.debug(b.toString());
		}

	}

}
