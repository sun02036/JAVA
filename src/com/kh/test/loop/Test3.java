package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {
	public static void main (String [] args) {
		Test3 study = new Test3();
		
		study.test3();
		
//		정수를 입력 받아 입력된 값의 구구단 프로그램을 만들어보세요.  
//	 	예) 5 입력 
//	      	5X1=5
//	      	5X2=10
//	      	5X3=15
//	         .
//	         .
//	      	5X9=45
//	   	단, 1~9까지만 가능하고 
//	   	이외에 값을 넣으면 "잘못입력하셨습니다. 프로그램 종료합니다." 출력
	   	
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 단수 입력(2 ~ 9) : ");
		int dan = sc.nextInt();
		
		// 유효성검사
//		if(!(dan >= 2 && dan <= 9)) {
		if(dan < 2 || dan > 9) {
			System.out.println("잘못 입력하셨습니다");
			return;
		}

		//구구단 출력
		for(int n = 1; n < 10; n++){
			System.out.printf("%d * %d = %d%n", dan, n, dan * n);
		}
	}


}
