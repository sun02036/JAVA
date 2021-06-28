package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {
	public static void main ( String [] args ) {
		Test3 study = new Test3 ();
		//study.test();
		study.test2();
	}
	/*
	 * 	정수하나 입력받아, 
	    그 수가 양수일때만 입력된 
	    수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
	    프로그램을 만들어보자.
		출력 예)
	    정수 입력 : 5
	     *
	     **
	     ***
	     ****
	     *****
	      ****
	       ***
	        **
	         *
	 */
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요: "); 
		int num = sc.nextInt();
		
		if (num <= 0) {
			System.out.println("양수가 아닙니다."); 
		}
		outer1:
		for (int i = 1; i < num; i++) {
			
			for (int j = 1; j < num; j++) {
				System.out.print("*");
				
			 if (i == j) {
					System.out.println();
					continue outer1;
				}
			}
				
		}
		outer:
		for (int i = 1; i <= num; i++) {
			
			for (int j = num; j <= num; j--) {
				System.out.print("*");
				
			 if (i == j) {
				 System.out.println();
					continue outer;
				}
			}
				
		}
	}
	
//------------------------------------------------------—		
	
	// 강사님 풀이 
	
	public void test2() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 하나 입력하세요 ==> ");
		int num = sc.nextInt(); // 열의 값 
		
		if(num<1) {
			System.out.println("양의 정수가 아닙니다.");
			return;
		}
		
		for (int i = 0; i < num*2-1; i++) { // 5개를 입력하면 9행이 나와야 하더라
			if (i < num) { // 만약 num보다 i가 작다면 
				//i 가 0이면 j는 1번 
				for (int j = 0; j <= i; j++) {
				 	System.out.print("*"); // 행의 값 
				}
			}
			else { // num보다 i가 크다면 
				for (int j = 0; j < num; j++) {
					if (j <= (i - num)) // i-num=1
						System.out.print(" ");
					else 
						System.out.print("*");
				}
				
				// else문 밑으로도 가능 
				
//				else {
//					int blank = i - (num - 1); // 공백수
//					for(int j = 0; j < num; j++) {
//						if(j < blank)
//							System.out.print(" ");
//						else 
//							System.out.print("*");
//					}
			}
			System.out.println();
		}
	}
}

	
	
