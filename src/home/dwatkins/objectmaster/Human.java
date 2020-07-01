package home.dwatkins.objectmaster;

public class Human {
	public int health = 100;
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	
	public void attack(Human target) {
		System.out.println("A vicious blow!");
		target.health -= this.strength;
	}
}
