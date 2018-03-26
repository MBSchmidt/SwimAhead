// Pulls data from the online database and instantiates the appropriate variable
public class DataPull {

	// Pulls event data matching the specified id number and returns a new Event containing pulled data
	Event pullEvent(int idNum) {
		
		return new Event();
	}
	
	// Pulls swimmer data matching the specified swimmer id and returns a new Swimmer containing pulled data
	Swimmer pullSwimmer(int swimmerID) {
		
		return new Swimmer();
	}
	
	// Pulls swim team data matching the specified swim team id and returns a new SwimTeam containing pulled data
	SwimTeam pullSwimTeam(int teamID) {
		
		return new SwimTeam();
	}
	
}
