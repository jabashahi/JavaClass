package day32.exceptiondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo7 {

	public static void main(String[] args) {
		fromDateToString(new Date());
		System.out.println("===============");
		String date = "2011-01-11";
		try {
			fromStringToDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void fromDateToString(Date now) {
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a MM/dd/yy");
		String currentDate = sdf.format(now);
		System.out.println(currentDate);
	}

	public static void fromStringToDate(String now) throws ParseException {
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date currentDate = sdf.parse(now);
		System.out.println(currentDate);
	}
}
