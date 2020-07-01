package home.dwatkins.objectmaster;

public class Ninja extends Human {
	public int stealth = 10;
	
	public void steal(Human target) {
		System.out.println("The ninja viciously vamps " + this.stealth + " HP!");
		target.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runAway() {
		System.out.println("The ninja viciously cowers in fear, losing 10 HP in shame!");
		this.health -= 10;
	}
}
