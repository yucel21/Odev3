package Odev;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println("Öğrenci eklendi " + student.getFirstName());
	}
	
	public void delete(Student student) {
		System.out.println("Öğrenci silindi " + student.getFirstName());
	}
	
	public void update(Student student) {
		System.out.println("Öğrenci güncellendi " + student.getFirstName());
	}
}
