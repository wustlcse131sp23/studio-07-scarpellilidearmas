package studio7;

public class HockeyPlayer {
	private String name;
	private int jerseyNumber;
	private int goals;
	private int assists;
	private int points;
	private int games;
	
	public HockeyPlayer(String name, int jerseyNumber, int goals, int assists, int points, int games) {
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.goals = goals;
		this.assists = assists;
		this.points = points;
		this.games = games;
	}
	
	public void completeGame(int goals, int assists) {
		this.goals = this.goals + goals;
		this.assists = this.assists + assists;
		this.games++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	public int getGoals() {
		return goals;
	}
	
	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	public int getAssists() {
		return assists;
	}
	
	public void setAssists(int assists) {
		this.assists = assists;
	}
	
	public int getPoints() {
		return goals + assists;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getGames() {
		return games;
	}
	
	public void setGames(int games) {
		this.games = games;
	}

}
