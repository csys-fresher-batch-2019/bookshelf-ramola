package com.bookshelf.testing.users;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bookshelf.implementations.BooksDAOImpl;
import com.bookshelf.model.Books;


public class ExtractLanguageSpecificBooks {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();


		System.out.println("Enter the Language:");
		String bookLanguage=s.next();
		System.out.println("View books of Language-> "+bookLanguage);

		List<Books> l=new ArrayList<Books>();
		
				
		l=bi.extractLanguageSpecificBooks(bookLanguage);
		
		for(Books b:l)
		{
			System.out.println(b.toString());
		}

	}

}
