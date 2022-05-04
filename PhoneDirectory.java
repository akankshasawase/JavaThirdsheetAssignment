/*Write a program to create a directory that contains the following information.
(a) Name of a person
(b) Address
(c) Telephone Number (if available with STD code)
(d) Mobile Number (if available)
(e) Head of the family*/
package javabatch3;

import java.util.Scanner;

public class PhoneDirectory {
	 String Pname,Padd,  PphoneNo, PMobNO, Phead;
	
	     PhoneDirectory(String name,String add, String phoneNo,String MobNO,String head)
	     {
	         Pname=name;
	         Padd=add;
	         PphoneNo=phoneNo;
	         PMobNO=MobNO;
	         Phead=head;

	     }
	     
	  void display()
	  {
	    System.out.println("Name:"+Pname);
	    System.out.println("Address:"+Padd);
	    System.out.println(" Phone NO:"+PphoneNo);
	    System.out.println(" Mobile No:"+PMobNO);
	    System.out.println(" Head of family:"+Phead);
	  }
	  public static void main(String[] args) 

	  {
		  Scanner s= new Scanner(System.in);
	      String name,add, phoneNo, MobNO, head ;
	      System.out.println(" Enter Person's Details ");
	      System.out.println(" Name of Person:");
	      name=s.next();
	      System.out.println(" Address:");
	      add=s.next();
	      System.out.println("Phone No:");
	      phoneNo=s.next();
	      System.out.println(" Mobile No:");
	      MobNO=s.next();
	      System.out.println(" Head of Family:");
	      head=s.next();

	      PhoneDirectory p1=new PhoneDirectory(name,add, phoneNo, MobNO, head);
	      p1.display();

	

	}

}

