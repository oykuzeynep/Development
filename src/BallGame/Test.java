package BallGame;

public class Test {
	
	public static void main(String args[]) {
		footballClub club1 = new footballClub("GS", "Sarı Kırmızı", "Ali Sami Yen", 1, 1000);
		footballClub club2 = new footballClub("FB", "Sarı Lacivert", "Ali Sami Yen", 1, 1000);
		
		simulateMatch sim1 = new simulateMatch();
		
		sim1.setAsGuestTeam(club1);
		sim1.setAsHomeTeam(club2);
		
		sim1.guestTeamScoresAGoal();
		sim1.homeTeamScoresAGoal();
		sim1.endOfFirstHalf();
		sim1.homeTeamScoresAGoal();

		sim1.endOfGame();

		
		

	}


	


	
}
