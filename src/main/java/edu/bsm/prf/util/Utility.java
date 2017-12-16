package edu.bsm.prf.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {
	
	public static Date getCurrentDate() {
		Date date = new Date();
		return date;
	}

	public static String getCurrentTime() {
		Date date = new Date();
		String strTimeFormat = "HH:mm:ss a";
		SimpleDateFormat sdf = new SimpleDateFormat(strTimeFormat);
		String time = sdf.format(date);
		return time;
	}

}
