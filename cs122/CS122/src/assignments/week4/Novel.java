package assignments.week4;

public class Novel extends Text {

	protected String protagonist;
	protected Genre genre;
	
	public enum Genre{
	
		Horror,
		Nonfiction,
		Mystery,
		Romance,
		Drama
		
		
	}
	
	public Novel(String title, int pages, String protagonist, Genre genre) {
		
		super(title, pages);
		this.protagonist = protagonist;
		this.genre = genre;
	}
	
	public void printBlurb(){
		
		try {
			throw new UnsupportedOperationException();
			
		}
		catch(UnsupportedOperationException e){
			
			print("This is not implemented yet.");
			
		}
		
		
		//blurb is not written/given, throw unimplemented error
		
	}
	
	public void printDesc() {
		
		print("Title: " + title);
		print("Page Count: " + pages);
		print("Protagonist Name: " + protagonist);
		print("Genre: " + genre);
	}
	
}
