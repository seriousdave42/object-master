package home.dwatkins.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human bob = new Human();
		Human fred = new Human();
		System.out.println(fred.health);
		bob.attack(fred);
		System.out.println(fred.health);
	}

}
