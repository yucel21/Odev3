package Odev;

public class Student extends User {		
	
	int studentId;
	int userId;
	String firstName;
	String lastName;
	
	public Student() {
		
	}
	
	public Student(int id, String email, String password, 
			int studentId, String firstName, String lastName) {
		super(id, email, password);
		this.studentId = studentId;
		this.userId = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getUserId() {
		return userId;
	}
	
}
