package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> Think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Marc V";
		//With encapsulation: public API methods
		acc1.setName("Fed Medilien");
		System.out.println(acc1.getName());
		acc1.setSSN("498785764");
		System.out.println("SSN: " + acc1.getSSN());
		
		acc1.accountNumber = "38476539";
		acc1.balance = 1000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "25689123";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "01265473";
		
		/****
		acc3.checkBalance();
		
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Joe";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		
		*****/

	}

}
