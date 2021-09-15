package classSamples.inheritance.FoodAnalyzer;

public class PlayerDriver {

	public static void main(String[] args) {
		
		Player steve = new Player("Steve", "Building");
		
		steve.printPlayerName();

		System.out.print(steve.superpower);
		
		FortnitePlayer bruh = new FortnitePlayer("Bruh", "Building", "Red");
		
		bruh.showcase();
		
		bruh.printPlayerName();
		
		System.out.print(bruh.superpower);
	
		
		
	}
	
}
