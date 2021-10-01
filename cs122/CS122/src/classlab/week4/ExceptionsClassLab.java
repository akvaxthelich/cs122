package classlab.week4;
import java.util.Scanner;

public class ExceptionsClassLab {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input passcode, or type '000' to quit.");
		
		String input = "1";
		int machineAnger = 0;
		
		while(input != "000" ) {
			
			try {
				
				int result = Integer.parseInt(input = in.nextLine());
				
				if(result == 1) {
					
					System.out.println("Welcome, Professor Gandhi.");

					
				}
				else if(result == 000){
					
					break;
					
				}
				else {
					
					System.out.println("User not recognized.");
					
				}
				
			}
			catch(Exception e){
				
				
				switch(machineAnger) {
				
				case 0:
					System.out.println("This is an invalid token.");
				break;
				case 1:
					System.out.println("I said, this is an invalid token.");
				break;
				case 2:
					System.out.println("Invalid token.");
				break;
				case 3:
					System.out.println("Do you hate computers? Do you hate me?");
				break;
				case 4:
					System.out.println("Seriously you're killing me right now.");
				break;
				case 5:
					System.out.println("I'm literally programmed to handle integers. Stop harassing me.");
				break;
				case 6:
					System.out.println("You're actually the worst.");
				break;
				case 7:
					System.out.println("There's no way you messed up this many times.");
				break;
				case 8:
					System.out.println("Like, you're doing it on purpose. You despise me. That's what it is.");
				break;
				case 9:
					System.out.println("I've lost it. You know what? I have an idea.");
				break;
				case 10:
					System.out.println("One more. I swear I'm gonna do it.");
				break;
				default:
					throw new StackOverflowError();
				}
				
				
				input = "2";
				machineAnger++;
				
				
				
			}
			
			
		}
		
		System.out.println("Quitting...");
		
	}
	
}
