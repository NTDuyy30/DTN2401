package com.vti.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateUtils {

	public static String getDDMMYYYYHHMISS(Timestamp ts) {
		if (ts == null) {
			return "";
		}

		String pattern = "dd-MM-yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(ts);
	}

}
