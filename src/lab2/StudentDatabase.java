package lab2;

public class StudentDatabase {

	public static void main(String[] args) {
		// Instanciation
		NewStudent s1 = new NewStudent("Emmanuel", "465879605");
		//NewStudent s2 = new NewStudent("Aisha", "546738908");
		

		s1.setStudentName("Emmanuel");
		
		s1.setPhone("5437765448");
		System.out.println("Phone: " + s1.getPhone());
		
		s1.setCity("Orlando");
		System.out.println("City: " + s1.getCity());
		
		s1.setState("Florida");
		System.out.println("State: " + s1.getState());
		
		s1.enroll("Emmanuel", "Math", 450);
		s1.enroll("Emmanuel", "Science", 700);
		s1.enroll("Emmanuel", "Japanese", 400);
		s1.pay("Emmanuel", 600);
		s1.checkBalance();
		System.out.println(s1.toString());
		s1.showCourses();

	}

}

class NewStudent {
	
	private String studentName;
	private String SSN;
	private String email;
	private static int iD = 1000;
	private String userID; //static ID  + "" + 4 random digits between 1000 and 9000 + last 4 of ssn
	private String phone;
	private String city;
	private String state;
	private double tuitionBalance = 0;
	//String[] courses = {"Math", "Science", "Japanese", "Chemistry", "Music"};
	
	//Constructor
	public NewStudent(String studentName, String SSN) {
		System.out.println("NEW STUDENT CREATED: " + studentName);
		
		// Automatically generated email id based on the name
		email = studentName.toLowerCase() + "@jmail.com";
		System.out.println("Your email address: " + email);
		
		//Set a private static id
		iD++;
		System.out.println("ID: " + iD);
		
		this.SSN = SSN;
		
		setUserId();
		
	}
	
	
	// Generate userID
	private void setUserId() {
		int randomNumber;
		int i = 0;
		do {
			randomNumber = (int) (Math.random() * 10000);
			if ((randomNumber > 1000) & (randomNumber < 9000)) {
				break;
			}
			i = i + 1;
		} while (i < 1000);
		userID = iD + "" + randomNumber + SSN.substring(5, 9);
		System.out.println("Your userID: " + userID);
	}
	
	
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	
	public void enroll(String studentName, String course, double fee) {
		//select a course
		System.out.println(studentName + " is enrolled in the following course: " + course);
		tuitionBalance = tuitionBalance + fee;
		System.out.println("Your fee for this course is: $" + fee);
		
	}
	
	public void pay(String StudentName, double amount) {
		tuitionBalance = tuitionBalance - amount;
		System.out.println("Pay tuition: $" + amount);
		
	}
	
	public void checkBalance() {
			System.out.println("Your balance is $" + tuitionBalance);
		 
	}
	
	@Override
	public String toString() {
		return "[Name: " + studentName + "]\n[Email: " + email + "]\n[UserID: " + userID + "]\n[Phone: " + phone + "]\n[City: " + city + "]\n[State: " + state + "]\n[Balance: " + tuitionBalance + "]";
	}
	
	public void showCourses() {
		String[] courses = {"Math", "Science", "Japanese", "Chemistry", "Music"};
		for (int i = 0; i < courses.length; i++) {
			System.out.println(courses[i]);
		}
	}


}
