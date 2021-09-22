package classlab.week3;

public class Players extends Items {

	protected String team;
	protected int life;
	protected final int MAX_LIFE = 100;
	
	
	public Players(String name, String team, int life) {
		
		super(name);
		this.team = team;
		this.life = life;
	}
	
	public String getTeam() {
		
		return team;
		
	}
	
	public void decreaseLife(int damage) {
		
		
		if(life - damage <= 0) {
		
			life = 0;
			//Die();			
			//throw some unimplemented exception
		}
		else {
			life -= damage;
			
		}
		
	}
	
	
	
}
