package com.bookshelf.testing.users;

import java.util.Scanner;

import com.bookshelf.dao.LoginDAO;
import com.bookshelf.implementations.LoginDAOImpl;
import com.bookshelf.model.Logger;
import com.bookshelf.model.Login;

public class UserRegistration {
	private static final Logger logg=Logger.getInstance();
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("unused")
		Scanner s=new Scanner(System.in);
		LoginDAO li=new LoginDAOImpl();
		
		Login log=new Login();
		
		logg.debug("Enter the User Name :");
		log.setUserName(s.nextLine());
		logg.debug("Enter the E-Mail :");
		log.seteMail(s.nextLine());
		logg.debug("Enter the Phone no :");
		log.setPhoneNo(s.nextLong());
		logg.debug("Enter the Preference Type :");
		log.setPreferenceType(s.next());
		logg.debug("Enter the Password :");
		log.setPassword(s.next());
		
		li.newLogin(log);



	}

}
