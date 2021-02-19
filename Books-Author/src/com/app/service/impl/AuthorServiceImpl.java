package com.app.service.impl;

import java.util.Scanner;

import com.app.model.Author;
import com.app.model.Book;
import com.app.service.AuthorService;
import java.util.ArrayList;
import java.util.List;

public class AuthorServiceImpl implements AuthorService {
	Scanner sc = new Scanner(System.in);
	List author = null;
	List books = null;

	@Override
	public void addBook() {
		System.out.println("Enter no. of books");
		int no = sc.nextInt();
		books = new ArrayList();

		for (int j = 0; j < no; j++) {
			Book b = new Book();
			System.out.println("Enter book id");
			b.setBid(sc.nextInt());
			System.out.println("Enter book name");
			b.setBname(sc.next());
			books.add(b);
		}
	}

	// _____________________________________________________________________
	@Override
	public void displayBook() {
		if (books != null) {
			for (Object o : books) {
				Book b = (Book) o;
				System.out.println(b.getBid() + "  " + b.getBname());
			}
		}
	}

//_____________________________________________________________________

	@Override
	public void addAuthor() {
		System.out.println("How many authors do you want");
		int num = sc.nextInt();
		author = new ArrayList();

		for (int i = 0; i < num; i++) {
			Author a = new Author();
			System.out.println("Enter Author id");
			a.setAid(sc.nextInt());
			System.out.println("Enter Author name");
			a.setAname(sc.next());
			// author.add(a);

			displayBook();
			List cs = new ArrayList();
			System.out.println("How many books do you want to allocate");
			int x = sc.nextInt();

			for (int p = 0; p < x; p++) {
				System.out.println("Enter book id for allocation");
				int y = sc.nextInt();
				for (Object o : books) {
					Book b = (Book) o;
					if (b.getBid() == y) {
						cs.add(b);
					}
				}
				a.setBooks(cs);
			}
			author.add(a);
		}
	}

//_____________________________________________________________________
	@Override
	public void displayAuthor() {
		if (author != null) {
			for (Object o : author) {
				Author a = (Author) o;
				System.out.println(a.getAid() + " " + a.getAname());
				// Book b=new Book();
				for (Object ob :a.getBooks()) {
					Book bb = (Book) ob;
					System.out.println("\t" +bb.getBid() + " " + bb.getBname());
				}
			}
		}
	}
}