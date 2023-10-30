package objects;

import java.util.*;
 class Account{
	 
	 public static void main(String[] args) {
		 Transaction act= new Transaction();
		 @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		 
		 System.out.println("please enter you account number:");
		 int ac=sc.nextInt();
		 
		 System.out.println("Please enter your name:");
		 String name=sc.next();
		 
		 System.out.println("Please enter your amount");
		 float am=sc.nextFloat();
		 
		 act.insertRecord(ac,name , am);
		 act.display();
		 
		 System.out.println("please enter your withdraw amount");
		 float amt1=sc.nextFloat();
		 act.withdrwaAmount(amt1);
		 act.balance();
		
		 System.out.println("Please enter your deposit amount");
		 float depositAmount=sc.nextFloat();
		 act.deposit(depositAmount);
		
		
		 act.balance();
		
		 
	}
 }
