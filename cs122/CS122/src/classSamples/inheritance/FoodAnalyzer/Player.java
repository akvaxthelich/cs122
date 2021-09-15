package classSamples.inheritance.FoodAnalyzer;

public class Player {

	protected String name;
	public String superpower;
	
	public Player (String name, String superpower) {
		
		this.name = name;
		this.superpower = superpower;
		
	}
	
	public void printPlayerName() {
		
		System.out.println(name);
		
	}
	
	public String getSuperPower() {
		return superpower;
		
	}
	
	
}
