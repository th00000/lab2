package com.action;

import java.sql.ResultSet;
import com.opensymphony.xwork2.Action;

import pzh.Connecter;

public class add implements Action {
	String isbn,title,publisher;
	String publishdate;
	int price,authorid;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String execute() throws Exception {
		String sql=new String();
		Connecter ac=new Connecter();
		ResultSet ans;
		sql=String.format("select * from book where isbn='"+isbn+"'");
		ans=ac.executeQuery(sql);
		if (ans.next()) return "no";
//		if (!publishdate.equals("%d%d%d%d/%d%d/%d%d")) return "no";
		sql=String.format("insert into book (isbn,title,authorid,publisher,publishdate,price) values ('%s','%s',%d,'%s','%s',%d)",isbn,title,authorid,publisher,publishdate,price);
    	System.out.println(sql);
		ac.executeUpdate(sql);
		sql="select * from author where authorid="+authorid;
		ans=ac.executeQuery(sql);
		if (ans.next()) return "success";
		else return "fail";
		// TODO Auto-generated method stub
	}

}
