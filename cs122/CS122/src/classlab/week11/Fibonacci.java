package classlab.week11;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		System.out.print(fibby(n, 0));
		
	}
	
	public static int fibby(int n, int sum) {
		

		sum += n;
		
		if(n == 0) {
			
			return sum;
			
		}
		return fibby(n - 1, sum);
		
		
	}

}
