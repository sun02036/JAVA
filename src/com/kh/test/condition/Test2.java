package com.kh.test.condition;

import java.util.Scanner;

public class Test2 {
	
	public static void main (String [] args) {
	Test2 study = new Test2();
	
	study.test();
	
	}
	public void test() {
		Scanner sc = new Scanner (System.in);
		System.out.print("국어 점수를 입력하세요.: ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요.: ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요.: ");
		int math = sc.nextInt();
	
		int avg = ((kor + eng + math) / 3);
		
		if(kor>=40 && eng>=40 && math>= 40 && avg>=60) {
			
			System.out.println("합격입니다.");
		}
		
		else {
			System.out.println("불합격입니다.");	
		}
	}
}