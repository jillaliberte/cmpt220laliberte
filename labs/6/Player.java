public class Player {
	private String name; 
	private int goals;
	private String team;
	
	Player(){
		name = "Avila";
		goals = 0;
		team = "Marist";
	}
	public Player(String name1, int goals1, String team1){
		name = name1;
		goals = goals1;
		team = team1;
	}
	public String getName() {
		return name;
	}
	public int getGoals() {
		return goals;
	}
	public String getTeam() {
		return team;
	}
}
