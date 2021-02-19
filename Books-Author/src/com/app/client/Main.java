package com.app.client;

import java.util.Scanner;
import com.app.service.AuthorService;
import com.app.service.impl.AuthorServiceImpl;

public class Main {

	public static void main(String[] args) {
         AuthorService as=new AuthorServiceImpl();
         Scanner sc=new Scanner(System.in);
         String s="";
        
         do { 
         System.out.println("1] addBook()");
         System.out.println("2] displayBook()");
         System.out.println("3] addAuthor()");
         System.out.println("4] displayAuthor()");
         
         
         System.out.println("Enter no.");
         int z=sc.nextInt();
         
         
         switch(z) {
         case 1:
        	      as.addBook();
         break;
         case 2:
   	              as.displayBook();
         break;
         case 3:
   	              as.addAuthor();
         break;
         case 4:
   	              as.displayAuthor();
         break;
         }
         System.out.println("Do you want to continue y/n");
         s=sc.next();
	}while(s.equals("y"));
  }
}
