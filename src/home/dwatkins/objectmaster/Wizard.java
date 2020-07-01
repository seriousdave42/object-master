package home.dwatkins.objectmaster;

public class Wizard extends Human{
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human target) {
		System.out.println("The wizard viciously heals " + this.intelligence + " HP!");
		target.health += this.intelligence;
	}
	
	public void fireball(Human target) {
		System.out.println("The wizard viciously fireballs for " + this.intelligence*3 + " HP!");
		target.health -= this.intelligence*3;
	}
}
