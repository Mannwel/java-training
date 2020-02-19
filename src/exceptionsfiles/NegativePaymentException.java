package exceptionsfiles;

public class NegativePaymentException extends Exception {
	//Define class variable
	double payment;
	
	//Constructor that takes the value that would throw the exception
	//Assign local variable to class variable
	public NegativePaymentException(double payment) {
		//System.out.println("ERROR: negative payment");
		this.payment = payment;
	}
	
	// override the toString() method to include specific exception message
	public String toString() {
		return "ERROR: Cannot take negative payment: " + payment;
	}
}
