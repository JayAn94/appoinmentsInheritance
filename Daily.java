

/*
 * Class to set a Daily Appointment
 */
public class Daily extends Appointment  {
	
	private boolean daily = false;
	
	// Constructor
	public Daily(int year, int month, int day, String description) {
		
		super(year, month, day, description);
		daily = true;
	}
	
	// Override to return daily as true, so any appointment that is set to Daily object will always print out
	 public boolean occursOn(int year, int month, int day) {
		 
	        return daily;
	 }
}
