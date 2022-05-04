/* Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a function for each of the following
1 - Generate a unique account number for each depositor
For the first depositor, account number will be BA1000, for the second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in the balance of any depositor
4 - Withdraw some amount from the balance deposited
5 - Change the address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by the user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display the final information of that depositor
4 - Remove some amount from the account of any depositor and then display the final information of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions.*/
package javabatch3;

import java.util.Scanner;

class BankDetails
{
	 private String accno;  
	    private String name;  
	    private String acc_type;  
	    private long balance;  
	    Scanner sc = new Scanner(System.in);  
	    //method to open new account  
	    public void openAccount() {  
	        System.out.print("Enter Account No: ");  
	        accno = sc.next();  
	        System.out.print("Enter Account type: ");  
	        acc_type = sc.next();  
	        System.out.print("Enter Name: ");  
	        name = sc.next();  
	        System.out.print("Enter Balance: ");  
	        balance = sc.nextLong();  
	    }  
	    //method to display account details  
	    public void showAccount() {  
	        System.out.println("Name of account holder: " + name);  
	        System.out.println("Account no.: " + accno);  
	        System.out.println("Account type: " + acc_type);  
	        System.out.println("Balance: " + balance);  
	    }  
	    //method to deposit money  
	    public void deposit() 
	    {  
	        long amt;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amt = sc.nextLong();  
	        balance = balance + amt;  
	    }  
	    //method to withdraw money  
	    public void withdrawal() 
	    {  
	        long amt;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amt = sc.nextLong();  
	        if (balance >= amt)
	        {  
	            balance = balance - amt;  
	            System.out.println("Balance after withdrawal: " + balance);  
	        } else
	        {  
	        	System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
	        }  
	    }  
	    //method to search an account number  
	    public boolean search(String ac_no) 
	    {  
	        if (accno.equals(ac_no)) 
	        {  
	            showAccount();  
	            return (true);  
	        }  
	        return (false);  
	    }  
	 }



public class BankingApp 
{

	public static void main(String[] args)
	{
		   Scanner sc = new Scanner(System.in);  
	        //create initial accounts  
	        System.out.print("How many number of customers do you want to input? ");  
	        int n = sc.nextInt();  
	        BankDetails C[] = new BankDetails[n];  
	        for (int i = 0; i < C.length; i++) 
	        {  
	            C[i] = new BankDetails();  
	            C[i].openAccount();  
	        }  
	        // loop runs until number 5 is not pressed to exit  
	        int ch;  
	        do {  
	            System.out.println("\n ***Banking System Application***");  
	            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	                switch (ch) {  
	                    case 1:  
	                        for (int i = 0; i < C.length; i++) 
	                        {  
	                            C[i].showAccount();  
	                        }  
	                        break;  
	                    case 2:  
	                        System.out.print("Enter account no. you want to search: ");  
	                        String ac_no = sc.next();  
	                        boolean found = false;  
	                        for (int i = 0; i < C.length; i++)
	                        {  
	                            found = C[i].search(ac_no);  
	                            if (found)
	                            {  
	                                break;  
	                            }  
	                        }  
	                        if (!found)
	                        {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 3:  
	                        System.out.print("Enter Account no. : ");  
	                        ac_no = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) 
	                        {  
	                            found = C[i].search(ac_no);  
	                            if (found)
	                            {  
	                                C[i].deposit();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) 
	                        {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 4:  
	                        System.out.print("Enter Account No : ");  
	                        ac_no = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) 
	                        {  
	                            found = C[i].search(ac_no);  
	                            if (found) 
	                            {  
	                                C[i].withdrawal();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) 
	                        {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 5:  
	                        System.out.println("Exit Application");  
	                        break;  
	                }  
	        }
	        while (ch != 5);  
	}
}

	            
	




