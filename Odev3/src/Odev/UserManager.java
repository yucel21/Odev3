package Odev;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� eklendi " + user.getEmail());
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi " + user.getEmail());
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi " + user.getEmail());
	}
}
