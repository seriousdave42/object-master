package home.dwatkins.objectmaster;

public class Samurai extends Human {
	public Samurai() {
		this.health = 200;
	}
	
	public void deathBlow(Human target) {
		System.out.println("The samurai delicately instakills, but at what cost?! (" + this.health/2 + " HP)");
		target.health = 0;
		this.health /= 2;
	}
	
	public void meditate() {
		System.out.println("The samurai viciously meditates, restoring themself by " + this.health/2 + " HP!");
		this.health *= 1.5; 
	}
}
