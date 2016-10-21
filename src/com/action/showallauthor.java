package com.action;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.items.Author;
import com.opensymphony.xwork2.Action;

import pzh.Connecter;

public class showallauthor implements Action {
	ArrayList<Author> all_author;
	
	public ArrayList<Author> getAll_author() {
		return all_author;
	}

	public void setAll_author(ArrayList<Author> all_author) {
		this.all_author = all_author;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		all_author=new ArrayList<>();
		Author au=new Author();
		String sql=new String();
		ResultSet aau;
		Connecter ac=new Connecter();
		sql="select * from author";
		aau=ac.executeQuery(sql);
		while (aau.next())
		{
			au=new Author();
//			System.out.println("______________________________________________");
			au.setAuthorid(aau.getInt("authorid"));
			au.setAge(aau.getInt("age"));
			au.setName(aau.getString("name"));
			au.setCountry(aau.getString("country"));
//			System.out.println(in_Book.getInt("authorid"));
//			System.out.println(in_Book.getString("isbn"));
//			System.out.println(nb.getIsbn());
			all_author.add(au);
		}
		return "success";
	}

}
