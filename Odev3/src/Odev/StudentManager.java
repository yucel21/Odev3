package Odev;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println("��renci eklendi " + student.getFirstName());
	}
	
	public void delete(Student student) {
		System.out.println("��renci silindi " + student.getFirstName());
	}
	
	public void update(Student student) {
		System.out.println("��renci g�ncellendi " + student.getFirstName());
	}
}
