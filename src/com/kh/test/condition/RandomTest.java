package com.kh.test.condition;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	
	public static void main (String [] args) {
	RandomTest study = new RandomTest();
	
	study.rockPaperScissors();
	
	}
	
	public void rockPaperScissors() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 선택하세요. (1. 가위 | 2. 바위 | 3. 보): ");
		int userInput = sc.nextInt();
		
		Random rnd = new Random ();
		int num = (int)(rnd.nextInt(3)+1);
	
		String grade1 = "";
		String grade2 = "";
		
		if(userInput == 1) {
			grade1 = "가위";
		}	
		else if(userInput == 2) {
			grade1 = "바위";
		}
		else if(userInput == 3) {
			grade1 = "보";
		}
		
		if(num == 1) {
			grade2 = "가위";
		}
		else if(num == 2) {
			grade2 = "바위";
		}
		else if(num == 3) {
			grade2 = "보";
		}
		
		System.out.println("********* 결과 *********");
		System.out.printf("당신은 %s를 냈습니다.%n컴퓨터는 %s를 냈습니다.%n", grade1, grade2);
		System.out.println("***********************");
		
		if(userInput == num) {
			System.out.println("비겼습니다.");
		}
		else if ((userInput == 1) && (num == 2)) {
			System.out.println("패배했습니다.");
		}
		else if ((userInput == 1) && (num == 3)) {
			System.out.println("승리했습니다.");
		}
		else if ((userInput == 2) && (num == 1)) {
			System.out.println("승리했습니다.");
		}
		else if ((userInput == 2) && (num == 3)) {
			System.out.println("패배했습니다.");
		}
		else if ((userInput == 3) && (num == 2)) {
			System.out.println("승리했습니다.");
		}
		else if ((userInput == 3) && (num == 1)) {
			System.out.println("패배했습니다.");
		}
		else {
			System.out.println("숫자를 잘못 입력했습니다. 종료합니다.");
		}
	}

}
		