package Model2iCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarToStringICal {
	
	
	public String convertCalToString(Calendar calendar) {
		
		try {
			SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
			return dateTimeFormat.format(calendar.getTime());
		} catch (Exception e) {
			return "";
		}
		
	}

}