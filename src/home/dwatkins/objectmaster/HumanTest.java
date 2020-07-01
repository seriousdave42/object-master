package home.dwatkins.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Ninja bob = new Ninja();
		Wizard fred = new Wizard();
		Samurai james = new Samurai();
		System.out.println(bob.health);
		System.out.println(fred.health);
		System.out.println(james.health);
		bob.steal(fred);
		fred.fireball(bob);
		fred.attack(james);
		james.deathBlow(fred);
		james.meditate();
		System.out.println(bob.health);
		System.out.println(fred.health);
		System.out.println(james.health);
		Samurai faye = new Samurai();
		Samurai spike = new Samurai();
		faye.howMany();
		james.howMany();
	}

}
