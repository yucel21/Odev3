package Odev;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println("E�itmen eklendi " + instructor.getFirstName());
	}
	
	public void delete(Instructor instructor) {
		System.out.println("E�itmen silindi " + instructor.getFirstName());
	}
	
	public void update(Instructor instructor) {
		System.out.println("E�itmen g�ncellendi " + instructor.getFirstName());
	}
}
