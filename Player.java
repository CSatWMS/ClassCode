public class Player {
	private String username;
	private int level;
	private boolean isOnline;

	public static int numUsers = 0;

	public Player(String username, int level, boolean isOnline){
		this.username = username;
		this.level = level;
		this.isOnline = isOnline;
		if (isOnline){
			numUsers++;
		}
	}

	public Player(String username){
		this(username, 1, false);
	}

	//getter and setters

	public String toString(){
		String toReturn = username;
		toReturn += "\nLevel: " + level;
		toReturn += "\nIs Online: " + isOnline;
		return toReturn;
	}

	public void levelUp(){
		level++;
	}

	public void logOn(){
		if (isOnline){
			System.out.println("You're already online!");
		} else {
			isOnline = true;
			numUsers++;
		}
	}

	public void logOff(){
		if (!isOnline){
			System.out.println("You're already offline!");
		} else {
			isOnline = false;
			numUsers--;
		}
	}

	public int getLevel(){
		return level;
	}

	public void versus(Player otherPlayer){
		if (this.level > otherPlayer.getLevel()){
			this.levelUp();
			if (otherPlayer.getLevel() > 1){
				otherPlayer.setLevel(otherPlayer.getLevel() - 1);
			}
		} else if (this.level < otherPlayer.getLevel()){
			if (this.level > 1){
				this.level--;
			}
			otherPlayer.levelUp();
		} else {
			System.out.println("It's a tie!");
		}
	}

}