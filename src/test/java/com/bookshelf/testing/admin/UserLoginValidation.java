package com.bookshelf.testing.admin;

import java.util.Scanner;

import com.bookshelf.dao.LoginDAO;
import com.bookshelf.implementations.LoginDAOImpl;
import com.bookshelf.model.Logger;
import com.bookshelf.model.Login;

public class UserLoginValidation {
	private static final Logger logg=Logger.getInstance();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LoginDAO li=new LoginDAOImpl();
		
		Login log=new Login();
		logg.debug("Enter the E-Mail :");
		log.seteMail(s.nextLine());
		logg.debug("Enter the Password :");
		log.setPassword(s.next());
		
		li.userLoginValidation(log.geteMail(),log.getPassword());		

		
	}

}
