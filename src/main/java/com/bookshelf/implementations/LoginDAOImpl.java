package com.bookshelf.implementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bookshelf.dao.LoginDAO;
import com.bookshelf.db.DbConnection;
import com.bookshelf.model.Logger;
import com.bookshelf.model.Login;

public class LoginDAOImpl implements LoginDAO{

	private static final Logger log=Logger.getInstance();

	public void newLogin(Login ab) throws Exception {
		
		String query="insert into login(login_no,user_name,email,phone_no,preference_type,password)values (login_sqc.nextval,?,?,?,?,?)";
		
		try(Connection con=DbConnection.getConnection();PreparedStatement pst = con.prepareStatement(query))
		{
		pst.setString(1,ab.getUserName());
		pst.setString(2,ab.geteMail());
		pst.setLong(3,ab.getPhoneNo());
		pst.setString(4,ab.getPreferenceType());
		pst.setString(5,ab.getPassword());
		
		int rows=pst.executeUpdate();
		log.debug("No of rows inserted :"+rows);
		con.close();
		}
		catch(Exception e)
		{
			
		}
	}

	public String userLoginValidation(String eMail,String password) throws Exception {
		// TODO Auto-generated method stub
		String query="select email,password from login where email=? and password=?";
		
		try(Connection con=DbConnection.getConnection();PreparedStatement pst = con.prepareStatement(query))
		{
		
		pst.setString(1,eMail);
		pst.setString(2,password);

		ResultSet rs=pst.executeQuery();
		
        String s=null;
		if(rs.next())
		{
			s="success";
		}
		
		else
		{
			s="failure";
		}
		con.close();
		
		return(s);
		}
		catch(Exception e)
		{
			
		}
		return null;
		
	}

}
