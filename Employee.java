// Write a program to print the name, salary and date of joining of 10 employees in a company. Use array of objects.

package javabatch3;

import java.util.Scanner;

public class Employee {
	static int empid;
    static String empname;
    static int  salary;
    static String date;



public static void  empdata()
{
    for(int i=0;i<10;i++)
    {
    	 Scanner s= new Scanner(System.in);
    System.out.println("enter employee id:");
     empid=s.nextInt();
     System.out.println("enter employee name:");
      empname=s.next();
      System.out.println("enter employee salary:");
      salary=s.nextInt();
      System.out.println( "enter date of joining:");
      date=s.next();
        }
    }

public static void  display()

    {
	 System.out.println("Employee id:"+empid);
	 System.out.println("Emp Name:"+empname);
	System.out.println("Emp salary:"+salary);
	 System.out.println("Emp joining date:"+date);
    }

public static void  main(String [] args)

{
   int  e[]= new int[10];
   System.out.println("Enter the employee information:");
    for(int i=0;i<10;i++)
    {
        empdata();
    }
    System.out.println("Employee Details:");
    for(int i=0;i<10;i++)
    {
        display();
    }

	}

}
