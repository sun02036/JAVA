package kh.java.type;

/**
 * 자료형 DataType
 * 1.기본형 Primitive Type : 공간에 값 대입
 * 		- 논리형
 * 			boolean(1byte)
 * 		- 문자형
 * 			char(2byte)
 * 		- 정수형
 * 			byte(1byte)
 * 			short(2byte)
 * 			int(4byte)
 * 			long(8byte)
 * 		- 실수형
 * 			float(4byte)
 * 			double(8byte)
 * 	
 * 2.참조형 Reference Type : 공간에 주소 대입
 *
 */
public class PrimitiveTypeStudy {

	public static void main(String[] args) {
		PrimitiveTypeStudy study = new PrimitiveTypeStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
		
	}
	
	/**
	 * Data Overflow : 크기가 한정된 데이터타입의 변수에서 범위를 넘어선 숫자를 다루게 되면
	 * 				   최소값으로 이동/처리되는 것.
	 */
	public void test4() {
		// 좌항의 공간에 우항의 값을 대입
		int i = Integer.MAX_VALUE; // 2147483647
		i = i + 1;
		i = i + 1;
		System.out.println("i = " + i); // 2147483648(x) -> -2147483648(o)
	}
	
	/**
	 * 상수 : 값이 정해지면 변경할 수 없는 변수. final키워드 사용
	 * 		 변수명을 모두 대문자로 처리.
	 * 		 실수로 값변경을 방지
	 */
	public void test3() {
		final int NUM; 
		NUM = 100;
//		NUM = 200;
		System.out.println("NUM = " + NUM);
		
		// JDK가 제공하는 상수
		// Wrapper Class : 기본형과 매칭되는 자바클래스
		System.out.println("byte : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
	}
	
	/**
	 * 기본형으로 처리할 수 있는 값 10개 : 변수선언후 값대입 출력
	 * 메소드안의 변수(지역변수)는 다른 메소드에서는 사용할수 없다.
	 * 변수의 생명주기(Life Cycle)은 메소드블럭{}에 한정된다.
	 */
	public void test2() {
		//1. 선언
		//2. 값대입
		//3. 변수사용 : print, 연산
		boolean isMarried;
		isMarried = true;
		
		boolean hasPet;
		hasPet = false;
		
		int pointA = 300;
		int pointB = 250;
		int pointC = pointA; 
		// 대입연산자 : 좌항(공간)에 우항(값)을 담는다.
		int sum = (pointA + pointB);
		
		System.out.println("sum = " + sum);
	}
	
	/**
	 * 1. 변수 선언
	 * 2. 값대입
	 * 3. 변수 사용
	 */
	public void test1() {
		//1. 변수 선언 
		boolean bool;
		char ch;
		byte b;
		short sh;
		int num;
		long userNum; // CamelCasing 변수명명법 : 소문자로 시작, 연결된 단어의 첫글자는 대문자.
		float f;
		double dNum;
		
		//2.값대입 : 
		// = 대입연산자 - 우항을 값을 좌항 변수 공간에 대입.
		bool = true;
		ch = '가';
		b = 123;
		b = 40;
		sh = 11111;
		num = 12345678;
		userNum = 1267890242423342L; // 정수(값, 변수)의 기본형은 int 
		f = 0.12345678901234567890f; // 소수점 이하 7자리
		dNum = 0.12345678901234567890; // 소수점 이하 16자리
		
		//3. 사용
		System.out.println("bool = " + bool);
		System.out.println("ch = " + ch);
		System.out.println("b = " + b);
		System.out.println("sh = " + sh);
		System.out.println("num = " + num);
		System.out.println("userNum = " + userNum);
		System.out.println("f = " + f);
		System.out.println("dNum = " + dNum);
		
		//성별 - 남/여, M/F
		char gender;
		gender = 'F';
		System.out.println("gender = " + gender);
		
		//통장잔고 - long
		long balance;
		balance = 2_100_000_000;
		System.out.println("balance = " + balance);
		
		// 초기화 : 선언과 값대입을 한번에 처리
		int studentNo = 234;
		System.out.println("studentNo = " + studentNo);
			
	}
	
	
}

