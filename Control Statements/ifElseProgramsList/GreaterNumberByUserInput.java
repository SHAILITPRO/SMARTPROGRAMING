package ifElseProgramsList;

import java.util.Scanner;

public class GreaterNumberByUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your first number");
		int first=sc.nextInt();
		
		System.out.println("Please enter your second number");
		int second=sc.nextInt();
		
		System.out.println("Please enter your third  number");
		int third=sc.nextInt();
		
		if(first>second && first>third) {
			
			System.out.println("First is greater than second and third");
		}
		else if(second>first && second>third) {
			
			System.out.println("second  is greater than first and third");
		}
		
		else {
			System.out.println("Third is greater than first and second");
			
		}

	}

}
