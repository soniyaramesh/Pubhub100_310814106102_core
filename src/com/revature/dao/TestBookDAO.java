package com.revature.dao;

import java.sql.SQLException;

public class TestBookDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// TODO Auto-generated method stub
		BooksDAO dao= new BooksDAO();
		dao.findAll();
           	}

}
