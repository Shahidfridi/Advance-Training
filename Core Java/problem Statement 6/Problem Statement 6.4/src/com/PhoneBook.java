package com;

import java.util.Scanner;
class PhoneEntry
{
  String firstName;
  String lastName;    
  String phone;  
  PhoneEntry( String f, String l, String p )
  {
    firstName = f; lastName = l; phone = p;
  }
}

 class PhoneBook
{ 
 PhoneEntry[] phoneBook; 
 PhoneBook()    // constructor
 {
   phoneBook = new PhoneEntry[ 7 ] ;
   phoneBook[0] = new PhoneEntry("Shahid ", "Afridi ", "(418)665-1223");
   phoneBook[1] = new PhoneEntry("shubham" , "kr", "(860)399-3044");
   phoneBook[2] = new PhoneEntry( "Paul", "Kr", "(815)439-9271");
   phoneBook[3] = new PhoneEntry( "Violet" , "Smith", "(312)223-1937");
   phoneBook[4] = new PhoneEntry("John", "Smith", "(913)883-2874");
   phoneBook[5] = new PhoneEntry("Suleman", "Smith", "(913)883-2874");
   phoneBook[6] = new PhoneEntry("salman", "Dunbar", "(913)883-2874");
    
 }
 
 PhoneEntry search( String targetName )  
 {
   for(int j=0; j<phoneBook.length; j++)
   {
     if ( phoneBook[ j ].
       lastName.equals( targetName))
           return phoneBook[ j ];
   }
   return null;
 }
}
 
 
