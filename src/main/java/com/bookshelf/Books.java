package com.bookshelf;

import java.sql.Date;


public class Books {
	public int book_id_sqc;
	public int bookId;
	public String bookName;
	public int bookVersion;
	public String bookAuthor;
	public String bookLanguage;
	public String bookType;
	public Date bookUploadedOn;
	public int bookRating;
	public String bookPublisher;
	public Date bookPublishedDate;
	@Override
	public String toString() {
		return "Books [bookName=" + bookName + ", bookVersion=" + bookVersion + ", bookAuthor=" + bookAuthor
				+ ", bookLanguage=" + bookLanguage + ", bookType=" + bookType + ", bookRating=" + bookRating + ", bookPublisher=" + bookPublisher + ", bookPublishedDate="
				+ bookPublishedDate + "]";
	}
	
	

}
