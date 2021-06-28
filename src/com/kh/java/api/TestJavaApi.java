package com.kh.java.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TestJavaApi {

	public static void main(String[] args) {
		TestJavaApi t = new TestJavaApi();
//		t.test();
//		t.test2();
//		t.test3();
		t.test4();
	}
	
	/**
	 * java.time.LocalDate
	 */
	public void test4() {
		LocalDate now = LocalDate.now(); // 현재날짜정보를 가진 객체 생성
		System.out.print(now.getYear());
		System.out.print("/");
		System.out.print(now.getMonthValue()); // 1 ~ 12
		System.out.print("/");
		System.out.println(now.getDayOfMonth());
	}
	
	/**
	 * java.util.Calendar
	 */
	public void test3() {
		Calendar cal = Calendar.getInstance(); // 현재시각정보를 가진 객체 생성
		System.out.println(cal.get(Calendar.YEAR)); // 년도
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DATE));
	}
	
	
	/**
	 * SimpleDateFormat
	 */
	public void test2() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str = sdf.format(now);
		System.out.println(str);
	}
	

	/**
	 * 2020/8/14
	 * 
	 * java.util.Date
	 * Deprecated
	 * 
	 */
	@SuppressWarnings("deprecation") // 부가기능 제공 annotation
	private void test() {
		// java.util.Date
		Date d = new Date(); // 현재시각정보를 가진 객체 생성
		System.out.println(d);
		System.out.println(d.toString()); // 객체를 콘솔출력하거나 문자열로써 사용할때 자동적으로 toString() 호출 
		
		System.out.println(d.getYear());
		System.out.println(
				(d.getYear() + 1900) + "/" + 
				(d.getMonth() + 1) + "/" + 
				d.getDate()
			);
	}

}

