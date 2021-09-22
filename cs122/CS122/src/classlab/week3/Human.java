package classlab.week3;

public class Human extends Players{

	public Human(String name, String team, int life) {
		
		super(name,team, life);
		
	}
	
	
	void decreaseLife(int damage, double chipDamage) {
		
		//slightly different implementation
		System.out.println("Damage taken.");
		System.out.println("Chip damage taken.");
		//throw unimplemented exception
	}
}
