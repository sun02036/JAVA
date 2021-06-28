package kh.java.loop;

import java.util.Scanner;

public class ForStudy {

	public static void main (String [] args) {
		ForStudy study = new ForStudy();
		//study.test1();
		//study.test2();
		//study.test3();
		//study.test4();
		study.test5();
		
	}
	
	/**
	 * for(초기식; 조건식; 증감식) {
	 * 		//  반복실행구문
	 * 	} 
	 * 
	 * 초기식: 증감변수를 선언 (최초 한번만 실행된다)
	 * 조건식: true이면 for block 실행, false면 즉시 반복문 중지 (탈출)
	 * 증감식: 증감변수의 증감이 일어나는 곳 
	 * 반복실행구문
	 * 
	 * 초기식 - (조건식 - true라면 블럭 실행 - 실행이 끝나면 증감식) - (조건식 - 블럭실행 - 증감식)...
	 *
	 * 반복문 만들 때는
	 * 1. 몇 번 실행되는지
	 * 2. 증감변수의 추이 (증감변수가 몇이 되는건지?)
	 * 를 생각해라 
	 *
	 */
	
//	public void test1 () {
//		for ( int i = 0; i < 3; i++) {
//		System.out.println("Hello World " + i);	
//		} //for
		
		// @ 숫자를 1~100 출력: 반복횟수 100, 증감변수가 1~99
//		for ( int i = 0; i < 100; i++) {
//		System.out.println(i + 1);	
		
		// @ 숫자를 1~100 출력: 반복횟수 100, 증감변수가 1~100
//		for ( int i = 0; i < 100; i++) {
//		System.out.println(i);
//		}
		
//		// @ 10~1 출력
//		for ( int i = 10; i > 0; i--) {
//		System.out.println(i);
//		}
		//@ 11 12 13 14 15 16 17 18 19 20
//		for ( int i = 11; i <= 20; i++) {
//		System.out.print(i + " ");
//		}
		
//		// @ 1 3 5 7 9 
//		for ( int i = 1; i < 10; i +=2) {
//		System.out.print(i + " ");
//		}
		
//		// @ 20부터 2까지 짝수 출력  
//		for ( int i = 20; i > 0; i -=2) {
//		System.out.print(i + " ");
//		}
		
//		// @ 구구단 8단 출력
//		for(int i = 1; i < 10; i++) {
//			System.out.printf("8 * %d = %d%n", i, 8*i);
//		}
		
	/**
	 * 구구단 한단 출력
	 * 사용자로부터 2~9 사이의 정수를 입력받고, 해당 단수의 구구단 출력
	 * 2~9 사이의 정수가 아니라면, 잘못 입력하셨습니다. 나오고 프로그램 종료하기 
	 */
		
	public void test2() {
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

			
	/** 
	 * 1~10까지 누적합 구하기
	 * 
	 */
			
		public void test3() {
		
			int sum = 0; // for문 시작 전에 변수 선언 
			
			for (int i = 0; i < 10; i++) {
			sum += i;
			System.out.printf("sum = %d, i = %d%n", sum, i);		
		}
			
		System.out.printf("1부터 10의 합은 [%d]입니다.", sum);				
	} 
		
	/**
	 * @실습문제: 작은수, 큰수를 입력받고 그 사이의 모든 홀수를 출력하세요.
	 * 
	 * small = 2, big = 10이라면, 3 5 7 9 출력
	 */
		public void test4() {
			Scanner sc = new Scanner(System.in);
			System.out.print("작은 수를 입력하세요. : ");
			int small = sc.nextInt();
			System.out.print("큰 수를 입력하세요. : ");
			int big = sc.nextInt();
			
			for (int i = small; i < big; i++) {
				if(i % 2 !=0) {
					System.out.println(i);
				}
			}				 
		}
	/**
	 * 반복문의 반복 횟수를 실행 시간에 지정 가능
	 * 1. 사용자가 반복 횟수를 지정
	 * 2. 무한 반복하고, 반복문 중단을 사용자가 결정		 
	 */ 
		
		public void test5() {
		Scanner sc = new Scanner(System.in);
			
			
			// 1. 사용자가 반복 횟수를 지정
//			System.out.println("반복 횟수를 입력하세요: ");
//			int limit = sc.nextInt();
//			for(int i = 0; i < limit; i++) {
//				System.out.println("Hello World~!");
//		}	
			
			
			// 2. 무한 반복하고, 반복문 중단을 사용자가 결정		
		String menu = "===== 메뉴 =====\n"
					+ "1. 떡볶이\n"
					+ "2. 순대\n"
					+ "===============\n"
					+ "선택: ";
		
		for(;true;) {
			System.out.print(menu);
			int menuSelect = sc.nextInt();
			System.out.println(menuSelect + "를 선택하셨습니다.");
			// 종료 조건을 만들어줌
			
			System.out.print("계속 하시겠습니까? (y|n): ");
			char yn = sc.next().charAt(0);
			if(yn == 'n')
				break; // 현재 블럭을 멈춤 
			}	
		System.out.println("메뉴 선택 종료!");
		}
		
	}
