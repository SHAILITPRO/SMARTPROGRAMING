package methods;

import java.util.Scanner;

public class PreefinedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int first=sc.nextInt();
		
		System.out.println("Please enter second number");
		int seconds=sc.nextInt();
		System.out.println("The biggest number is "+Math.max(first, seconds));
		
		
		
		System.out.println("Please enter  your first input");
		int test1=sc.nextInt();
		
		System.out.println("Please enter  your first input");
		int test2=sc.nextInt();
		
		
		if(test1>test2) {
			
			System.out.println("Your test1 is greater: "+test1);
		}
		else {
			
			System.out.println("Your test2 is greater"+test2);
		}
		
		

	

}
}
