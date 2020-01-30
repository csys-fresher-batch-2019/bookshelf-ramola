package com.bookshelf.testing.users;

import java.util.ArrayList;
import java.util.List;

import com.bookshelf.Books;
import com.bookshelf.implementations.BooksDAOImpl;

public class TodaysSpecial {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
BooksDAOImpl bi=new BooksDAOImpl();
		
		List<Books> alb=new ArrayList<Books>();
		alb=bi.extractTodaysSpecial();
		for(Books b:alb)
		{
			System.out.println(b.toString());
		}

	}

}
