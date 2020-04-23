package com.ljy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String random(Date min,Date max ) {
		long t1= min.getTime();
		long t2= max.getTime();
		long t=(long)	Math.random()*(t2-t1)+t1;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(new Date(t));
		return format;
	}
}
