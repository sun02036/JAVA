package kh.java.loop;

import java.util.Scanner;

public class BreakContinueStudy {
public static void main (String [] args) {
	BreakContinueStudy study = new BreakContinueStudy();
	//study.test1();
	study.test2();
	}

/**
 * 반복문 안에 break, continue를 통해 분기 처리할 수 있다.
 * 1. break 인접한 반복문을 즉시 탈출한다.
 * 2. continue 하위코드 실행을 하지 않고, 반복문 처음으로 이동
 *    - for문 증감식으로 이동
 *    - while 조건식으로 이동
 */

public void test1() {
	
	// 1부터 사용자 입력값까지 출력하기
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 입력: ");
	int n = sc.nextInt();
	
	//while 썼을 때
	int i = 1;
	while (true) {
		System.out.print(i + " ");
		
		if (i == n) {
			break;
		}
		i++;
	}

	
	// for 썼을 때 
	for(int j = 1; true; j++) {
		System.out.print(j + " ");
		if ( j == n ) break;
	}
}

/**
 * continue 하위에서 증감 연산 하지 않도록 주의할 것. - 무한반복 나오게 됨 
 * 매턴마다 증감 연산이 가능해야 한다.
 */

	// 1~20 사이 짝수만 출력
	public void test2() {
		// while1
		int i = 0;
		while(i <= 20) {
			if(i++ % 2 == 0)
				continue;
			System.out.print(i + " ");	
		}
		
		//while 2
//		int i = 0;
//		while(i++ <= 20) {
//			if(i % 2 != 0)
//				continue;
//			System.out.println(i);	
//		}
		
		// for
		System.out.println();
		
		for (int j = 1; j <= 20; j++) {
			if (j % 2 != 0)
				continue;
			System.out.print(j + " ");
		}
	}
	
	
	
	
	
}


	
	
	
	
	
	
	
	
	

