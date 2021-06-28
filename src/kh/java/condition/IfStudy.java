package kh.java.condition;

import java.util.Scanner;

/**
 * 1. if(){}
 * 2. if(){} else{}
 * 3. if(){} elseif(){}...
 * 4. 중첩if문
 */

public class IfStudy {

	public static void main (String [] args) {
		IfStudy study = new IfStudy();
		//study.test1();
		//study.test2();
		//study.test3();
		//study.test4();
		//study.test5();
		//study.test6();
		study.test7();
	}
	
/**
 * 1. if(조건식){}
 * boolean값 또는 boolean값으로 처리되는 연산이 오면 됨  
 */
	
	public void test1() {
		int a = 3;
		if(a > 0) {
			System.out.println("hello world~");
		}
		System.out.println("----- test1 종료 -----");
	}
	
// @ 실습문제: 정수를 입력 받고, 짝수일때만 hello world 나오기 
	
	public void test2() {
		Scanner sc = new Scanner (System.in);
		System.out.printf("정수를 입력하세요: ");
		int num1 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("hello world~");
		}
	}
/**
 * 2. if(조건식){} else{} - else는 필요에 따라 결정 
 * 
 * 조건식을 만족하면 if 블럭이 
 * 조건식을 만족하지 않으면 else 블럭이 실행
 * if 구문을 사용하면 둘 중 하나는 무조건 실행됨 
 */
	public void test3() {
		Scanner sc = new Scanner (System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");	
		}
		System.out.println("----- test3 종료 -----");
	}
	
	// @실습문제: 사용자로부터 나이를 입력받고, 
	//         20세 이상인 경우는 성인인증되었습니다.
	//         20세 이하인 경우는 미성년자입니다. 뜨게 하기 
	
	public void test4 () {
		Scanner sc = new Scanner (System.in);
		System.out.println("나이를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num >= 20) {
			System.out.println("성인인증 되었습니다.");
		}
		else {
			System.out.println("미성년자입니다.");	
		}
		System.out.println("----- test4 종료 -----");
	}
/**
 * 3. if(조건식){} else if(조건식2) else if(조건식 3)...
 * 
 * 90~100: A, 80~89: B, 70~79: C, 60~69: D, 나머지: F
 * 
 */
	public void test5 () {
		Scanner sc = new Scanner (System.in);
		System.out.println("당신의 코딩 점수를 입력하세요.(0~100): ");
		int num = sc.nextInt();
		char grade = ' ';
		
		if(num >= 90) {
			grade = 'A';
		}
		else if (num >= 80) {
				grade = 'B';
		}
		else if(num >= 70) {
					grade = 'C';
		}
		else if(num >= 60) {
						grade = 'D';
		}
		else {
			grade = 'F';
		}	
		System.out.printf("점수: [%d]점, 학점: [%c]%n", num, grade);
			}


	public void test6() {
		Scanner sc = new Scanner (System.in);
		System.out.println("당신의 코딩 점수를 입력하세요.(0~100): ");
		int num = sc.nextInt();
		char grade = 'F';
		
		if(num >= 90) {
			grade = 'A';
		}
		
		else if (num >= 80) {
			grade = 'B';
		}
		
		else if(num >= 70) {
			grade = 'C';
		}
		
		else if(num >= 60) {
			grade = 'D';
		}
		
			
		System.out.printf("점수: [%d]점, 학점: [%c]%n", num, grade);
			
	}
	
	/**
	 * 점수를 입력받고, 학점을 부여
	 * 95~100: A+, 90~94: A 
	 * 85~89: B+, 80~84: B
	 * 75~59: C+, 70~74: C
	 * 65~69: D+, 60~64: D
	 * ~59: F
	 */
	
	public void test7 () {
		Scanner sc = new Scanner (System.in);
		System.out.println("당신의 코딩 점수를 입력하세요.(0~100): ");
		int num = sc.nextInt();
		String grade = "";
				
		if(num >= 90) {
			grade = "A";
			if(num >= 95) {
				grade += "+";
			}
		}
		else if (num >= 80) {
			grade = "B";
			if(num >= 85) {
				grade += "+";
			}
		}
		else if (num >= 70) {
			grade = "C";
			if(num >= 75) {
				grade += "+";
			}
		}
		else if (num >= 60) {
			grade = "D";
			if(num >= 65) {
				grade += "+";
			}
		}
		else {
			grade = "F";
		}
					
		System.out.printf("점수: [%d]점, 학점: [%s]%n", num, grade);
					
	}
		
		
}
		
		
	

