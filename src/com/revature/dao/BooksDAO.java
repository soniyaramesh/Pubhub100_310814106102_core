package com.revature.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.Utill.ConnectionUtil;
import com.revature.model.Book;



public class BooksDAO {
	
	// TO ADD A BOOK
	
	public void add(Book book) throws SQLException, ClassNotFoundException{
		java.sql.Connection connection = ConnectionUtil.getconnection();
		PreparedStatement pst=connection.prepareStatement("INSERT INTO books (book_name,author_name,price)VALUES(?,?,?)");
     pst.setString(1, book.getBookName());
     pst.setString(2, book.getAuthorName());
     pst.setInt(3,book.getPrice());
     pst.executeUpdate();
	}
	
	
   // TO CHANGE A BOOK PRICE  
	
     public void modify(Book book) throws SQLException, ClassNotFoundException{
		java.sql.Connection connection = ConnectionUtil.getconnection();
		PreparedStatement pst=connection.prepareStatement("UPDATE books SET price=? WHERE book_name=?");
         
     pst.setInt(1,book.getPrice());
     pst.setString(2, book.getBookName());
     pst.executeUpdate();
	}


   // TO REMOVE A BOOK	 
     
     public void delete(Book book) throws SQLException, ClassNotFoundException{
		java.sql.Connection connection = ConnectionUtil.getconnection();
		PreparedStatement pst=connection.prepareStatement("DELETE FROM books WHERE id =?");
      
     pst.setInt(1,book.getId());
         pst.executeUpdate();       
	} 
	

    // TO VIEW ALL BOOKS
     
      public List<Book> findAll() throws SQLException, ClassNotFoundException{
		java.sql.Connection connection = ConnectionUtil.getconnection();
		PreparedStatement pst=connection.prepareStatement("SELECT id,book_name,author_name,price FROM books ");
        ResultSet rs =pst.executeQuery();
        List<Book>books= new ArrayList<Book>(); 
        
      while(rs.next()){
    	  Book book= new Book();
    	  book.setId(rs.getInt(1));
    	  book.setBookName(rs.getString(2));
    	  book.setAuthorName(rs.getString(3));
    	  book.setPrice(rs.getInt(4));
    	  books.add(book);
    	  
      }
      return books;
      }
    


   // VIEW A BOOK BY BOOK NAME
      
   public List<Book> findByName( Book book) throws SQLException, ClassNotFoundException{
		java.sql.Connection connection = ConnectionUtil.getconnection();
		PreparedStatement pst=connection.prepareStatement("SELECT id,book_name,author_name,price FROM books where book_name=? ");
    pst.setString(1,book.getBookName());
     
      ResultSet rs =pst.executeQuery();
     
   List<Book> books= new ArrayList<Book>();  
    while(rs.next()){
    	 book.setId( rs.getInt(1));
    	 book.setBookName(rs.getString(2));
    	 book.setAuthorName(rs.getString(3));
    	 book.setPrice(rs.getInt(4));
    	 books.add(book);
    	     }
     return books;
}
}