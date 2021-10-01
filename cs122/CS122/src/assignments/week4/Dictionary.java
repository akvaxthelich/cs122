package assignments.week4;

public class Dictionary extends Text{

	protected int definitions;
	
	public Dictionary(String title, int pages, int definitions) {
		
		super(title, pages);
		this.definitions = definitions;
		
	}
	
	public void printDesc(){
		
		print("Title: " + title);
		print("Page Count: " + pages);
		print("Definitions: " + definitions);
		
	}
	
}
