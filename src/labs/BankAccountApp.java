package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("690940141", 1000.50);
		BankAccount acc2 = new BankAccount("589342897", 2000);
		BankAccount acc3 = new BankAccount("479342338", 2500);
		
		
		acc1.setName("Tomoko");
		System.out.println("Name on account1: " + acc1.getName());
		
		//acc2.setName("Emmanuel");
		//System.out.println("Name on account2: " + acc2.getName());
		
		//acc3.setName("Aisha");
		//System.out.println("Name on account3: " + acc3.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
		
		//acc1.showBalance();

	}

}

class BankAccount implements IInterest {
	// Properties of bank account
	private static int iD = 1000;  // Internal ID
	private String accountNumber; //iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "287465933";
	private String name;
	private String SSN;
	private double balance;
	
	
	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("making a deposit of: " + amount);
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1+ rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: " + balance + "]";
	}
	

}
