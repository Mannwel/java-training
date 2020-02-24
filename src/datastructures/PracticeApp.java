package datastructures;

public class PracticeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("\n\nUsing the old fashioned way:");
		String txt = "- ";
		for (int i=0; i<10; i++) {
				System.out.print(txt);
				System.out.print(txt);
				System.out.print(txt);
				System.out.print(txt);
				System.out.print(txt);
				System.out.print(txt);
				System.out.print(txt);
				System.out.print(txt);
				System.out.print(txt);
				System.out.println(txt);

		}
		
		System.out.println("\n\nUsing a double array:");
		// using a double array
		String[][] dashes = {{"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
		
		for (String[] dash : dashes) {
			for (String e : dash) {
				for (int i=0; i<9; i++) {
					System.out.print(e + " ");
				}
				System.out.println(e + " ");
			}
		}
		
		System.out.println("\n\nUsing a single array:");
		// using a single array
		String[] ch = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
		
		for (String str : ch) {
			for (int i=0; i<9; i++) {
					String e = str;
					System.out.print(e + " ");
			}
			System.out.println(str + " ");
			
		}
		
		*/
		
		//Write a Java program to calculate the average value of array elements.
		int[] numbers = {1,4,0,6,8,9,4,0,5,8};
		int sum = 0;
		for (int number : numbers) {
			sum = sum + number;
		}
		double avg = sum/numbers.length;
		System.out.println("Array avg: " + avg);
		System.out.println("\n=============================\n");
		
		
		//Write a Java program to test if an array contains a specific value
		int match = 0;
		int counter = 0;
		for (int number : numbers) {
			if (number == match) {
				counter++;
			}
			
		}
		if (counter < 2) {
			System.out.println(counter + " match found");
		}
		else {
			System.out.println(counter + " matches found");
		}
		System.out.println("\n=============================\n");
		
		
		//Write a Java program to find the index of an array element
		int wantedItem = 0;
		int cnt = 0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] == wantedItem) {
				System.out.println("Match found at index: " + i);
				cnt++;
			}
			
		}
		if (cnt == 0) {
			System.out.println("No match found");
		}
		System.out.println("\n=============================\n");
	}
}
