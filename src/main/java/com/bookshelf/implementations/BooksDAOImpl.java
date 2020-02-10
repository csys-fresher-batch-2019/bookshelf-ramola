package com.bookshelf.implementations;
import com.bookshelf.model.Books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookshelf.dao.BooksDAO;
import com.bookshelf.db.DbConnection;

public class BooksDAOImpl implements BooksDAO {
	public List<Books> extractAuthorSpecificBooks(String bookAuthor) throws Exception 
	{

		String query="select book_name,book_version,book_author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where book_author=lower('"+bookAuthor+"')";

		List<Books> l=new ArrayList<Books>();
		try(Connection con=DbConnection.getConnection();
		Statement stmt=con.createStatement()){

		int rows=stmt.executeUpdate(query);
		System.out.println("Author Specific books count :"+rows);
		
		try(ResultSet rs=stmt.executeQuery(query)){
				
		while(rs.next())
		{
			Books b=new Books();
			b.bookName=rs.getString(1);
			b.bookVersion=rs.getInt(2);
			b.bookAuthor=rs.getString(3);
			b.bookLanguage=rs.getString(4);
			b.bookRating=rs.getInt(5);
			b.bookType=rs.getString(6);
			b.bookPublisher=rs.getString(7);
			b.bookPublishedDate=rs.getDate(8);
			b.bookLink=rs.getString(9);
			b.imgLink=rs.getString(10);
			
			l.add(b);
		}con.close();
		}
		}catch(Exception e)
		{
			
		}
		return (l);
	
	}

	public List<Books> extractTypeSpecificBooks(String bookType) throws Exception {

		String query="select book_name,book_version,book_author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where book_Type='"+bookType+"'";
		
		List<Books> l=new ArrayList<Books>();

		try(
		Connection con=DbConnection.getConnection();
		Statement stmt=con.createStatement()){
		
			int rows=stmt.executeUpdate(query);
		System.out.println("Type Specific books count :"+rows);
		
		try(ResultSet rs=stmt.executeQuery(query)){
		
		while(rs.next())
		{
			Books b=new Books();
			b.bookName=rs.getString(1);
			b.bookVersion=rs.getInt(2);
			b.bookAuthor=rs.getString(3);
			b.bookLanguage=rs.getString(4);
			b.bookRating=rs.getInt(5);
			b.bookType=rs.getString(6);
			b.bookPublisher=rs.getString(7);
			b.bookPublishedDate=rs.getDate(8);
			b.bookLink=rs.getString(9);
			b.imgLink=rs.getString(10);
			
			l.add(b);
		}con.close();
		}
	}catch(Exception e)
	{
		
	}
		return (l);

	}

	public List<Books> extractLanguageSpecificBooks(String bookLanguage) throws Exception {

		String query="select book_name,book_version,book_author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where book_Language='"+bookLanguage+"'";
		List<Books> l=new ArrayList<Books>();
		try(Connection con=DbConnection.getConnection();Statement stmt=con.createStatement()){

		int rows=stmt.executeUpdate(query);
		System.out.println("Language Specific books count :"+rows);
		try(ResultSet rs=stmt.executeQuery(query)){
		
		while(rs.next())
		{
			Books b=new Books();
			b.bookName=rs.getString(1);
			b.bookVersion=rs.getInt(2);
			b.bookAuthor=rs.getString(3);
			b.bookLanguage=rs.getString(4);
			b.bookRating=rs.getInt(5);
			b.bookType=rs.getString(6);
			b.bookPublisher=rs.getString(7);
			b.bookPublishedDate=rs.getDate(8);
			b.bookLink=rs.getString(9);
			b.imgLink=rs.getString(10);
			
			l.add(b);
		}con.close();
		
		}
		}
		catch(Exception e)
		{
			
		}
		return (l);
	}

	
	public List<Books> extractHighlyRatedBooks() throws Exception {
		
	String query="select book_name,book_version,book_author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where book_rating>=4";
	List<Books> l=new ArrayList<Books>();
	try(Connection con=DbConnection.getConnection();Statement stmt=con.createStatement()){
		int rows=stmt.executeUpdate(query);
		System.out.println("Most Popular Books :"+rows);
		
		try(ResultSet rs=stmt.executeQuery(query)){
		
		while(rs.next())
		{
			Books b=new Books();
			b.bookName=rs.getString(1);
			b.bookVersion=rs.getInt(2);
			b.bookAuthor=rs.getString(3);
			b.bookLanguage=rs.getString(4);
			b.bookRating=rs.getInt(5);
			b.bookType=rs.getString(6);
			b.bookPublisher=rs.getString(7);
			b.bookPublishedDate=rs.getDate(8);
			b.bookLink=rs.getString(9);
			b.imgLink=rs.getString(10);
			
			l.add(b);
		}con.close();
		}
		
	}catch(Exception e)
	{
		
		}

	return (l);
	}
		
	public List<Books> extractTodaysSpecial() throws Exception {
		
		String query="select book_name,book_version,book_Author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where trunc(book_uploaded_on)=trunc(sysdate)";
		List<Books> l=new ArrayList<Books>();

		try(Connection con=DbConnection.getConnection();Statement stmt=con.createStatement())
		{
		
		int rows=stmt.executeUpdate(query);
		System.out.println("Today's Special Books :"+rows);
		
		try(ResultSet rs=stmt.executeQuery(query);)
		{
		
		while(rs.next())
		{
			Books b=new Books();
			b.bookName=rs.getString(1);
			b.bookVersion=rs.getInt(2);
			b.bookAuthor=rs.getString(3);
			b.bookLanguage=rs.getString(4);
			b.bookRating=rs.getInt(5);
			b.bookType=rs.getString(6);
			b.bookPublisher=rs.getString(7);
			b.bookPublishedDate=rs.getDate(8);
			b.bookLink=rs.getString(9);
			b.imgLink=rs.getString(10);
			
			l.add(b);
		}con.close();
		}
		}
		catch(Exception e)
		{
			
		}
		return (l);
			}
	public List<Books> extractRelatedBooks(String bookName) throws Exception {
		
		String query="select book_name,book_version,book_Author,book_language,book_rating,book_type,book_publisher,book_published_date,booklink,imglink from books where book_name like '%"+ bookName+"%'";
		List<Books> l=new ArrayList<Books>();

		try(Connection con=DbConnection.getConnection();Statement stmt=con.createStatement())
		{
		
		int rows=stmt.executeUpdate(query);
		System.out.println("Today's Special Books :"+rows);
		
		try(ResultSet rs=stmt.executeQuery(query);)
		{
		
		while(rs.next())
		{
			Books b=new Books();
			b.bookName=rs.getString(1);
			b.bookVersion=rs.getInt(2);
			b.bookAuthor=rs.getString(3);
			b.bookLanguage=rs.getString(4);
			b.bookRating=rs.getInt(5);
			b.bookType=rs.getString(6);
			b.bookPublisher=rs.getString(7);
			b.bookPublishedDate=rs.getDate(8);
			b.bookLink=rs.getString(9);
			b.imgLink=rs.getString(10);
			
			l.add(b);
		}con.close();
		}
		}
		catch(Exception e)
		{
			
		}
		
		return (l);
	}

	public void addBook(Books ab) throws Exception {
		String query="insert into books(book_id,book_name,book_version,book_author,book_language,book_type,book_publisher,book_published_date)values(BOOK_ID_SQC.nextval,lower(?),?,lower(?),?,?,?,?)";
		
		try(Connection con=DbConnection.getConnection())
		{
		
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1,ab.bookName);
		pst.setInt(2,ab.bookVersion);
		pst.setString(3,ab.bookAuthor);
		pst.setString(4,ab.bookLanguage);
		pst.setString(5,ab.bookType);
		pst.setString(6,ab.bookPublisher);
		pst.setDate(7,ab.bookPublishedDate);
		
		int rows=pst.executeUpdate();
		System.out.println("No of rows inserted :"+rows);
		con.close();
		}
		catch(Exception e)
		{
			
		}

			
	}

	
	public void updateBookLanguage(Books ab) throws Exception {
		String query="update books set book_language=? where book_name=?";
		
		try(Connection con=DbConnection.getConnection())
		{
		
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, ab.bookLanguage);
		pst.setString(2, ab.bookName);
		
		int rows=pst.executeUpdate();
		System.out.println("No of rows Updated :"+rows);
		con.close();
		}
		catch(Exception e)
		{
			
		}

	}

	
	public void deleteBook(Books ab) throws Exception {
		String sql="delete from users where book_id=?";
		String query="delete from books where book_id=?";
		

		try(Connection con=DbConnection.getConnection())
		{
		PreparedStatement pstm = con.prepareStatement(sql);
		PreparedStatement pst = con.prepareStatement(query);
		pstm.setInt(1, ab.bookId);
		pst.setInt(1, ab.bookId);
		
		int rows=pstm.executeUpdate();
		pst.executeUpdate();
		System.out.println("No of rows Deleted :"+rows);
		
		con.close();
		}
		catch(Exception e)
		{
			
		}
			
	}


	
}