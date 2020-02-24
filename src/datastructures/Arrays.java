package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a","b","c","d","e"};
		
		System.out.println("Using the old-fashioned way:");
		for (int i=0; i<5; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		
		System.out.println("\n\nUsing .length on the variable:");
		for (int n=0; n<alphabet.length; n++) {
			System.out.print(alphabet[n] + " ");
		}
		
		System.out.println("\n\nUsing variable to hold the length of the array:");
		int size = alphabet.length;
		for (int n=0; n<size; n++) {
			System.out.print(alphabet[n] + " ");
		}

		System.out.println("\n\nUsing the FOR EACH method:");
		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}
		
		
		//Declare a matrix
		System.out.println("\n\nDouble arrays:");
		String[][] users = {
				{"Emmanuel", "Ferdilus", "ef@testmail.com", "3212743414"},
				{"Fedner", "Medilien", "fm@testmail.com", "3212743411"},
				{"Tomoko", "Ferdilus", "tf@testmail.com", "4071234561"}
		};
		
		// Get the size of array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);
		
		// Traverse the double array usinf 2 loops
		System.out.println("\nTraverse the double array (1):");
		for (int i=0; i<numOfUsers; i++) {
			System.out.print("[");
			for (int j=0; j<numOfFields; j++) {
				System.out.print(users[i][j] + " ");
			}
			System.out.println("]");
		}
		
		// Traverse the double array (2)
		System.out.println("\nTraverse the double array (2):");
		for (int i=0; i<numOfUsers; i++) {
			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			System.out.println(firstName + " " + lastName + " " + email + " " + phone);
		}
		
		// Traverse the double array using FOR EACH (3)
		System.out.println("\n\nIterating through the double array using FOR EACH (3):");
		for (String[] user : users) {
			System.out.print("[ ");
			for (String field : user) {
				System.out.print(field + " ");
			}
			System.out.println("]");
			
		}
		
	}

}
