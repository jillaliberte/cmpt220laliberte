

public class Goal{
	private int minute;
	private Player scorer; 
	
	public Goal(){
		minute = 0;
		scorer = null;
	}
	public Goal (int minute1, Player scorer1){
		minute = minute1;
		scorer = scorer1;		
	}
	public int getMinute () {
		return minute;
	}
	public Player getPlayer() {
		return scorer;
	}
	public String string1() {
		return "minute when goal was scored: " + minute + " , scored by: " + scorer.getName();
	}
	
	
}
