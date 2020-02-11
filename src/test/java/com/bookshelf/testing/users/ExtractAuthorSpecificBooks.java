package com.bookshelf.testing.users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bookshelf.model.Books;
import com.bookshelf.model.Logger;
import com.bookshelf.implementations.BooksDAOImpl;


public class ExtractAuthorSpecificBooks {
	private static final Logger log=Logger.getInstance();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();


		log.debug("Enter the Author name:");
		String bookAuthor=s.nextLine();
		log.debug("View books of Author-> "+bookAuthor);

		List<Books> l=new ArrayList<Books>();
		
				
		l=bi.extractAuthorSpecificBooks(bookAuthor);
		
		for(Books b:l)
		{
			System.out.println(b);
		}

	}

}
