package classSamples.inheritance.FoodAnalyzer;

public class FortnitePlayer extends Player {

	public String armorColor;
	
	public FortnitePlayer(String name, String superpower, String armorColor) {
		
		super(name, superpower);
		this.armorColor = armorColor;
		
	}
	
	public void showcase() {
		
		System.out.println("Hello, " + name +  "." + " Your superpower is " + superpower + ", and your armor color is " + armorColor +".");
		
	}
	
}
