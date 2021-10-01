package assignments.week4;


//parent class for all forms of text
public class Text {

	protected String title;
	protected int pages;
	
	public Text(String title, int pages){
		
		this.title = title;
		this.pages = pages;
		
	}
	
	public void printDesc() {
		
		print("Title: " + title);
		print("Page Count: " + pages);
	}
	
	public static void print(String s){
		
		System.out.println(s);
		
	} 
	
}
