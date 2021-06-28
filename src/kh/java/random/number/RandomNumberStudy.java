package kh.java.random.number;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberStudy {
	
public static void main (String [] args) { 
	RandomNumberStudy study = new RandomNumberStudy ();
	//study.test1 ();
	//study.coinGame();
	//study.test2();
	study.test3();
	
	
}

/**
 * java.util.Random
 */

public void test1 () {
	Random rnd = new Random ();
	// int 범위에서 임의의 수 하나를 지원
	System.out.println(rnd.nextInt()); 
	// 1~10 사이의 난수를 얻고싶을 때: nextInt(bound)(경우의 수) + 최소값을 더해줘야함
	System.out.println(rnd.nextInt(10) + 1); // +1 안하면 9까지만 나옴 
	
	// 임의의 boolean 값
	System.out.println(rnd.nextBoolean());
	
	// 0.0 이상 1.0 미만의 임의의 실수
	System.out.println(rnd.nextDouble()); // 1.0은 절대 안나옴 
}

// 동전게임
// 실제 동전(감추기): 난수로 처리
// betting: 사용자 입력으로 처리
// 난수와 사용자 입력 일치 여부로 승패 판단 
	public void coinGame() {
		Random rnd = new Random ();
		int coin = rnd.nextInt(2); // 0 또는 1이 결정될 것 
				
	//사용자 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("베팅해주세요. (앞:0 | 뒤:1)");
		int userInput = sc.nextInt();
		
	// 검사
		String result = coin == userInput ? "당신이 승리했습니다." : "당신은 패배했습니다.";
		System.out.printf("동전은 [%c]입니다. %s%n", (coin == 0? "앞" : "뒤"), result);
	}
	

/**
 * Math.random(): double 
 * 0.0 이상 ~ 1.0 미만의 실수를 리턴
 */

public void test2 () {
	double rnd = Math.random();
	System.out.println(rnd);
	
	// 1~10까지 난수
	// 난수 * 경우의 수 + 최소값 
	int num = (int)(Math.random()* 10) + 1;
	System.out.println(num);
	
}

/**
 * @실습문제
 * 0~9까지의 난수
 * 1~10까지의 난수
 * 20~35까지의 난수
 * 0 또는 1 
 */

public void test3 () {
	Random rnd = new Random ();
	int num = (int)(rnd.nextInt(10));
	System.out.println(num);
	int num1 = (int)(rnd.nextInt(10) + 1);
	System.out.println(num1);
	int num2 = (int)(rnd.nextInt(16) + 20);
	System.out.println(num2);
	int num3 = rnd.nextInt(2); 
	System.out.println(num3);

	
	
	
}
}
