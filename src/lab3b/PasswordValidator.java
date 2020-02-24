package lab3b;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PasswordValidator {

	public static void main(String[] args) {
		// Read a txt file containing a list of passwords
		String filename = "C:\\Training\\SDETuniversity\\Files\\passwords.txt";
		String[] passwords = new String[13];
		
		File file = new File(filename);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0; i<passwords.length; i++) {
				passwords[i] = br.readLine();
				//System.out.println(passwords[i]);
			}
			br.close();
		} catch(FileNotFoundException e) {System.out.println("ERROR: Could not open file");} 
		  catch (IOException e) {System.out.println("ERROR: Could not read file");}
		
		
		// Validate that each password contains a number, a letter, and a special character
		for (String password: passwords) {
			System.out.println(password);
		}

	}

}
