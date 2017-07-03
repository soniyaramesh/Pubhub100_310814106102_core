package com.revature.dao;

import java.sql.SQLException;

import com.revature.model.User;

public class TestUserDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// TODO Auto-generated method stub
		User user=new User();
		user.setName("agalya");
       user.setEmail("agal@gmail.com");
        user.setPassword("abc123");
        UserDAO dao= new UserDAO();
        dao.register(user);
	}

}
