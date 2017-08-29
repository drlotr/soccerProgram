public class SoccerTeam {
	private int wins;
	private int losses;
	private int ties;
	private int points;
	private static int totalGoals = 0;
	private static int gamesPlayed = -1;
	public SoccerTeam() {
		this.wins = 0;
		this.losses = 0;
		this.ties = 0;
		this.points = 0;
		gamesPlayed++;
	}
	public void played(SoccerTeam opponent, int myScore, int opponentScore) {
		if(myScore > opponentScore) {
			this.wins = this.wins + 1;
			this.points = points + 3;
		} else if (myScore == opponentScore) {
			this.points = points + 1;
			this.ties = this.ties + 1;
			int tempPoints = opponent.getPoints() + 1;
			int tempTies = opponent.getTies() + 1;
			opponent.setPoints(tempPoints + 1);
			opponent.setTies(tempTies + 1);
		} else if (myScore < opponentScore) {
			int tempWins = opponent.getWins() + 1;
			int tempPoints2 = opponent.getPoints() + 3;
			opponent.setWins(tempWins + 1);
			opponent.setPoints(tempPoints2 + 3);
		}
		totalGoals = totalGoals + myScore + opponentScore;
	}
	public int getPoints() {
		return points;
	}
	public int getWins() {
		return wins;
	}
	public int getLosses() {
		return losses;
	}
	public int getTies() {
		return ties;
	}
	public static int getGamesPlayed() {
		return gamesPlayed;
	}
	public static int getTotalGoals() {
		return totalGoals;
	}
	public int setPoints(int points) {
		this.points = points;
		return this.points;
	}
	public int setTies(int ties) {
		this.ties = ties;
		return ties;
	}
	public int setWins(int wins) {
		this.wins = wins;
		return wins;
	}
	public static void startTournament(SoccerTeam team) {
		totalGoals = 0;
		gamesPlayed = 0;
	}
	
	public void reset() {
		this.wins = 0;
		this.losses = 0;
		this.ties = 0;
		this.points = 0;
	}
}