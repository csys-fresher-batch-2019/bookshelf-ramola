package com.bookshelf.db;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnection {
	public static Connection getConnection()throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		
		//System.out.println(connection);
		return connection;
	}
}