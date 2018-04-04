package digitalFrontDoor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test123 {
	static String d;

	@Test
	public static void addDays() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date();
		cal.setTime(date);
		cal.add(Calendar.DATE, 10);
		d = dateFormat.format(cal.getTime());			
		Reporter.log(d.toString(),true);
	}
}
