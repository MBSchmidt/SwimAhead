import java.util.Arrays;

// Class that represents an event and its data
public class Event {

	// ID number for this event, synchronized with database
	private int idNum;
	
	// Name of this event, such as 200 Backstroke or 100 Butterfly
	private String eventName;
	
	// Array of times achieved in this event
	private double[] times;
	
	// Array of dates that times were achieved, corresponds with the times
	private int[] dates;
	
	// Creates a new blank Event
	public Event() {
		setIdNum(0);
		setEventName("");
		setTimes(new double[0]);
		setDates(new int[0]);
	}
	
	// Creates a new Event with all relevant data specified
	public Event(int idNum, String eventName, double[] times, int[] dates) {
		setIdNum(idNum);
		setEventName(eventName);
		setTimes(times);
		setDates(dates);
	}
	
	// Returns the ID number of this event
	public int getIdNum() {
		return idNum;
	}
	
	// Sets the ID number of this event
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	// Returns the common name of this event
	public String getEventName() {
		return eventName;
	}
	
	// Sets the common name of this event
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	// Returns the time data for this event
	public double[] getTimes() {
		return times;
	}
	
	// Sets the time data for this event
	public void setTimes(double[] times) {
		this.times = times;
	}
	
	// Returns the date data for this event
	public int[] getDates() {
		return dates;
	}
	
	// Sets the date data for this event
	public void setDates(int[] dates) {
		this.dates = dates;
	}
	
	// Add a new time to the array of times and set the time data for this event
	public void addNewTime(double time) {
		double[] t = Arrays.copyOf(getTimes(), getTimes().length + 1);
		t[t.length - 1] = time;
		setTimes(t);
	}
	
	// Add a new date to the array of dates and set the date data for this event
	public void addNewDate(int date) {
		int[] d = Arrays.copyOf(getDates(), getDates().length + 1);
		d[d.length - 1] = date;
		setDates(d);
	}
	
}
