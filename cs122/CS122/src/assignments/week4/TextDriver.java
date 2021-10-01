package assignments.week4;

public class TextDriver {

	//all classes derive from Text
	
	public static void main(String[] args) {
		
		Text text = new Text("RandomText", 4);
		Dictionary webster = new Dictionary("Merriam-Webster", 1600, 140000);
		Thesaurus synosaurus = new Thesaurus("Synosaurus", 1545, 134000, 100000, 100000);
		Novel grass = new Novel("Grass and Flowers", 400, "Dilbert Dillweed", Novel.Genre.Romance);
		
		text.printDesc();
		
		webster.printDesc();
		
		synosaurus.printDesc();
		
		Text.print(synosaurus.getSynonym());
		synosaurus.printDesc();
		
		grass.printBlurb();
		grass.printDesc();
		
	}

}
