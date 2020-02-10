package com.bookshelf.testing.users;

import java.util.ArrayList;
import java.util.List;
import com.bookshelf.model.Books;
import com.bookshelf.model.Logger;
import com.bookshelf.implementations.BooksDAOImpl;



public class ExtractHighlyRatedBooks {
	private static final Logger log=Logger.getInstance();

	public static void main(String[] args) throws Exception {
		BooksDAOImpl bi=new BooksDAOImpl();
		
		List<Books> alb=new ArrayList<Books>();
		alb=bi.extractHighlyRatedBooks();
		for(Books b:alb)
		{
			log.debug(b.toString());
		}

	}
	

}
