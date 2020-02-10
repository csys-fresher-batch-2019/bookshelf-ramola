package com.bookshelf.testing.users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bookshelf.model.Books;
import com.bookshelf.model.Logger;
import com.bookshelf.implementations.BooksDAOImpl;

public class ExtractRelatedBooks {
	private static final Logger log=Logger.getInstance();

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();


		log.debug("Enter the related book names:");
		String bookName=s.nextLine();
		List<Books> l=new ArrayList<Books>();
		
		
		l=bi.extractRelatedBooks(bookName);
		
		for(Books b:l)
		{
			log.debug(b.toString());
		}



	}

}
