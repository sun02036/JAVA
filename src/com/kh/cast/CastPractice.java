package com.kh.cast;

import java.util.Scanner;

public class CastPractice {

	public static void main(String[] args) {
		CastPractice practice = new CastPractice();
		practice.printUnicode();
		practice.calculateScore();
	}
	

	public void printUnicode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 => ");
		char ch = sc.next().charAt(0);//한
		System.out.println(ch+" is unicode "+(int)ch);//54620
//		System.out.println('\ud55c');//한
	}
	
	public void calculateScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요 => ");
		double kor = sc.nextDouble();
		System.out.print("영어점수를 입력하세요 => ");
		double eng = sc.nextDouble();
		System.out.print("수학점수를 입력하세요 => ");
		double math = sc.nextDouble();
		
		int sum = (int)(kor+eng+math);
		int avg = sum/3;
		
		System.out.println("총점 : "+sum);
		System.out.println("평점 : "+avg);
		
	}
}
