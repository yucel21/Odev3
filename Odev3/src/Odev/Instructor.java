package Odev;

public class Instructor extends User {
	
	int instructorId;
	int userId;
	String firstName;
	String lastName;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String email, String password, 
			int instructorId, String firstName, String lastName) {
		super(id, email, password);
		this.instructorId = instructorId;
		this.userId = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
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
