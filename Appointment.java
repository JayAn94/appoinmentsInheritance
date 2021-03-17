import java.time.LocalDate;

public class Appointment {

	private String description = null;
	private LocalDate date;
	

	// Constructor
	Appointment(int year, int month, int day, String description) {
		date = LocalDate.of(year, month, day);
		this.description = description;
	}
	
	// Returns the Month
    public  int getMonth() {
        return date.getMonthValue();
    }
    
    // Returns the Day
    public int getDay() {
        return date.getDayOfMonth();
    }
    
    // Returns the Year
    public int getYear()
    {
        return date.getYear();
    }

	// Override toString
	public String toString() {
		return ("Appointment on : " + date + " " + this.description);
	}
	
	// Checks if the Appointment date occurs on the entered date
	public boolean occursOn(int year, int month, int day) {
		
		return this.getMonth() == month && this.getDay() == day && this.getYear() == year;
	}
	
	
}

