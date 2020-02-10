package com.bookshelf.model;

import java.sql.Date;


public class Books {
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
	public String imgLink;
	public String bookLink;
	
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", bookVersion=" + bookVersion + ", bookAuthor="
				+ bookAuthor + ", bookLanguage=" + bookLanguage + ", bookType=" + bookType + ", bookUploadedOn="
				+ bookUploadedOn + ", bookRating=" + bookRating + ", bookPublisher=" + bookPublisher
				+ ", bookPublishedDate=" + bookPublishedDate + ", imgLink=" + imgLink + ", bookLink=" + bookLink + "]";
	}
	
	

}
