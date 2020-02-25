package com.bookshelf.testing.admin;

import java.util.ArrayList;
import java.util.List;

import com.bookshelf.implementations.BooksDAOImpl;
import com.bookshelf.model.Books;
import com.bookshelf.model.Logger;

public class ViewAllBooks {
	private static final Logger log=Logger.getInstance();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BooksDAOImpl bi=new BooksDAOImpl();
		
		List<Books> alb=new ArrayList<Books>();
		alb=bi.viewAllBooks();
		for(Books b:alb)
		{
			log.debug(b);
		}
		

	}

}
