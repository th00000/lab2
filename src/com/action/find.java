package com.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import com.items.Book;
import com.opensymphony.xwork2.Action;

import pzh.Connecter;

public class find implements Action {
	String input;
	String now_name=new String();
	ArrayList<Book> au_book;
	ArrayList<Integer> au_id;
	
	public String getNow_name() {
		return now_name;
	}

	public void setNow_name(String now_name) {
		this.now_name = now_name;
	}

	public ArrayList<Integer> getAu_id() {
		return au_id;
	}

	public void setAu_id(ArrayList<Integer> au_id) {
		this.au_id = au_id;
	}

	public ArrayList<Book> getAu_book() {
		return au_book;
	}

	public void setAu_book(ArrayList<Book> au_book) {
		this.au_book = au_book;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("now input ="+input);
		now_name=input;
		if (input.isEmpty()) return "fail";
		int l;
		String sql=new String();
		ResultSet in_Author,in_Book;
		Book nb;
		
		nb=new Book();
		au_book=new ArrayList<Book>();
		au_id=new ArrayList<Integer>();
		Connecter ac=new Connecter();
		
		System.out.println("yes");
		sql = "select * from author where name='"+input+"'";
		in_Author=ac.executeQuery(sql);
		while (in_Author.next())
		{
			au_id.add(in_Author.getInt("authorid"));
		}
		
		l=au_id.size();
		if (l==0) return "fail";
		for (int i=0;i<l;i++)
		{
			sql="select * from book where authorid = "+au_id.get(i);
			in_Book=ac.executeQuery(sql);
			while (in_Book.next())
			{
				nb=new Book();
//				System.out.println("______________________________________________");
//				nb.setAuthorid(in_Book.getInt("authorid"));
				nb.setIsbn(in_Book.getString("isbn"));
//				nb.setPrice(in_Book.getInt("price"));
//				nb.setPublishdate(in_Book.getDate("publishdate"));
//				nb.setPublisher(in_Book.getString("publisher"));
				nb.setTitle(in_Book.getString("title"));
				
//				System.out.println(in_Book.getInt("authorid"));
//				System.out.println(in_Book.getString("isbn"));
				System.out.println(nb.getIsbn());
				au_book.add(nb);
			}
		}
		return "success";
	}

}
