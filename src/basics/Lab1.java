package basics;

public class Lab1 {

	public static void main(String[] args) {
		// Write a function that takes a value N and returns the sum of 1 to N
		
		
		
		//System.out.println(sumsUpTo(5));
		System.out.println("Sum: " + sum(5));
		//System.out.println(facto(5));
		System.out.println("Factorial: " + fact(5));

		int[] numbers = {4, 8, 90, 34, 56, 87, 0};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Avg: " + findAvg(numbers));
		
	}
	
	static int sumsUpTo(int number) {
		return (number * (number + 1) / 2);
	}
	
	
	// OR
	
	public static int sum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	
	//Write a function that computes factorial. Use recursion for this.
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return fact(n-1) * n;
	}
	
	
	public static int facto(int n) {
		if (n == 0) {
			return 1;
		}
		else {
			int result = 1;
			for (int i = n; i >= 1; i--) {
				result = result * i;
				//System.out.println(i);
			}
			return result;
		}
		
	}
	
	// Write 3 functions that return the Max, Min, and avg of an array
	
	// find min
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	// find max
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	// find average
	public static double findAvg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}


}
