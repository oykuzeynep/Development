package BallGame;

public class simulateMatch extends football{
	private String homeTeamName;
	private String guestTeamName;
	protected int scoresOfHomeTeam;
	protected int scoresOfGuestTeam;

	public simulateMatch() {
	}

	public void setAsHomeTeam(footballClub club) {
		this.homeTeamName = club.getClubName();
		System.out.println("Home Team: " + homeTeamName);
	}

	public void setAsGuestTeam(footballClub club) {
		this.guestTeamName = club.getClubName();
		System.out.println("Guest Team: " + guestTeamName );

	}
	
	public void homeTeamScoresAGoal() {
		System.out.println(homeTeamName + " scored!");
		scoresOfHomeTeam++;
	}
	
	public void guestTeamScoresAGoal() {
		System.out.println(guestTeamName + " scored!");
		scoresOfGuestTeam++;


	}
	
	public void endOfFirstHalf() {
		System.out.println("End of first half!");

	}
	
	public void endOfGame() {
		System.out.println("Game is over!");
		announceWinner();

	}
	
	public void announceWinner() {
		if(scoresOfGuestTeam > scoresOfHomeTeam) {
			System.out.println("Winner team is " + guestTeamName + "!");
		}
		else if (scoresOfGuestTeam < scoresOfHomeTeam){
		    System.out.println("Winner team is " + homeTeamName + "!");
		}
		else
			System.out.println("Tie!");
	}


}
