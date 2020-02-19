package com.bookshelf.testing.admin;

import java.sql.Date;
import java.util.Scanner;

import org.jdbi.v3.core.Jdbi;

import com.bookshelf.dao.BooksDAO;
import com.bookshelf.db.DbConnection;
import com.bookshelf.implementations.BooksDAOImpl;
import com.bookshelf.model.Books;
import com.bookshelf.model.Logger;


public class InsertBooks {
	private static final Logger log=Logger.getInstance();
	static Jdbi jdbi=DbConnection.getJdbi();
	static BooksDAO bookDAO=jdbi.onDemand(BooksDAO.class);

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		//BooksDAOImpl bi=new BooksDAOImpl();
		
		Books b=new Books();

		log.debug("Enter the Book Name:");
		b.setBookName(s.nextLine());
		log.debug("Enter the Book Version:");
		b.setBookVersion(Integer.parseInt(s.next()));
		s.nextLine();
		log.debug("Enter the Book Author:");
		b.setBookAuthor(s.nextLine());
		log.debug("Enter the Book Language:");
		b.setBookLanguage(s.nextLine());
		log.debug("Enter the Book Type:");
		b.setBookType(s.nextLine());
		log.debug("Enter the Book Publisher:");
		b.setBookPublisher(s.nextLine());
		log.debug("Enter the Book Published Date:");
		b.setBookPublishedDate(Date.valueOf(s.next()));
		log.debug("Enter the Book pdf :");
		b.setBookLink(s.nextLine());
		s.nextLine();
		log.debug("Enter the Book Image");
		b.setImgLink(s.nextLine());
		
		bookDAO.addBook(b);

	}

}
