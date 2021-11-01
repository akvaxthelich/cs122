package classlab.week10;
import java.util.Scanner;

public class CustomExceptions {
	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in); //scanner!
		boolean valid = false; //for checking later if we made it past security WHOA
		
		//note there is no while loop keeping this running so make sure you re-run it if you put in an invalid or valid code
		
		
		try {
			
			String input = scn.nextLine(); //take input
			
				
			if(input.length() != 5) {
				
				throw new InvalidCodeLengthException("Improper length."); //throw exception if it sucks
				
			}
			else if(!(Integer.parseInt(input.substring(0, 2)) > 0 || Integer.parseInt(input.substring(0, 2)) <= 0)) {
				
				throw new InvalidCodeException("Yeah, no."); //throws number format exception actually, this is unreachable
				
			}
			else {
				
				String swVal = input.substring(2); //easy access to switch case value
				
				switch(swVal) { //gorgeous switch statement
				
				case "SSS":
				
					valid = true;
					
				break;
				case "ISS":
					
					valid = true;
					
				break;
				case "CSS":
					
					valid = true;
					
				break;
				case "WAS":
					
					valid = true;
					
				break;
				
				default:
				throw new InvalidCodeException("Yeah, no."); //everything is correct except the last 3 letters
				//then throw this
				
				
			}
				
				if(valid) {
					
					System.out.println("AYYY NICE!"); //if you did it also note here is where valid gets used
					
				}
			
			
			}
			
			
		}
		catch(InvalidCodeLengthException e) {
			
			System.out.print("Sorry, but this is not the right length."); //catch bad length
			
		}
		catch(InvalidCodeException f) {
			
			System.out.print("Sorry, but this is not a valid code!"); //catch bad code
		}
		
		catch(Exception e) {
						
			System.out.print("Sorry, but this is not a valid code!"); //catch all for improper format
		}
		
		
		
		
		
	}
}

class InvalidCodeException extends Exception { //custom stustom

public InvalidCodeException(String message) {
		
		super(message);
		
	}
	
}

class InvalidCodeLengthException extends Exception { //whoa!

	public InvalidCodeLengthException(String message) {
		
		super(message);
		
	}
	
}


