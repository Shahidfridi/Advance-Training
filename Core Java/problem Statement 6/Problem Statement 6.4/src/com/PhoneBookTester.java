package com;

import java.util.Scanner;

public class PhoneBookTester {

	
	
	public static void main (String[] args)
	 {
	 	String firstName="";
	 	String lastName="";
	   PhoneBook pb = new PhoneBook();  
	  Scanner scan = new Scanner(System.in);
	  
	  do {
	  	
	  System.out.println("Enter the last name " );
	  lastName = scan.nextLine();
	  if(lastName.equals("quit")) break;
	  System.out.println("Enter the first name ");
	  firstName = scan.nextLine();
	   // search for "Violet Smith"
	   PhoneEntry entry =
	    pb.search( lastName ); 
	 
	   if ( entry != null )
	     System.out.println( "The number is " + entry.phone );
	   else
	     System.out.println("Name not found");
	   
	  } while (true);
		System.out.println("Good Bye ");
	
	   
	   
	  
	 }


}
	


