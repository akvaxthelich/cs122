package assignments.week4;

public class Thesaurus extends Dictionary{

	protected int synonyms;
	protected int antonyms;
	
	public Thesaurus(String title, int pages, int definitions, int synonyms, int antonyms){
		
		super(title, pages, definitions);
		this.synonyms = synonyms;
		this.antonyms = antonyms;
		
	}
	
	public void printDesc(){
		
		print("Title: " + title);
		print("Page Count: " + pages);
		print("Definitions: " + definitions);
		print("Synonyms: " + synonyms);
		print("Antonyms: " + antonyms);
	}
	
	public String getSynonym(){
		
		return "synonym";
		//implementation, might have some way to input a word or something in a real program.
		
	}
	
}
