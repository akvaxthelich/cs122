package classlab.week11;

public class FilePart {

	private final int partNumber;
	String changeInt;
	
	public FilePart(int newPartNumber) {
		
		partNumber = newPartNumber;
		
	}
	
	public String toString() {
		
		changeInt = Integer.toString(partNumber);
		return changeInt;
		
		
	}

}
