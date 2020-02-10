package com.bookshelf.testing.admin;

import java.util.Scanner;

import com.bookshelf.dao.LoginDAO;
import com.bookshelf.implementations.LoginDAOImpl;
import com.bookshelf.model.Login;

public class UserLoginValidation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LoginDAO li=new LoginDAOImpl();
		
		Login log=new Login();
		System.out.println("Enter the E-Mail :");
		log.eMail=s.nextLine();
		System.out.println("Enter the Password :");
		log.password=s.next();
		
		li.userLoginValidation(log.eMail,log.password);		

		
	}

}
