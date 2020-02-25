package com.bookshelf.dao;
import java.util.List;

//import org.jdbi.v3.sqlobject.customizer.BindBean;
//import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.bookshelf.model.Books;


public interface BooksDAO {
	
	//@SqlQuery("select book_name,book_version,book_author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where book_author=lower(?)")
	//@RegisterRowMapper(BookRowMapper.class)
	List<Books> extractAuthorSpecificBooks(String bookAuthor) throws Exception;
	
	//@SqlQuery("select book_name,book_version,book_author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where book_Type=?")
	//@RegisterRowMapper(BookRowMapper.class)
	List<Books> extractTypeSpecificBooks(String bookType) throws Exception;


	//@SqlQuery("select book_name,book_version,book_author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where book_Language='"+bookLanguage+"'")
	List<Books> extractLanguageSpecificBooks(String bookLanguage)throws Exception;
	
	//@SqlQuery("select book_name,book_version,book_author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where book_rating>=4")
	List<Books> extractHighlyRatedBooks()throws Exception;
	
	List<Books> viewAllBooks()throws Exception;
	
	//@SqlQuery("select book_name,book_version,book_Author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where trunc(book_uploaded_on)=trunc(sysdate)")	
	List<Books> extractTodaysSpecial()throws Exception;
	
	//@SqlQuery("select book_name,book_version,book_Author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where book_name like '%"+ bookName+"%'")	
	List<Books> extractRelatedBooks(String bookName)throws Exception;

	//@SqlUpdate("insert into books(book_id,book_name,book_version,book_author,book_language,book_type,book_publisher,book_published_date,booklink,imglink)values(BOOK_ID_SQC.nextval,lower(:bookName),:bookVersion,lower(:bookAuthor),:bookLanguage,:bookType,:bookPublisher,:bookPublishedDate,:bookLink,:imgLink)")
	//public void addBook(@BindBean Books ab)throws Exception;
	public void addBook(Books ab)throws Exception;

	
	//@SqlUpdate("update books set book_language=? where book_name=?")
	public void updateBookLanguage(Books ab)throws Exception;
	
	
	public void deleteBook(Books ab)throws Exception;


}
