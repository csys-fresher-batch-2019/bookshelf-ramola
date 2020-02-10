package com.bookshelf.testing.users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bookshelf.model.Books;
import com.bookshelf.implementations.BooksDAOImpl;


public class ExtractAuthorSpecificBooks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();


		System.out.println("Enter the Author name:");
		String bookAuthor=s.nextLine();
		System.out.println("View books of Author-> "+bookAuthor);

		List<Books> l=new ArrayList<Books>();
		
				
		l=bi.extractAuthorSpecificBooks(bookAuthor);
		
		for(Books b:l)
		{
			System.out.println(b.toString());
		}

	}

}
