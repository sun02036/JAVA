package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {
	
	public static void main (String [] args) {
	Test5 study = new Test5();
	
	study.test();
	
	}
	
	public void test() {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("키를 입력하세요: ");
		int h = sc.nextInt();
		
		System.out.print("몸무게를 입력하세요: ");
		int w = sc.nextInt();
		
		double bmi =  w / ((h/100.0)*(h/100.0));
		
		String result = "저체중";
		
		if(bmi >= 30) {
			result = "고도비만";
		}
		
		else if(bmi >= 25) {
			result = "비만";
		}
		
		else if(bmi >= 23) {
			result = "과제중";
		}
		
		else if(bmi >= 18.5) {
			result = "정상";
		}
		else {
			
		}
		
		System.out.printf("귀하의 BMI는 %.2f이고, %s입니다.", bmi, result);
			
	}
	
	}