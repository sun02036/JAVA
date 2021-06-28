package kh.java.format;

public class PrintfStudy {

	public static void main(String[] args) {
		PrintfStudy study = new PrintfStudy();
//		study.test1();
		study.test2();
	}
	
	/**
	 * 너비, 정렬
	 * %[flag][padding][width]형식문자
	 * 
	 * - flag + : 우측정렬(기본값)
	 * - flag - : 좌측정렬
	 * - padding 남은 영역을 채울 문자 
	 */
	public void test2() {
		int num = 123;
		System.out.printf("[%010d]%n", num);
		System.out.printf("[%-10d]%n", num);

		System.out.printf("%,d\n", 1000000000);
        System.out.printf("%,d\n", 1234);
	}
	
	/**
	 * printf : 값이나 변수를 특정형식에 맞게 출력. 타입별로 형식문자를 제공
	 * 
	 * %b : boolean
	 * %c : char
	 * %s : String
	 * %d : 정수형 
	 * %f : 실수형(기본적으로 소수점이하 6번째자리까지 표현), %.2f - 반올림해서 소수점이하 둘째자리까지 출력
	 * 
	 * %n 또는 \n 개행처리
	 */
	public void test1() {
	
		// PrintStream java.io.PrintStream.printf(String format, Object... args)
		System.out.printf("결혼여부 : %b, 애완견 : %b%n", true, false);
		
		String format = "%s맛이 %c~, 맥주맛이 %c~%n";
		char ch = '캬';
		String name = "콜라";
		System.out.printf(format, name, ch, ch);
		
		int kor = 80;
		double eng = 75.5;
		double math = 33.336333333333333;
		System.out.printf("국어 : %d, 영어 : %f, 수학 : %.2f%n", kor, eng, math);
		
		
		System.out.println("------------------------------------");
	}
}
