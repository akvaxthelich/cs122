package classlab.week5;
import java.util.Scanner;

public class Lab5 {
		
		public static void main(String[] args) throws InvalidInputZero{
			
			Scanner scan = new Scanner(System.in);
			
			char c = scan.nextLine().charAt(0);
			
			//String a = Character.toString(c);
			if(Character.toString(c).toUpperCase().equals(c)) {
				
				System.out.println(c);
			}
			else {
				
				throw new InvalidInputZero("Invalid input.");
				
			}
			
		}
		

}
