package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 study = new Test3();
		study.test();

	}

	public void test() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요. > ");
		int num1 = sc.nextInt();
		
		System.out.println("정수를 입력하세요. > ");
		int num2 = sc.nextInt();
		
		System.out.println("연산자(+,-,*,/)를 입력하세요. > ");

		char cal = sc.next().charAt(0);

		long sum = (num1 + num2);
		long minus = (num1 - num2);
		long div = (num1 / num2);
		long mul = (num1 * num2);
		
		if (cal == '+') {
			System.out.printf("%d + %d = %d", num1, num2, sum);
		}
		else if (cal == '-') {
			System.out.printf("%d - %d = %d", num1, num2, minus);
		}
		else if (cal == '/') {
			System.out.printf("%d / %d = %d", num1, num2, div);
		}
		else if (cal == '*') {
			System.out.printf("%d * %d = %d", num1, num2, mul);
		}
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	
	}
	
}