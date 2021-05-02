package Odev;

public class Main {

	public static void main(String[] args) {
						
		User user = new User(1, "yucel@yucel.com", "12345");
		
		Student student = new Student(1, "yucel@yucel.com", 
				"12345", 1, "Yucel", "Taskiran");
		
		Instructor instructor = new Instructor(1, "engin@engin.com", 
				"654321", 1, "Engin", "engin");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		
		StudentManager studentManager = new StudentManager();
		studentManager.delete(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.update(instructor);

	}

}
