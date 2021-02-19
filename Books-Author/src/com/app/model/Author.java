package com.app.model;

import java.util.List;

public class Author {
	private int aid;
	private String aname;
	private List books;

	public List getBooks() {
		return books;
	}

	public void setBooks(List books) {
		this.books = books;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

}
