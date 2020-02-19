package oop;

class Person {
	// every person will have a:
	String name;
	String email;
	String phone;
	
	// every person will be able to:
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(name + " is eating.");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping.");
	}
}


public class Demo {

	public static void main(String[] args) {
		
		// This process is called: instantiating an object.
		Person person1 = new Person();
		
		// Define properties for person1
		person1.name = "Emmanuel";
		person1.email = "emmanuel@testemail.com";
		person1.phone = "8756432139";
		
		// instantiating an object.
		Person person2 = new Person();
		
		// Define properties for person2
		person2.name = "Fedner";
		person2.email = "fedner@testemail.com";
		person2.phone = "3212743411";
		
		
		// Abstraction for person1
		person1.walk();
		person1.sleep();
		person1.eat();
		
		System.out.println("\n-----------\n");
		
		// Abstraction for person2
		person2.walk();
		person2.sleep();
		person2.eat();
		
		/*
		// Person
		
		// Attributes, variables, adjectives, descriptors
		String name = "Aisha";
		String email = "aisha@testemail.com";
		String phone = "8089404887";
		
		// Action, activity, behavior
		//System.out.println(name + " is walking.");
		//System.out.println(name + " is eating.");
		
		
		
		// What if we wanted to do this for another person
		String name2 = "Tomoko";
		String email2 = "tomoko@testemail.com";
		String phone2 = "9087404667";
		
		// Action, activity, behavior
		//System.out.println(name2 + " is walking.");
		//System.out.println(name2 + " is eating.");
		System.out.println("\n------------\n");
		
		// Enhance by adding functions to minimize  code. Call function here
		walking(name2);
		walking(name);

	}
	
	static void walking(String name) {
		System.out.println(name + " is walking.");
		
		*/
	}
	

}
