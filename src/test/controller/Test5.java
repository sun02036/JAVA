package test.controller;

import java.util.Scanner;

public class Test5 {
	
	/* 키보드로 2개의 정수형 데이터를 입력 받아, 
	 * 두 수가 모두 1부터 9까지의 수일 때만 
	 * 두 수의 곱이 한자리 수인지 두자리 수인지를 출력한다.
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		
		
		if(num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
			
			int multi = num1 * num2;
			
			int length = (int)(Math.log10(multi)+1);
			
			if (length == 1) {
			System.out.printf("한자리 수 입니다.", multi);
			}
			if (length == 2) {
				System.out.printf("두자리 수 입니다.", multi);
				}
		}
		
		else {
			System.out.println("1~9 사이의 숫자를 입력해주세요.");
		}
	}

}
		
		
		
		

		 
