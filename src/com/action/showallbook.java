package com.action;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.items.Book;
import com.opensymphony.xwork2.Action;

import pzh.Connecter;

public class showallbook implements Action {
	ArrayList<Book> all_book;
	
	public ArrayList<Book> getAll_book() {
		return all_book;
	}

	public void setAll_book(ArrayList<Book> all_book) {
		this.all_book = all_book;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("pzh!!!");
		all_book=new ArrayList<>();
		Book nb=new Book();
		String sql=new String();
		ResultSet abook;
		Connecter ac=new Connecter();
		sql="select * from book";
		abook=ac.executeQuery(sql);
		while (abook.next())
		{
			nb=new Book();
//			System.out.println("______________________________________________");
			nb.setAuthorid(abook.getInt("authorid"));
			nb.setIsbn(abook.getString("isbn"));
			nb.setPrice(abook.getInt("price"));
			nb.setPublishdate(abook.getDate("publishdate"));
			nb.setPublisher(abook.getString("publisher"));
			nb.setTitle(abook.getString("title"));
			
//			System.out.println(in_Book.getInt("authorid"));
//			System.out.println(in_Book.getString("isbn"));
//			System.out.println(nb.getIsbn());
			all_book.add(nb);
		}
		return "success";
	}

}
