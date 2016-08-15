package BallGame;

public class footballClub extends football {

	private String clubName;
	private String colors;
	private String stadiumName;
	private int clubValue;
	private int stadiumCapacity;
	
	
	public footballClub(String clubName, String colors, String stadiumName, int clubValue, int stadiumCapacity) {
		super();
		this.clubName = clubName;
		this.colors = colors;
		this.stadiumName = stadiumName;
		this.clubValue = clubValue;
		this.stadiumCapacity = stadiumCapacity;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public int getClubValue() {
		return clubValue;
	}
	public void setClubValue(int clubValue) {
		this.clubValue = clubValue;
	}
	public int getStadiumCapacity() {
		return stadiumCapacity;
	}
	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}

	
}
