

/*
 * Class to set a Monthly Appointment
 */
public class Monthly extends Appointment  {
	
	// Constructor 
	public Monthly(int year, int month, int day, String description) {
		
		super(year, month, day, description);
	}

	 public boolean occursOn(int year, int month, int day) {
		 
	        return super.getDay() == day;
	 }
}
