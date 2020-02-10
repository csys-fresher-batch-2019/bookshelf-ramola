package com.bookshelf.model;

public class Login {

	public int loginNo;
	public String userName;
	public String eMail;
	public Long phoneNo;
	public String preferenceType;
	public String password;
	
	@Override
	public String toString() {
		return "Login [loginNo=" + loginNo + ", userName=" + userName + ", eMail=" + eMail + ", phoneNo=" + phoneNo
				+ ", preferenceType=" + preferenceType + ", password=" + password + "]";
	}

}
