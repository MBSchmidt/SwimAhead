import java.util.Arrays;

// Class that represents a swim team and all of its data
public class SwimTeam {

	// ID number for this swim team, synchronized with database
	private int teamID;
	
	// Name of this team
	private String teamName;
	
	// All of the available swimmer data available for the men's portion of this team
	private Swimmer[] menTeam;
	
	// All of the available swimmer data available for the women's portion of this team
	private Swimmer[] womenTeam;
	
	// Creates a new blank swim team
	public SwimTeam() {
		setTeamID(0);
		setTeamName("");
		setMenTeam(new Swimmer[0]);
		setWomenTeam(new Swimmer[0]);
	}
	
	// Creates a new swim team with all relevant data specified
	public SwimTeam(int teamID, String teamName, Swimmer[] menTeam, Swimmer[] womenTeam) {
		setTeamID(teamID);
		setTeamName(teamName);
		setMenTeam(menTeam);
		setWomenTeam(womenTeam);
	}
	
	// Returns the ID number for this team
	public int getTeamID() {
		return teamID;
	}
	
	// Sets the ID number for this team
	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}
	
	// Returns the name of this team
	public String getTeamName() {
		return teamName;
	}
	
	// Sets the name of this team
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	// Returns the data for the men's portion of this team
	public Swimmer[] getMenTeam() {
		return menTeam;
	}
	
	// Sets the data for the men's portion of this team
	public void setMenTeam(Swimmer[] menTeam) {
		this.menTeam = menTeam;
	}
	
	// Returns the data for the women's portion of this team
	public Swimmer[] getWomenTeam() {
		return womenTeam;
	}
	
	// Sets the data for the women's portion of this team
	public void setWomenTeam(Swimmer[] womenTeam) {
		this.womenTeam = womenTeam;
	}
	
	// Add a new swimmer to the men's team data for this team then set the data
	public void addMenMember(Swimmer member) {
		Swimmer[] m = Arrays.copyOf(getMenTeam(), getMenTeam().length + 1);
		m[m.length - 1] = member;
		setMenTeam(m);
	}
	
	// Add a new swimmer to the women's team data for this team then set the data
	public void addWomenMember(Swimmer member) {
		Swimmer[] w = Arrays.copyOf(getWomenTeam(),  getWomenTeam().length + 1);
		w[w.length - 1] = member;
		setWomenTeam(w);
	}
	
}
