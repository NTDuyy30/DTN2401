package com.vti.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateUtils {

	public static String getddMMyyyyHHmmss(Timestamp ts) {
		if (ts == null) {
			return "";
		}

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return simpleDateFormat.format(ts);
	}

}
