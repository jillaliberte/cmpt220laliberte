import java.util.Date;
import java.util.Random;

class SoccerMatch{
	private Date startTime;
	private Date endTime;
	private String location;
	private String home;
	private String visitor;
	private Player homePlayers[]; 
	private Player visitorPlayers [];
	private Goal homeGoals [];
	private Goal visitorGoals [];
	private  int homePlayerCount;
	private  int visitPlayerCount;
	private  int homeGoalCount;
	private  int visitGoalCount;
	
	public SoccerMatch() {
		startTime = null;
		endTime = null;
		location = null;
		home = null;
		visitor = null; 
		homePlayers = new Player[11];
		visitorPlayers = new Player[11];
		homeGoals = new Goal[10];
		visitorGoals = new Goal[10];
		homePlayerCount = 0;
		visitPlayerCount = 0;
		homeGoalCount = 0;
		visitGoalCount = 0;
		
		for (int i = 0; i <11; i++) {
			homePlayers[i]= new Player();
			visitorPlayers [i] = new Player();
		}
		for (int i = 0; i < 10; i++) {
			homeGoals[i] = new Goal();
			visitorGoals [i] = new Goal();
		}
	}
	public SoccerMatch(Date start1, Date end1, String location1, String home1, String visitor1 ){
		startTime = start1;
		endTime = end1;
		location = location1;
		home = home1;
		visitor = visitor1;
	}
	
	public void addHomePlayer(Player p) {
		homePlayers [homePlayerCount++] = p;
}
	public void addVisitorPlayer(Player p) {
		visitorPlayers [visitPlayerCount++] = p;
	}
	public void addHomeGoal (Goal g) {
		homeGoals [homeGoalCount++] = g;
	}
	public void addVisitorGoal (Goal g) {
		visitorGoals [visitGoalCount++] = g;
	}
	public int[] getHomeGoals() {
		int goals[] = new int[10];
		for (int i = 0; i < 10; i++) {
			goals[i] = homeGoals[i].getPlayer().getGoals();
	}
		return goals; 
	}
		public int [] getVisitorGoals() {
		int goals[] = new int[10];
		for (int i = 0; i < 10; i++) {
			goals[i] = visitorGoals[i].getPlayer().getGoals();
	}
		return goals;
}
		String getWinner() {
			String wins = " ";
			int homeGoals[] = getHomeGoals();
			int visitGoals[] = getVisitorGoals();
			int totalHome = 0;
			int totalVisitor = 0;

			for(int x = 0; x < 10; x++) {
				totalHome += homeGoals[x];
				totalVisitor += visitGoals[x];
			}

			wins = "Home team goals: " + totalHome + "Visiting team goals: " + totalVisitor;

			if(totalHome > totalVisitor) {
				wins += "The Winner is the Home Team";
			} 
			else if(totalVisitor > totalHome) {
				wins += "The Winner is the Visitor Team";
			} 
			else {
				wins += "Tie-Game";
			} 
				

			return wins;

		}// End of method
public static void main(String[]args) {
	Random time = new Random();
	Date time1 = new Date();
	Date time2 = new Date();
	
	SoccerMatch match = new SoccerMatch (time1, time2,"Poughkeepsie", "Marist", "Manhattan" );
	
	String homePlayerName [] = {"Ilin", "Ginman", "Curti", "Avila", "Mac", "Conway", "Copetti", "Harr", "Cancilla", "Gavilanes", "Kozak"};
	String visitPlayerName [] = {"Doran", "Komano", "Hitchins", "Busch", "Cotter", "Murphy", "Velez", "Carsley", "Koroma", "Riegel", "Awana"};
	
	for (int i = 0; i < 11; i ++) {
		match.addHomePlayer(new Player(homePlayerName[i], time.nextInt(10),"Marist"));
		match.addVisitorPlayer(new Player(visitPlayerName[i], time.nextInt(10),"Manhattan"));
	}
	for (int i = 0; i < 10; i ++) {
		match.addHomeGoal(new Goal(time.nextInt(59), match.homePlayers[i]));
		match.addVisitorGoal(new Goal(time.nextInt(59), match.visitorPlayers[i]));
}


System.out.println ("Home Team: ");
System.out.println("     " + match.homePlayers);

System.out.println(" ");
System.out.println("Visiting Team:");
System.out.println("     " + match.visitorPlayers);

System.out.println(" ");
}

}
