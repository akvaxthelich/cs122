package classlab.week3;

public class CPU extends Players{

	private int strength = 9001;
	
	public CPU(String name, String team, int life, int strength) {
		
		super(name, team, life);
		
		this.strength = strength;
		
	}
	
	public void attack(Players p) {
		
		p.decreaseLife(strength);
		
	}
	
	public void defend() {
		
		System.out.println(this.name + " is defending.");
		
	}
	
	public void decreaseLife() {
		
		//implementation
		
	}
	
}
