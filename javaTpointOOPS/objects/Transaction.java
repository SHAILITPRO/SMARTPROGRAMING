package objects;

public class Transaction {

	int userAccountNumber;
	String userName;
	float userAmount;
	
	void insertRecord(int uan, String un,float ua) {
		userAccountNumber=uan;
		userName=un;
		userAmount=ua;		
	}
	
	void withdrwaAmount(float ua) {
		if(userAmount<ua) {
			System.out.println("you don't have enough balance");
			
		}else {
			userAmount=userAmount-ua;
			System.out.println("Your withdrwa Amount  is"+ua);
		}
		
	}
	void deposit(float ua) {
		if(ua<=0) {
			
			System.out.println("Please enter valid amount");
		}
		else {
		userAmount=userAmount+ua;
		System.out.println("Your deposit amount is: "+ua);
		}
	}
	void display() {
		
		System.out.println(userAccountNumber+" "+userName+" "+userAmount);
	}
	void balance( ) {
		
		System.out.println("Your balance is: "+userAmount);
		
	}


}
