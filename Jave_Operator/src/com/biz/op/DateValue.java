package com.biz.op;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 날짜와 관련된 JDK 이슈
		// JAVA 1.7 이하 호환
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getDate()); 
		System.out.println(date.getTime());
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat timeForm = new SimpleDateFormat("hh:mm:ss");
		
		String nowDate = dateForm.format(date);
		String nowTime = timeForm.format(date);
		
		System.out.println("오늘날짜 : " + nowDate);
		System.out.println("현재시각 : " + nowTime);
		
		nowDate = dateForm.format(cal.getTime());
		nowTime = timeForm.format(cal.getTime());
				
	}

}
