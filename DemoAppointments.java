import java.util.ArrayList;
import java.util.Scanner;

public class DemoAppointments {	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/* Array list of Appointments
		 * in the format of java LocalDate YYYY/MM/DD 
		*/
		ArrayList<Appointment> list = new ArrayList<Appointment>();
		list.add(new OneTime (2020, 2, 1, "See Dentist"));
		list.add(new OneTime (2020, 2, 6, "Teeth Cleaning"));
		list.add(new Daily   (2020, 2, 2, "Go to Work"));
		list.add(new Monthly (2020, 3, 1, "Pay Rent"));
		list.add(new OneTime (2020, 4, 1, "Filed Taxes"));
		list.add(new OneTime (2020, 7, 1, "File for FAFSA"));
		list.add(new OneTime (2020, 8, 1, "Register for Fall Classes"));
		list.add(new Monthly (2020, 2, 1, "Get a Hair Cut"));
		list.add(new Daily 	 (2020, 2, 8, "Feed Dog"));
				
		// Menu for user
		System.out.println("Please select an option\n" +
							"-----------------------\n" +
							"1: Display Appointments.\n" + 
							"2: Check Appointments that occur on this date.\n");
							
		
		// User selection for case
		int num = input.nextInt();
		
		switch(num) {
			case 1: 
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				break;
				
			case 2:			
				System.out.print("Please input Year in YYYY format: ");
				int year = input.nextInt();
				
				System.out.print("Please input Month in MM format: ");
				int month = input.nextInt();
				
				System.out.print("Please input Day in DD format: ");
				int day = input.nextInt();
				
				for(int i = 0; i < list.size(); i++) {					
					if(list.get(i).occursOn(year, month, day)) {
						System.out.println(list.get(i));
					}					
				}	
				break;
		}
		// Closes Scanner object
		input.close();
	}
}
