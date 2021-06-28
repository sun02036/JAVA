package com.kh.test.condition;

import java.util.Scanner;

public class Test4 {
	
	public static void main (String [] args) {
	Test4 study = new Test4();
	
	study.test();
	
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 한개를 입력하세요: ");
		
		int userInput = sc.nextInt();
		
		if (10 < userInput || 1 > userInput) {
	     System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
		}
		
		else if((userInput % 2) == 0) {
			System.out.println("짝수입니다.");
		}
		
		else if ((userInput % 2) > 0) {
			System.out.println("홀수입니다.");
		}
		
	}
}
