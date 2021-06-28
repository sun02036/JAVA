package com.kh.function.run;

import java.util.Scanner;

public class Example {
	
	Scanner sc = new Scanner(System.in);
	
	public void opSample1(){
		
		System.out.print("국어 점수를 입력하세요.: ");
		int one = sc.nextInt(); 
		System.out.print("영어 점수를 입력하세요.: ");
		int two = sc.nextInt();
		System.out.print("수학 점수를 입력하세요.: ");
		int three = sc.nextInt(); 
		
		int sum = (int)(one+two+three);
		double avg = (double)(sum/3);
		System.out.print("총점: " + sum +", " + "평균: " + avg);
		
		String str = ((one >= 40) && (two >= 40) && (three >= 40) && (avg >= 60) ? "합격" : "불합격"); 
		System.out.printf("합격 여부 > %s%n", str);
}	

	
	
	public void opSample2(){
		System.out.print("학생 이름은: ");
		String a = sc.next(); 
		
		System.out.print("학년: ");
		int b = sc.nextInt();
		
		System.out.print("반: ");
		int c = sc.nextInt(); 
		
		System.out.print("번: ");
		int d = sc.nextInt(); 
		
		System.out.print("성별을 입력하세요 (M|F): ");
		String ok = sc.next();
		char e = ok.charAt(0);
		char oo = 'M';
		String g = (e == oo) ? "남학생" : "여학생";
		
		System.out.print("성적: ");
		float f = sc.nextInt(); 
		
		System.out.printf("%d학년 %d반 %d번 %s %s는 성적이 %.2f이다.", b, c, d, g, a, f);
		
	}
	
	public void opSample3() {

			System.out.print("정수 입력: ");
			int input = sc.nextInt();
			String result = (input > 0) ? "양수다." : "양수가 아니다.";
			
			System.out.printf("입력한 값 [%d]는 %s%n", input, result);
		
	}
	
}

	
	
	

