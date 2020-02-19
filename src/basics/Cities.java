package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array. Here, the array's size is implicitly defined
		
		String[] cities = {"New York", "San Fransisco", "Miami", "Dallas"};
		System.out.println(cities[1]);
		System.out.println(cities[0]);
		System.out.println(cities[3]);
		System.out.println(cities[2]);
		System.out.println("------------\n");

	
		// Declare an array.
		String[] countries;
		
		// Define the array
		countries = new String[4];
				
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		countries[3] = "Japan";
		System.out.println(countries[2]);
		System.out.println(countries[1]);
		System.out.println(countries[0]);
		System.out.println(countries[3]);
		
		System.out.println("------------");
		System.out.println("PRINTING WITH DO WHILE LOOP\n");
		
		
		// Declare and define an array. Here, the array's size is explicitly defined
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		int i = 0;
		// Do Loop: Enters the loop THEN test the condition
		do {
			System.out.println(states[i]);
			i = i + 1;
		} while (i < 5);
		
		System.out.println(" ");
		System.out.println("------------");
		System.out.println("PRINTING WITH WHILE LOOP\n");
		
		//while Loop: Test the condition THEN enters the loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("STATE FOUND");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("------------");
		System.out.println("PRINTING WITH FOR LOOP\n");
		// FOR loop: Best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
	}

}
