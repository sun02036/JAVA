package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main (String [] args) {
		Test1 study = new Test1();
		
		study.hw1();
		study.hw2();
		study.hw3();
		
	}
	
		public void hw1() {
			Scanner sc = new Scanner (System.in);
			System.out.print("국어 점수를 입력하세요.: ");
			int kor = sc.nextInt();
			System.out.print("영어 점수를 입력하세요.: ");
			int eng = sc.nextInt();
			System.out.print("수학 점수를 입력하세요.: ");
			int math = sc.nextInt();
			
			int sum = (kor + eng + math);
			
			if(sum >= 250) {
				System.out.println("우수생입니다.");
			}
			System.out.println("----- test1 종료 -----");
		}
		
				
		public void hw2() {
			Scanner sc = new Scanner (System.in);
			System.out.println("A의 연봉을 입력하세요.: ");
			int num = sc.nextInt();
				
			if(num >= 5000) {
			System.out.println("A는 고액 연봉자입니다.");
			}
				
			System.out.println("B의 연봉을 입력하세요.: ");
			int num2 = sc.nextInt();
					
			if(num2 >= 5000) {
			System.out.println("B는 고액 연봉자입니다.");
			}

			System.out.println("C의 연봉을 입력하세요.: ");
			int num3 = sc.nextInt();
						
			if(num3 >= 5000) {
			System.out.println("C는 고액 연봉자입니다.");
			}
			System.out.println("----- test2 종료 -----");
		
			}
			
		public void hw3() {
			Scanner sc = new Scanner (System.in);
			System.out.printf("정수 입력: ");
			int num = sc.nextInt();
				
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
				}
			else {
				System.out.println("홀수입니다.");	
			}
			System.out.println("----- test3 종료 -----");
		}

}

		
		
	
	

