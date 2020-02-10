package com.bookshelf.dao;

import com.bookshelf.model.Login;

public interface LoginDAO {
	public void newLogin(Login ab)throws Exception;
	public String userLoginValidation(String eMail,String password)throws Exception;
}
