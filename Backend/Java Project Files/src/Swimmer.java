import java.util.Arrays;

// Class that represents a swimmer and his or her data
public class Swimmer {

	// ID number for this swimmer, synchronized with database
	private int swimmerID;
	
	// Name of this swimmer, in simple "First Last" format
	private String swimmerName;
	
	// Gender of this swimmer
	//		true:   Swimmer is male
	//		false:  Swimmer is female
	private boolean isMale;
	
	// All of the available event data for this swimmer
	private Event[] allEvents;
	
	// Creates a new blank Swimmer
	public Swimmer() {
		setSwimmerID(0);
		setSwimmerName("");
		setIsMale(false);
		setAllEvents(new Event[0]);
	}
	
	// Creates a new Swimmer with all relevant data specified
	public Swimmer(int swimmerID, String swimmerName, boolean isMale, Event[] allEvents) {
		setSwimmerID(swimmerID);
		setSwimmerName(swimmerName);
		setIsMale(isMale);
		setAllEvents(allEvents);
	}
	
	// Returns the ID number for this swimmer
	public int getSwimmerID() {
		return swimmerID;
	}
	
	// Sets the ID number for this swimmer
	public void setSwimmerID(int swimmerID) {
		this.swimmerID = swimmerID;
	}
	
	// Returns the name of this swimmer
	public String getSwimmerName() {
		return swimmerName;
	}
	
	// Sets the name for this swimmer
	public void setSwimmerName(String swimmerName) {
		this.swimmerName = swimmerName;
	}
	
	// Returns the gender of this swimmer
	public boolean getIsMale() {
		return isMale;
	}
	
	// Sets the gender of this swimmer
	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	// Returns all event data available for this swimmer
	public Event[] getAllEvents() {
		return allEvents;
	}
	
	// Sets the event data for this swimmer
	public void setAllEvents(Event[] allEvents) {
		this.allEvents = allEvents;
	}
	
	// Add a new event to the event data for this swimmer and set the event data
	public void addEvent(Event event) {
		Event[] a = Arrays.copyOf(getAllEvents(), getAllEvents().length + 1);
		a[a.length - 1] = event;
		setAllEvents(a);
	}
	
}
