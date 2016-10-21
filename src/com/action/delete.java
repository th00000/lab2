package com.action;

import com.opensymphony.xwork2.Action;

import pzh.Connecter;

public class delete implements Action {
	String isbn=new String();
	
//	ArrayList<Book> au_book;
//	ArrayList<Integer> au_id;
//	
//	public ArrayList<Book> getAu_book() {
//		return au_book;
//	}
//	public void setAu_book(ArrayList<Book> au_book) {
//		this.au_book = au_book;
//	}
//	public ArrayList<Integer> getAu_id() {
//		return au_id;
//	}
//	public void setAu_id(ArrayList<Integer> au_id) {
//		this.au_id = au_id;
//	}
//	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("now isbn="+isbn);
		String sql=new String();
		Connecter ac=new Connecter();
		sql="delete from book where isbn = '"+isbn+"'";
		ac.executeUpdate(sql);
		
		
		return "success";
	}

}
