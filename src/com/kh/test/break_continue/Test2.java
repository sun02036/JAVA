package com.kh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 study = new Test2();
		study.test();
		
//		1~100 사이의 임의의 난수를 발생시키고, 
//		   정수 한 개를 입력 받아, 
//		   난수가 입력 받은 정수보다 작으면 "입력하신 정수보다 작습니다." 출력, 
//		   난수가 입력 받은 정수보다 크면 "입력하신 정수보다 큽니다." 출력하세요.
//		   단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복되도록 하고, 
//		   정답인 경우 "정답입니다. 5회 만에 정답을 맞추셨습니다."와 같이 
//		   몇 회 만에 정답을 맞추었는지 출력하도록 작성하세요.
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
//		   1~100 사이의 임의의 난수를 발생시키고, 
		Random rnd = new Random ();
		final int computer = (int)(rnd.nextInt(100) + 1);
		int count = 0;
		char re = 'r';
		
//		   정수 한 개를 입력 받아, 
		
		do {		
			System.out.print("정수 한개를 입력해주세요: ");
			int userInput = sc.nextInt();
			
			System.out.println("컴퓨터: " + computer);
			System.out.println("나: " + userInput);
			
			count++;
			
			// 난수가 입력 받은 정수보다 작으면 "입력하신 정수보다 작습니다." 출력, 
			if (computer < userInput) {
			System.out.print("입력하신 정수보다 작습니다."); 
			}
			// 난수가 입력 받은 정수보다 크면 "입력하신 정수보다 큽니다." 출력하세요.
			else if (computer > userInput) {
			// 단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복되도록 하고,
			System.out.print("입력하신 정수보다 큽니다."); continue;
			}
			else if (computer == userInput) {
			// 정답인 경우 "정답입니다. 5회 만에 정답을 맞추셨습니다."와 같이 
			// 몇 회 만에 정답을 맞추었는지 출력하도록 작성하세요.
			System.out.printf("정답입니다. %d번 만에 정답을 맞추셨습니다.", count);
			} break;
			
				}
			 while (re == 'r');
		} 

	}