package com.action;

import com.opensymphony.xwork2.Action;

import pzh.Connecter;

public class add_au implements Action {
	int authorid,age;
	String name,country;
	
	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String sql=new String();
		Connecter ac=new Connecter();
		sql=String.format("insert into author (AuthorID,Name,Age,Country) values (%d,'%s',%d,'%s')", authorid,name,age,country);
		ac.executeUpdate(sql);
		return "success";
	}

}
