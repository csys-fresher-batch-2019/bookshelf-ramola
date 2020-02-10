package com.bookshelf.testing.users;

import java.util.Scanner;

import com.bookshelf.dao.LoginDAO;
import com.bookshelf.implementations.LoginDAOImpl;
import com.bookshelf.model.Login;

public class UserRegistration {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("unused")
		Scanner s=new Scanner(System.in);
		LoginDAO li=new LoginDAOImpl();
		
		Login log=new Login();
		
		System.out.println("Enter the User Name :");
		log.userName=s.nextLine();
		System.out.println("Enter the E-Mail :");
		log.eMail=s.nextLine();
		System.out.println("Enter the Phone no :");
		log.phoneNo=s.nextLong();
		System.out.println("Enter the Preference Type :");
		log.preferenceType=s.next();
		System.out.println("Enter the Password :");
		log.password=s.next();
		
		li.newLogin(log);



	}

}
