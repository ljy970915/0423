package com.ljy.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.ljy.entity.Person;
import com.ljy.util.DateUtil;
import com.ljy.util.RandomUtil;
import com.ljy.util.StringUtil;

public class PersonTest {
	public static void main(String[] args) {
		 
		
		for (int i = 0; i < 10000; i++) {
			
			Person p = new Person();
			
			p.setName(StringUtil.generateChineseName());
			
			p.setAge(RandomUtil.random(1, 120));
			
			p.setAbout(StringUtil.randomChineseString(140));
			
			Calendar c = Calendar.getInstance();
			c.set(2010, 0,1);
			Date date = DateUtil.random(c.getTime(), new Date());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String format = sdf.format(date);
			

		p.setCreated(format);
			System.out.println(i+"         "+p);
		}
	}
}
