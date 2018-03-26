// Class with functions to predict the outcome of a meet
public class MeetPredict {

	// Predicts the outcome of two teams competing based solely on fastest times
	public static String defaultMeet(SwimTeam teamOne, SwimTeam teamTwo) {
		
		return new String();
	}
	
	// Predicts the outcome of two teams competing with level of taper factored in
	//		taperOne and taperTwo are integer representations of percentage of taper
	//		taperOne and taperTwo of 0 = no taper, 100 = full taper
	public static String taperMeet(SwimTeam teamOne, int taperOne, SwimTeam teamTwo, int TaperTwo) {
		
		return new String();
	}
	
	// Predicts the outcome of two teams competing with home pool advantage factored in
	//		teamOneIsHome specifies which team is home, with true indicating team one is home
	public static String homeMeet(SwimTeam teamOne, SwimTeam teamTwo, boolean teamOneIsHome) {
		
		return new String();
	}
	
	// Predicts the outcome of two teams competing with home pool advantage and level of taper factored in
	public static String homeTaperMeet(SwimTeam teamOne, int taperOne, SwimTeam teamTwo, int taperTwo, boolean teamOneIsHome) {
		
		return new String();
	}
	
}
