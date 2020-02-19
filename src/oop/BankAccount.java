package oop;

public class BankAccount implements IRate {
	
	//Define variables
	String accountNumber;
	
	// static >> belongs to the CLASS. Not the object.
	// final >> constant (often static final)
	private static final String routingNumber = "013546";
	
	// Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: Unique methods used to define, setup, initialize properties of an object.
	// Constructors are IMPLICITLY called upon instantiation.
	// Constructors must have the same name as the class itself.
	// Constructors have NO return type.
	
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED.");
	}
	
	// Overloading: Call same method name with different arguments.
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		
		// initDeposit, accountType, and Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000";
			
		} else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		
		System.out.println(Msg);
		balance = balance + initDeposit;
		//System.out.println("CURRENT BALANCE: $" + balance);
	}
	
	
	//Getters and Setters
	// Allow the user to define the name
	public void setName(String name) {
		this.name = name;
		// this.name = "Mr. " + name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[NAME: " + name + ". ACCOUNT NUMBER: " + accountNumber + ". ROUTING NUMBER: " + routingNumber + ". BALANCE: $" + balance + "]";
	}

}
