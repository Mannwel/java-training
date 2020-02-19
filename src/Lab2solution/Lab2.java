package Lab2solution;

public class Lab2 {

	public static void main(String[] args) {
		// Create a student object
		Student stu1 = new Student("Emmanuel", "876456342");
		Student stu2 = new Student("Tomoko", "453657860");
		Student stu3 = new Student("Aisha", "657483984");
		Student stu4 = new Student("Fedner", "947523151");
		
		stu1.enroll("Math101");
		stu1.enroll("English101");
		stu1.enroll("History211");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());

	}

}

class Student {
	// properties
	private static int iD = 0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
		
	}
	
	public String getEmail() {
		return email;
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

	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@jmail.com";
		System.out.println("Your email: " + email);
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;		
		int randNum = (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		System.out.println(randNum);
		userId = iD + "" + randNum + ssn.substring(5, 9);
		System.out.println("UserID: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		//System.out.println(courses);
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment: $" + amount);
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	@Override
	public String toString() {
		return "[NAME: " + name + "]\n[COURSES: " + courses + "]\n[BALANCE: " + balance + "]";
	}
}
