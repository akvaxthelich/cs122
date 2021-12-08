package classlab.week14;

public class RecursiveSum {
	
		public static void main(String[] args){
			
			System.out.println(recursiveSum(2));
		}
	

	
	public static int recursiveSum(int i) {
		
		if(i == 1) {
			
			return 1;
		}
		
		else {
			
			return i + recursiveSum(i - 1);
			
		}
	}
}


//return 1 if input is 1
//else return num + (num -1)
