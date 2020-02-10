package com.bookshelf.testing.users;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bookshelf.model.Books;
import com.bookshelf.model.Logger;
import com.bookshelf.implementations.BooksDAOImpl;

public class ExtractTypeSpecificBook {
	private static final Logger log=Logger.getInstance();
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		BooksDAOImpl bi=new BooksDAOImpl();
		
		log.debug("Enter the Book Type: ('Fiction','Fantacy','Mythology','Romance','Literature','Technical','Poetry','Autobiographies')");
		String bookType=s.nextLine();
		log.debug("View books of Type-> "+bookType);
		
		List<Books> l=new ArrayList<Books>();
		
		
		l=bi.extractTypeSpecificBooks(bookType);
		
		for(Books b:l)
		{
			log.debug(b.toString());
		}



}
}