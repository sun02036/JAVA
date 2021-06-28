package kh.java.operator;
import java.util.Scanner;

public class OperatorStudy {
	
	public static void main (String [] args) {
		OperatorStudy study = new OperatorStudy();
		//study.test1();
		//study.test2();
		//study.test3();
		//study.test4();
		//study.test5();
		//study.test6();
		study.test7();
		
	}
	
// 증감연산자
	
	public void test1 () {
		int a = +3;
		int b = -7;
		System.out.printf("a = %d, b = %d%n", a, b);
		
		boolean bool = true;
		System.out.printf("bool = %b%n", !bool);
	
		// 증감연산자: 기존 변수의 값을 1 증가 혹은 1 감소 시키는 것 
		// ++ = 1 증가, -- = 1 감소
		
		int i = 10;
		i++;
		System.out.printf("i = %d%n", i);
		i--;
		System.out.printf("i = %d%n", i);
		
		// 단독으로 사용 시는 두개의 결과가 동일
		// 1. 전위 증감연산자 (앞에 위치하는) ++a, --a: 1 증감 후 인접연산 처리 
		// 2. 후위 증감연산자 (뒤에 위치하는) a++, a--: 인접연산에 사용된 후 1 증감 처리
		int k = 3;
		int m = --k;
		System.out.printf("k = %d, m = %d%n", k, m);
		
		int x = 20;
		int y = 10;
		int z = x++ + --y;
		System.out.printf("x = %d, y = %d, z = %d%n", x, y, z);
	}
	
// 이항연산자
	
	public void test2() {
		int a = 10;
		int b = 3;
	
	System.out.printf("a + b = %d%n", a + b);
	System.out.printf("a - b = %d%n", a - b);
	System.out.printf("a * b = %d%n", a * b);
	System.out.printf("a / b = %d%n", a / b);
	System.out.printf("a %% b = %d%n", a % b); // %% escaping
	
// 비교연산자
	System.out.printf("a > b : %b%n", a > b); // gt(greater than) 크다
	// a가 b보다 큰가?
	System.out.printf("a < b : %b%n", a < b); // lt(less than) 작다
	// a가 b보다 작은가?
	System.out.printf("a >= b : %b%n", a >= b); // ge(greater than or equal to) 크거나 같다
	System.out.printf("a <= b : %b%n", a <= b); // le(less than or equal) 작거나 같다
	
	System.out.printf("a == b : %b%n", a == b); // 같으면 true, 다르면 false
	System.out.printf("a != b : %b%n", a != b); // 다르면 true, 같으면 false 
	
	// a가 짝수인가?
	System.out.printf("a는 짝수인가? %b%n", a % 2 == 0);
	System.out.printf("b는 홀수인가? %b%n", b % 2 != 0);
	}
	
	// @사용자에게 정수를 입력받고, 짝수 여부를 출력하기 
	
//	public void test3 () {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("정수를 입력하세요.");
//		int uc = sc.nextInt();
//		System.out.printf("짝수 여부 > %b%n", uc % 2 == 0);
		
		/**
		 * a && b: and라고 읽음 - a가 true이면서 b가 true인가?
		 * a || b: or라고 읽음 - a 또는 b가 true인가?
		 */
		
	// @입력한 수가 2의 배수이면서 3의 배수인가요?
	public void test4 () {
			Scanner sc = new Scanner (System.in);
			System.out.println("정수를 입력하세요.");
			int num = sc.nextInt();
//			boolean bool = (num % 2) == 0 && (num % 3) == 0;
//			System.out.printf("2의 배수이면서 3의 배수 > %b%n", bool);
			
	// @입력한 수가 2의 배수이거나 3의 배수인가요?
			boolean bool = (num % 2) == 0 || (num % 3) == 0;
			System.out.printf("2의 배수이거나 3의 배수 > %b%n", bool);
	}
	
	/**
	 * &&
	 * ||
	 * 선택적 처리	
	 * 
	 * &: 좌항이 false여도 우항을 검사하는 and
	 * |: 좌항이 true여도 우항을 검사하는 or 	
	 */
			
	public void test5() {
		
		int a = 1;
		int b = 1;
		
		// a && b
		boolean bool = a == 0 & b++ == 1;
		System.out.printf("bool = %b, a = %d, b = %d%n", bool, a, b);
				
		// a||b
//		boolean bool = (--a < 0) || (b++ == 1);
//		System.out.printf("bool = %b, a = %d%n", bool, a, b);
	}

	
//삼항연산자
//(조건식) ? (참일때 값) : (거짓일때 값)

		public void test6() {
		int a = 4;
		int b = (a % 2 == 0) ? (100) : (99);
		
		System.out.printf("a = %d, b = %d%n", a, b);
		Scanner sc = new Scanner (System.in);
		System.out.println("정수 입력: ");
		int input = sc.nextInt();
		String result = (input % 2 == 0) ? "짝수입니다." : "홀수입니다.";
//		String result = "짝수입니다."; // true
//		String result = "홀수입니다."; // false
		
		System.out.printf("입력한 값 [%d]는 %s%n", input, result);
		
		}
		
		
// 복합대입연산자
// +=
// -=
// *=
// /=
// %=
		public void test7() {
			int a = 10;
			//a = a + 5;
			a += 5;
			System.out.println("a = " + a);
			
			int b = 7;
			b -= 3;
			System.out.println("b = " + b);
			
			int c = 8;
			c *= 3;
			System.out.println("c = " + c);
			
			int d = 9;
			d /= 3;
			System.out.println("d = " + d);
			
			int e = 10;
			e %= 3;
			System.out.println("e = " + e);
		}
	

}
