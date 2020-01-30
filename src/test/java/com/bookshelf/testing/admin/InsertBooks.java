package com.bookshelf.testing.admin;

import java.sql.Date;
import java.util.Scanner;

import com.bookshelf.Books;
import com.bookshelf.implementations.BooksDAOImpl;


public class InsertBooks {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();
		
		Books b=new Books();

		System.out.println("Enter the Book Name:");
		b.bookName=s.nextLine();
		System.out.println("Enter the Book Version:");
		b.bookVersion=Integer.parseInt(s.next());
		s.nextLine();
		System.out.println("Enter the Book Author:");
		b.bookAuthor=s.nextLine();
		System.out.println("Enter the Book Language:");
		b.bookLanguage=s.nextLine();
		System.out.println("Enter the Book Type:");
		b.bookType=s.nextLine();
		System.out.println("Enter the Book Publisher:");
		b.bookPublisher=s.nextLine();
		System.out.println("Enter the Book Published Date:");
		b.bookPublishedDate=Date.valueOf(s.next());
		
		bi.addBook(b);

	}

}
