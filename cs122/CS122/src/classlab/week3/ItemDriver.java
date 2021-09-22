package classlab.week3;

public class ItemDriver {

	public static void main(String[] args) {
		
	Players dhruv = new Players("Dhruv", "Professors", 100);	
	
	CPU compPlayer = new CPU("DeathBot", "CPUs", 100, 10000);
	
	Players andrew = new Human("Andrew", "Students", 100);
	
	s(dhruv.getName());
	s(dhruv.getTeam());
	
	compPlayer.defend();
	
	s(andrew.getName());
		
	}
	
	public static void s(String say) {
		
		System.out.println(say);

		
	}

}
