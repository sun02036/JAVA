package kh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopStudy {

	public static void main ( String [] args ) {
		NestedLoopStudy study = new NestedLoopStudy ();
		//study.test1();
		//study.test2();
		//study.test3();
		//study.test4();
		//study.test5(); 
		//study.test6();
		study.test7();
}
//-------------------------------------------------------------------
	/**
	 * 중첩 반복문으로 행렬 표현
	 * - outer: 행
	 * - inner: 열
	 */
	
	public void test1 () {
		for (int i = 0; i < 10; i++) { // 행
			//System.out.println(i);
			
			for (int j = 0; j < 7; j++) { // 열
				System.out.print("(" + i + "," + j + ")");	
			}
			System.out.println(); // 개행 
		}
	}
	
//-------------------------------------------------------------------	
	
	/**
	 * ★★★★★
	 * ★★★★★
	 * ★★★★★
	 *  
	 */
	
	public void test2() {
		for (int i = 0; i < 3; i++) { // 행	
			for (int j = 0; j < 5; j++) { // 열
				System.out.print("★");	
			}
			System.out.println(); // 개행 
		}
	}
	
//-------------------------------------------------------------------	
	
	// 원하는 행, 열을 입력받아 출력하기
	
	public void test3() {
	Scanner sc = new Scanner (System.in);
	
	System.out.print("행: ");
	int num1 = sc.nextInt();
	
	System.out.print("열:  ");
	int num2 = sc.nextInt();
	
	for (int i = 0; i < num1; i++) { // 행
		
		for (int j = 0; j < num2; j++) { // 열
			System.out.print("★");	
		}
		System.out.println(); // 개행 
		}
	}
//-------------------------------------------------------------------	
	/**
	 * 2단 시작!
	 * 
	 * 2*1 = 2
	 * 2*2 = 4
	 * ......
	 * 3단 시작!
	 * 
	 * 3*1 = 3
	 * 3*2 = 6
	 * .....
	 */
	
	public void test4() {
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d단 시작!%n", i);
			System.out.println(" ");
			
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, (i * j));
			}
			
			System.out.println(" ");
		}
	}
//-------------------------------------------------------------------
	/**
	 * 반복문에 label 생성 후 
	 * break, continue를 label로 호출하기
	 * 
	 */
	
	public void test5() {
		/**
		 * 곱의 값이 50이 넘기 직전에 끝나라 
		 */
		
		//1. break
		
//		red: // label
//		for (int dan = 2; dan <= 9; dan++) {
//			for (int n = 1; n <= 9; n++) {
//				
//				if (dan * n > 50) 
//					break red; // red 반복문을 탈출해라 
//				System.out.printf("%d * %d = %d%n", dan, n, dan * n); 
//			}
//		}	
		
		/**
	 	2 * 1 = 2
		2 * 2 = 4
		3 * 1 = 3
		3 * 2 = 6
		3 * 3 = 9
		4 * 1 = 4
		4 * 2 = 8
		4 * 3 = 12
		4 * 4 = 16
		...
		
		 */
		
		//2. continue
		
		outer: 
		for(int dan = 2; dan <= 9; dan++) {
			
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d%n", dan, n, dan * n);
				
				if ( dan == n ) {
					System.out.println();
					continue outer; // continue는 인접한 반복문의 시작으로 간다.
			} // ** outer 이하의 반복문은 실행되지 않고, outer의 증감식으로 간다. **
			
			}
		}
	}
//-------------------------------------------------------------------	
	
	/**
	 * ◆ 0: 1번 반복
	 * ◆◆ 1: 2번 반복
	 * ◆◆◆ 2: 3번 반복
	 * ◆◆◆◆ 3: 4번 반복
	 * ◆◆◆◆◆ 4: 5번 반복
	 */
	
	public void test6() {
		
		// 1.
		outer:
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				System.out.printf("◆");
				
				if (i == j) {
					System.out.println();
					continue outer;
				}
			}
		}
		
		// 2.
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.printf("◆");
				
				if (i == j) {
					System.out.println();
				}
			}
		}
	}
	
//-------------------------------------------------------------------
	
	/**
	 * ❤❤❤
	 * ❤
	 * ❤❤❤
	 * ❤
	 * ❤❤❤
	 */
	
	public void test7 () {
		
		// 1.
		
		for(int i = 0; i < 5; i++) { // 5행  
			
			if(i % 2 == 0) { //만약에 짝수라면 
				
				for(int j = 0; j < 3; j++) { // 3열 
					System.out.print("❤");
				}
				
				System.out.println();
			}	
			
			else System.out.println("❤"); //한번 찍어라 
		}
		
		//2. 
		
		for (int i = 0; i < 5; i++) { // 5행 
			
			for (int j = 0; j < 3; j++) { // 3열
				System.out.print("❤");
				
				if (i % 2 !=0) // i가 홀수면 3번, 짝수면 1번 
					break; // 그만 
			}
			System.out.println();
		}
				}
			
		
	}

