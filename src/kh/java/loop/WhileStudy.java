package kh.java.loop;

/**
 * 
 * 초기식;
 * while(조건식) {
 * 		// 실행구문 
 * 		증감식; (증감식의 위치는 자유롭다)
 * }
 * 
 * 초기식;
 * 조건식 결과가 true라면, 실행구문 실행 - 증감식 실행 - 처음으로 돌아가서 조건식 결과가 true라면...
 * 조건식 결과가 false라면, 반복문 중단 
 */

import java.util.Scanner;
import com.kh.test.condition.RandomTest;

public class WhileStudy {

	public static void main (String [] args) {
		WhileStudy study = new WhileStudy();
		//study.test1();
		//study.test2();
		//study.test3();
		//study.test4();
		//study.test5();
		study.test6();
		
		System.out.println("===== 메인 메소드 종료 =====");
	}
	
	public void test1() {
//			int i = 0;
//			while (i < 10) {
//
//			System.out.println(i + 1);
//			i++;
//		}
//		
//		// 100~1 출력
//		int i = 100;
//		while (i > 0) {
//			System.out.println(i);
//		i--;
//		}
		
		// 1 ~ 20 사이 홀수
		int j = 1 ;
		while (j <= 20) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
		j++;
		}
		
		// 20 ~ 1 사이 짝수
		int k = 20 ;
		while (k > 0) {
			if (k % 2 == 0) {
				System.out.println(k);
			}
		k--;
		}
	}
	
	public void test2() {
		
		/** 
		 * 1. 사용자가 원하는 단수의 구구단 출력
		 * 2. 1부터 사용자 입력 정수까지의 합
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자가 원하는 단수의 구구단 출력
		System.out.print("구구단 단수 입력(2 ~ 9) : ");

		int dan = sc.nextInt();
		
		int n = 1;
		while (n < 10){
			
		System.out.printf("%d * %d = %d%n", dan, n, dan * n);
		n++;
	}
		// 2. 1부터 사용자 입력 정수까지의 합
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		int a = 1;
		int sum = 0;
		
		while (a <= num) {
		sum += a;
		a++;
		}
		System.out.printf("1부터 %d의 합은 %d입니다.", num, sum);		
	} 
	
	/**
	 * while 응용
	 */
	
	// 이렇게 해도 1~10 나옴 
	public void test3() {
		int i= 0;
		while (i++ < 10) {
			System.out.println(i);
		}
		System.out.println("반복문 종료: i = " + i);
	}
	
	/**
	 * 초기식, 조건식, 증감식, 반복구문
	 * for: 초기식 - 조건식 - 반복구문- 증감식 - 조건식 - 반복구문 - 증감식...
	 * 
	 * 초기식, 조건식, 반복구문(증감식)
	 * while: 초기식 - 조건식 - 반복구문(증감식) - 조건식 - 반복구문...
	 * 
	 * 메뉴제공
	 */
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		while (true) { // 일단 실행하는 의미로 true 만든 것, false 입력하면 안나옴 
			System.out.println("===== 메뉴 =====");
			
			System.out.println("더 주문하시겠습니까? (y/n): ");
			char yn = sc.next().charAt(0);
			if(yn == 'n') break;
		}
		System.out.println("종료!");
		
	}
	
	/**
	 * do ~ while
	 * 조건식 - 반복구문실행 순서를 뒤집어서 반복구문 실행 먼저하고 조건식을 실행하는 것
	 * 실제로 메뉴 선택 등에서 많이 사용됨 
	 * 무조건 한 번은 실행되는 반복문 
	 */
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		char yn = ' ';
	
	do {
		// 반복실행구문
		System.out.println("===== 메뉴 =====");
		
		System.out.println("더 주문하시겠습니까? (y/n): ");
		yn = sc.next().charAt(0);
		
		} while (yn == 'y'); // y라면 다시 실행하자 라는 의미
	// do 블럭의 바깥이므로, do 블럭 안의 변수는 사용 불가 
		System.out.println("종료");
	}
	
/**
 * do-while을 이용하여 구구단 출력	
 */
	
	public void test6() {
		// 변수 선언부
		Scanner sc = new Scanner(System.in);
		char yn = 'y';
		String menu = "===== 오늘의 메뉴 =====\n"
					 + "1. 가위바위보\n"
					 + "2. 구구단\n"
					 + "====================\n"
					 + "선택: ";
					 
	// 반복 실행
	do {
		
		// 반복 실행 구문
		System.out.print(menu);
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 : 
			RandomTest test = new RandomTest();
			test.rockPaperScissors();
//			new RandomTest().rockPaperScissors(); 
		break;
		
		case 2 : gugudan(); break;
		
		default : System.out.println("잘못 입력하셨습니다.");
				  continue; // 반복문의 continue 하위 코드는 실행하지 않고, 반복문의 조건식으로 돌아감 
		}
		
		
		// 계속 사용 여부 
		System.out.println("더 하시겠습니까? (y/n): ");
		yn = sc.next().charAt(0);
		
		} while (yn == 'y');

		System.out.println("종료");
	}
	
	public void gugudan () {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("구구단 단수 입력(2 ~ 9) : ");
		int dan = sc.nextInt();
		int n = 1;
		while (n < 10){
		System.out.printf("%d * %d = %d%n", dan, n, dan * n);
		n++;
		}
	}
	

}
