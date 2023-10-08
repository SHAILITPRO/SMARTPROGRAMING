
package forLoopProgramsList;
import java.util.*;
public class TablePrintByUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter your number which you want print a table");
		int table=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(table+" * "+i+" = "+(table*i));
		}

	}

}
