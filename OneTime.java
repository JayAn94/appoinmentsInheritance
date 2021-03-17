

/*
 * Class to set a One Time Appointment
 */
public class OneTime extends Appointment  {

	// Constructor
	public OneTime(int year, int month, int day, String description)  {
		
		super(year, month, day, description);		
	}
	
	public boolean occursOn(int year, int month, int day) {
		
		return super.occursOn(year, month, day);
	}
}
