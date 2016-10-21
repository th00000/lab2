package com.action;

import java.sql.ResultSet;

import com.items.Book;
import com.opensymphony.xwork2.Action;

import pzh.Connecter;

public class show implements Action {
	String isbn;
	Book show_book=new Book();
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Book getShow_book() {
		return show_book;
	}
	
	public void setShow_book(Book show_book) {
		this.show_book = show_book;
	}

	@Override
	public String execute() throws Exception {
		String sql=new String();
		Connecter ac=new Connecter();
		ResultSet bo;
		// TODO Auto-generated method stub
		sql="select * from book where isbn = '"+isbn+"'";
		bo=ac.executeQuery(sql);
		if (bo.next())
		{
			show_book.setIsbn(bo.getString("isbn"));
			show_book.setTitle(bo.getString("title"));
			show_book.setAuthorid(bo.getInt("authorid"));
			show_book.setPublisher(bo.getString("publisher"));
			show_book.setPublishdate(bo.getDate("publishdate"));
			show_book.setPrice(bo.getInt("price"));
//			System.out.println("show book !!!!!isbn="+show_book.getIsbn());
		}
//		
		return "success";
	}


}
