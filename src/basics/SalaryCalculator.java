package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// create a variable
		
		// Declare a variable
		String career;
		System.out.println("Program is starting...");
		
		// Defining a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		// Declare and define variables
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		//career = "Web Developer";
		
		
		// compute annual salary
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My annual salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary);
		

	}

}
