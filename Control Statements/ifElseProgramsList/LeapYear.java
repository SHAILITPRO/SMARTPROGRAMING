package ifElseProgramsList;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please enter your year which you want check leap year");
		int leap=sc.nextInt();
		
		if(leap%4==0) {
			
			System.out.println(leap+" is leap year");
			
		}
		else {
			
			System.out.println("Not a leap year");
		}

	}

}
