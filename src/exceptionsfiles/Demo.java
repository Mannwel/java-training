package exceptionsfiles;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program is starting...");
		doMath(12, 0);
		System.out.println("Program continues...");

	}
	
	public static void doMath(int a, int b) {
		answer(a, b);
	}
	
	public static double answer(int x, int y) {
		// cath the error here.
		return x/y;
	}

}