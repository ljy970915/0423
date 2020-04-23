package com.ljy.util;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DateUtilTest {

	@Test
	void test() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 9,1);
		
		Date date = DateUtil.random(c.getTime(), new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		
		System.out.println(format);
	}

}
