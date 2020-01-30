package com.bookshelf.testing.users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bookshelf.Books;
import com.bookshelf.implementations.BooksDAOImpl;

public class ExtractRelatedBooks {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();


		System.out.println("Enter the related book names:");
		String bookName=s.nextLine();
		List<Books> l=new ArrayList<Books>();
		
		
		l=bi.extractRelatedBooks(bookName);
		
		for(Books b:l)
		{
			System.out.println(b.toString());
		}



	}

}
