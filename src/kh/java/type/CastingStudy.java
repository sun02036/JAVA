package kh.java.type;

/**
 * 컴퓨터 작동원리
 * 1. 값을 변수에 대입할때, 동일한 타입의 변수여야 한다. int a = 100;
 * 2. 같은 자료형의 값 또는 변수끼리 연산이 가능하다. a + b
 * 3. 연산 결과는 동일한 자료형이다. a(int) + b(int) ---> result(int)
 * 
 * 
 * Casting 형변환
 * 1. 자동형변환(암묵적) : 크기가 작은 자료형에서 큰 자료형으로 자동형변환된다.
 * 		실수형은 지수표현식처리를 통해 작은 크기로 더 많은 양의 값을 표현할 수 있다. 
 * 		byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
 * 				-> char(2) 
 *
 * 2. 직접형변환(명시적)
 * 
 * 
 * 
 *
 */
public class CastingStudy {

	public static void main(String[] args) {
		CastingStudy study = new CastingStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
	}
	
	/**
	 * 문자열 : "" 쌍따옴표로 감싸서 표현
	 * String 참조형 타입 : 많은 빈도로 사용되므로, 기본형처럼 사용할 수 있도록 예외적으로 허용
	 */
	public void test5() {
		//String name = new String("홍길동");
		String name = "홍길동"; // 값 Literal을 직접 대입하는 문법 지원
		System.out.println("name = " + name);
		
		// 더하기연산 지원
		System.out.println("안녕" + "하세요"); // "안녕하세요"
		System.out.println("문자열" + 123); // "문자열123"
		System.out.println("밥 먹었니?" + true);// "밥 먹었니?true"
		System.out.println("안녕" + 12 + 34); // "안녕12" + 34 -> "안녕1234"
		System.out.println("안녕" + (12 + 34));
		System.out.println(12 + 34 + "안녕"); // 46 + "안녕" -> "46" + "안녕"-> "46안녕"
		
		System.out.println("abc" + 'd' + 1); // (String + char) + int -> String + int ->  "abcd1"
		System.out.println(1 + 'a' + "bc"); // (int + int(97)) + String -> int(98) + String ->  "98bc"
	}
	
	/**
	 * @실습문제
	 */
	public void test4() {
		System.out.println('A' + 0); // char + int -> int 65 + int
		System.out.println('0' + 0); // char + int -> int 48 + int
		
		byte bnum = 125;
		char ch = 'C';
		System.out.println(bnum - ch); // byte - ch -> int 125 - int 67 -> 58
		
		// == 동등비교연산자 좌항과 우항의 값이 같은가? 
		boolean bool = 2.0 == 5 / 2; // double(2.0) == int(2) -> double == double(2.0) -> true 
		System.out.println(bool);
		
		bool = 'C' == 67; // char == int -> int(67) == int -> true
		System.out.println(bool);
		
		bool = 'Z' < 67; // char < int -> int(90) < int(67) -> false
		System.out.println(bool);
		
 		bool = 'A' == 'B' - 1; // char == (int(66) - int) -> int(65) == int(65) -> true
		System.out.println(bool);
	}
	
	/**
	 * 예외적 처리
	 * 1. byte, short, char 연산시 자동으로 int로 형변환후 연산한다.
	 * 2. int값을 char변수 대입시에는 자동형변환 처리된다.
	 */
	public void test3() {
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2); // byte + byte -> int + int -> int
		System.out.println("b3 = " + b3);
		
		char a = 97;
		System.out.println("a = " + a); // 문자로 처리
		System.out.println("a + 1 = " + (a + 1)); // 숫자로 변환 처리
	}
	
	/**
	 * 명시적 형변환
	 */
	public void test2() {
		// 1. 데이터 손실이 있는 경우, 명시적으로 형변환 해야한다.
		double dnum = 3.456;
		int inum = (int) dnum;
		System.out.println("inum = " + inum + ", dnum = " + dnum);
		
		// 2. 연산을 위해 큰 타입으로 변환
		System.out.println(((double) 5) / 2);
		// 5 / 2 : int / int
		// 5.0 / 2 : double / int
		// 5.0 / 2.0 : double / double ---> double 2.5
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 / (double) num2); // 5 / 2.0
		
		System.out.println((double)(5 / 2));
		
		//@실습문제: 2147483647 + 1 -> 2147483648
		int i = Integer.MAX_VALUE;
		System.out.println((long) i + 1);
		System.out.println(i + 1L);
	}
	
	/**
	 * 자동형변환 : 데이터 손실이 없다.
	 */
	public void test1() {
		byte bnum = 100;
		int inum = bnum; // byte -> int로 자동형변환
		System.out.println("inum = " + inum);
		
		System.out.println("3 + 5.5 = " + (3 + 5.5));
		// (3 + 5.5) int + double
		// 3.0 + 5.5 double + double ---> 8.5 double
		
		// 나누기연산 : 몫을 구하는 연산
		System.out.println("5 / 2 = " + (5 / 2)); // 2
		// 5 / 2 -> int / int -> int
		
		// 나머지연산 
		System.out.println("5 % 2 = " + (5 % 2)); // 1
		
		char ch = '樂';
		int chNum = ch;
		System.out.println("ch = " + ch + ", chNum = " + chNum);
		
		System.out.println('a' + 5); // 'a' + 5 => 102
		// char + int -> int + int
		System.out.println('Z' + 5); 
		
		
	}
}
