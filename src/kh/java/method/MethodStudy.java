package kh.java.method;

import java.util.Scanner;

/**
 * class 안에 작성해야함 
 * main method를 시작으로 method를 차례로 호출하면서 프로그램이 진행 
 * 
 * method signature 
 * - 접근제한자
 * - 리턴타입
 * - 이름
 * - 매개변수선언부: method 호출 시 전달할 값이 담길 공간 
 *
 *
 * method를 통해서 중복을 제거, 재사용 가능한 형태로 만들 수 있다. 
 */

public class MethodStudy {

	public static void main (String [] args) {
	MethodStudy ms = new MethodStudy ();
	//ms.test1 ();
	//ms.test2();
	ms.test3();
	
	}
	
	public void test1() {
		
//		String name = "홍길동";
//		int age = 30;
//		System.out.printf("안녕하세요, 저는 [%s] 입니다. [%d]살이예요. 잘 부탁드립니다.%n",name, age);
			
//		name = "신사임당";
//		age = 48;
//		System.out.printf("안녕하세요, 저는 [%s] 입니다. [%d]살이예요. 잘 부탁드립니다.%n",name, age);
		
		// 메소드 선언부대로 호출해야 한다.
		// 매개인자(arguments): 호출 시 전달하는 값 
		printPerson("홍길동", 30); // 매개인자
		printPerson("신사임당", 48);
		
		
	}
	
	/**
	 * 매번 달라지는 값은 매개변수로 처리한다.
	 * 
	 * 매개변수(parameter): 호출 시 전달된 매개인자를 담을 공간 
	 */
	public void printPerson(String name, int age) { //매개변수
		
		System.out.printf("안녕하세요, 저는 [%s] 입니다. [%d]살이예요. 잘 부탁드립니다.%n",name, age);
	}
	
/**
 * 리턴값이 있는 메소드 
 */
	
	public void test2() {
//		Scanner sc = new Scanner (System.in);
//		System.out.print("정수를 입력하세요: ");
//		int num1 = sc.nextInt();
//		System.out.print("정수를 입력하세요: ");
//		int num2 = sc.nextInt();
		
		int num1 = userInputNum(); // num1을 만들고 우항의 값을 대입해라 
		int num2 = userInputNum(); // 실행결과의 값을 우항에서 좌항에 넣는 것 
		
		int sum = num1 + num2;
		System.out.printf("합 = %d%n", sum);
}
	// 겹치는 부분을 바꾸는 것
	// 사용자에게 정수를 입력 받는 메소드
	
		public int userInputNum() {// 여기로 점프 
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력하세요: ");
			return sc.nextInt();
			// void가 아니면 무조건 return 구문 필요함 
	}
		
		// @친구 3명의 이름을 입력받고, 출력하기 
		// - 입력받는 메소드 작성할 것.
		// 친구1을 입력하세요 > ---
		// 친구2을 입력하세요 > ---
		// 친구3을 입력하세요 > ---
		
		//당신의 친구는 [---, ---, ---] 입니다.
		
		public void test3() {
		    String fr1 = inputFriendName(1); 
		    String fr2 = inputFriendName(2); 
		    String fr3 = inputFriendName(3); 
			System.out.printf("당신의 친구는 [%s], [%s], [%s] 입니다.", fr1, fr2, fr3);
		
		}
		
		
			public String inputFriendName(int n) {
			Scanner sc = new Scanner(System.in);
			System.out.printf("친구%d 이름을 입력하세요. > ", n);
			return sc.next();
		
			}
		
		
}
