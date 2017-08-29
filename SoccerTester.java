
public class SoccerTester {
	public static void main(String[] args) {
		SoccerTeam soccerTeam1 = new SoccerTeam();
		SoccerTeam soccerTeam2 = new SoccerTeam();
		SoccerTeam soccerTeam3 = new SoccerTeam();
		SoccerTeam soccerTeam4 = new SoccerTeam();
		soccerTeam1.played(soccerTeam2, 4, 2);
		soccerTeam1.played(soccerTeam3, 2, 4);
		soccerTeam1.played(soccerTeam4, 1, 2);
		soccerTeam2.played(soccerTeam3, 3, 3);
		soccerTeam2.played(soccerTeam4, 4, 4);
		soccerTeam3.played(soccerTeam4, 9, 1);
		int games = soccerTeam1.getGamesPlayed() + soccerTeam2.getGamesPlayed() + soccerTeam3.getGamesPlayed() + soccerTeam4.getGamesPlayed();
		System.out.println("Soccer Team 1's Points: " + soccerTeam1.getPoints());
		System.out.println("Soccer Team 2's Points: " + soccerTeam2.getPoints());
		System.out.println("Soccer Team 3's Points: " + soccerTeam3.getPoints());
		System.out.println("Soccer Team 4's Points: " + soccerTeam4.getPoints());
		System.out.println("Number Of Games: " + games);
		System.out.println("Number of Goals Total: " + soccerTeam1.getTotalGoals()); // doesnt matter which team is used
		soccerTeam1.reset();
		soccerTeam2.reset();
		soccerTeam3.reset();
		soccerTeam4.reset();
		soccerTeam1.played(soccerTeam2, 7, 2);
		soccerTeam1.played(soccerTeam3, 1, 9);
		soccerTeam1.played(soccerTeam4, 9, 8);
		soccerTeam2.played(soccerTeam3, 7, 11);
		soccerTeam2.played(soccerTeam4, 4, 2);
		soccerTeam3.played(soccerTeam4, 5, 7);
		games = soccerTeam1.getGamesPlayed() + soccerTeam2.getGamesPlayed() + soccerTeam3.getGamesPlayed() + soccerTeam4.getGamesPlayed();
		System.out.println("Soccer Team 1's Points: " + soccerTeam1.getPoints());
		System.out.println("Soccer Team 2's Points: " + soccerTeam2.getPoints());
		System.out.println("Soccer Team 3's Points: " + soccerTeam3.getPoints());
		System.out.println("Soccer Team 4's Points: " + soccerTeam4.getPoints());
		System.out.println("Number Of Games: " + games);
		System.out.println("Number of Goals Total: " + soccerTeam1.getTotalGoals());
	}
}
