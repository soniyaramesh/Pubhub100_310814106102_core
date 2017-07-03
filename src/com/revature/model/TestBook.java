package com.revature.model;

public class TestBook {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Book book =new Book();

		book.setId(1);
		book.setBookName("Harry potter");
		book.setAuthorName("J.K.Rowling");
		book.setPrice(100);
		
		

		System.out.println(book.getId());
		System.out.println(book.getBookName());
		System.out.println(book.getAuthorName());
		System.out.println(book.getPrice());
		
		System.out.println(book);
		
	}

}
