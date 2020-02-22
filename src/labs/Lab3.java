package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab3 {

	public static void main(String[] args) {
		// Read a file of passwords
		String filename = "C:\\Training\\SDETuniversity\\Files\\passwords.txt";
		String[] passwords = new String[13];
		
		File file = new File(filename);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < passwords.length; i++) {
				passwords[i] = br.readLine();
			}
		} catch (FileNotFoundException e) {System.out.println("ERROR: Could not open file");
		} catch (IOException e) {System.out.println("ERROR: Could not read file");}
		
		// Test against criteria
		for (String password: passwords) {
			System.out.println("******\n " + password + "\n");
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			boolean hasInvalidChar = false;
			
			for (int n = 0; n < password.length(); n++) {
				//Condition1: contains a number
				if ("0123456789".contains(password.substring(n,n+1))) {
					hasNumber = true;
					//System.out.println("Position: " + n + " contains a number");
				}
				// Condition2: contains a letter
				else if (("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n,n+1))) || ("abcdefghijklmnopqrstuvwxyz".toUpperCase().contains(password.substring(n,n+1)))) {
					hasLetter = true;
					//System.out.println("Position: " + n + " contains a letter");
				}
				// Condition3: contains special character
				else if ("/!@#$%^&*()-_=+".contains(password.substring(n,n+1))) {
					hasSpecialChar = true;
					//System.out.println("Position: " + n + " contains a special character");
				}
				else {
					hasInvalidChar = true;
					try {
						throw new InvalidCharacterException(password.substring(n,n+1));
					} catch (InvalidCharacterException e) {System.out.println(e.toString()); System.out.println(password);}
				}
			}
			
			// Test and exception handling
			try {
				if (!hasNumber) {throw new NumberCriteriaException(password);}
				else if (!hasLetter) {throw new LetterCriteriaException(password);}
				else if (!hasSpecialChar) {throw new SpecialCharCriteriaException(password);}
				else {
					System.out.println("VALID PASSWORD: "); 
				}

			} catch (NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e) {
				System.out.println("Invalid Password: "); 
				System.out.println(e.toString());
			}
		}
	}
}

class InvalidCharacterException extends Exception {
	String ch;
	public InvalidCharacterException(String ch) {
		this.ch = ch;
	}
	public String toString() {
		return "InvalidCharacterException: " + ch;
	}
}

class NumberCriteriaException extends Exception {
	String password;
	public NumberCriteriaException(String password) {
		this.password = password;
	}
	public String toString() {
		return "NumberCriteriaException: " + password;
	}
}

class LetterCriteriaException extends Exception {
	String password;
	public LetterCriteriaException(String password) {
		this.password = password;
	}
	public String toString() {
		return "LetterCriteriaException: " + password;
	}
}

class SpecialCharCriteriaException extends Exception {
	String password;
	public SpecialCharCriteriaException(String password) {
		this.password = password;
	}
	public String toString() {
		return "SpecialCharCriteriaException: " + password;
	}
}