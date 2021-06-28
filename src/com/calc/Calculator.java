package com.calc;

import java.util.Scanner;

public class Calculator {
	
	/* main의 argument로 
	 * 1자리 정수형(1부터 9까지만) 값을 2개 입력받아 
	 * 4칙 연산 결과를 출력한다. 
	 * 입력값은 모두 int 형으로 처리한다.
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1~9까지의 수를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.println("1~9까지의 수를 입력하세요: ");
		int num2 = sc.nextInt();
		
		 if (num1 < 1 || num1 > 9 || num2 < 1 || num2 > 9) {
			System.out.println("1~9 사이의 수만 입력해주세요."); 
		}
		 
		else if (num2 > 1 || num2 < 9) {
	
		int sum = num1 + num2;
		int min = num1 - num2;
		int mul = num1 * num2;
		int avg = num1 / num2;
		
		System.out.printf("합: %d%n", sum);
		System.out.printf("차: %d%n", min);
		System.out.printf("곱: %d%n", mul);
		System.out.printf("나누기: %d%n", avg);
			}
		 
		if (num2 <= 0) {
			
		int sum = num1 + num2;
		int min = num1 - num2;
		int mul = num1 * num2;	
		int avg = 0;
		System.out.printf("합: %d%n", sum);
		System.out.printf("차: %d%n", min);
		System.out.printf("곱: %d%n", mul);
		System.out.printf("나누기: %d%n", avg);
		}
		
	}
}


