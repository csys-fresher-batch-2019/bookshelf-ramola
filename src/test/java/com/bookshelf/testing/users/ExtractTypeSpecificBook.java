package com.bookshelf.testing.users;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bookshelf.Books;
import com.bookshelf.implementations.BooksDAOImpl;

public class ExtractTypeSpecificBook {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();
		
		System.out.println("Enter the Book Type: ('Fiction','Fantacy','Mythology','Romance','Literature','Technical','Poetry','Autobiographies')");
		String bookType=s.nextLine();
		System.out.println("View books of Type-> "+bookType);
		
		List<Books> l=new ArrayList<Books>();
		
		
		l=bi.extractTypeSpecificBooks(bookType);
		
		for(Books b:l)
		{
			System.out.println(b.toString());
		}



}
}