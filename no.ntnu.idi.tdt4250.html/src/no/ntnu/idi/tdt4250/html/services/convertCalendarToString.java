package no.ntnu.idi.tdt4250.html.services;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class convertCalendarToString {
	
	
	public String convertCalendarToString(Calendar calendar) {
		
		try {
			SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
			return dateTimeFormat.format(calendar.getTime());
		} catch (Exception e) {
			return "";
		}
		
	}
}