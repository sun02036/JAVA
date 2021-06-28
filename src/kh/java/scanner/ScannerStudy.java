package kh.java.scanner;

import java.util.Scanner;
//import java.lang.*; 
// java.lang패키지의 클래스는 import문 생략가능
// compile시에 자동으로 import처리됨.

public class ScannerStudy {

	public static void main(String[] args) {
		ScannerStudy study = new ScannerStudy();
//		study.test1();
		study.test2();
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요(남|여) > ");
		//char gender = sc.next().charAt(0);
		String input = sc.next();
		char gender = input.charAt(0);
		System.out.printf("성별 : %c%n", gender);
		
		//문자열 
		String s = ""; // 빈문자열 : 길이제한이 없다. 0 ~ n
		//문자
		char ch = ' '; // 문자1개: 빈문자허용하지 않음.		
	}
	
	/**
	 * jdk 1.5부터 사용자입력을 손쉽게 처리할 수 있는 클래스
	 * 
	 * - System.in 표준입력(키보드)
	 * - System.out 표준출력(콘솔)
	 * 
	 * 1. next():String
	 * 	  nextInt():int
	 * 	  nextDouble():double
	 * 	  nextBoolean():boolean
	 * 	  nextChar(x) -> next().charAt(0)
	 * 	  버퍼에서 사용자 입력값을 읽어올때, 
	 *    실제입력값 이전의 공백/개행문자 무시하고, 실제입력값 이후 공백/개행문자 전까지 읽어온다.
	 *    필요에 따라 해당타입으로 형변환한다.
	 * 
	 * 2. nextLine():String
	 * 	  버퍼에서 사용자 입력값을 읽어올때,
	 *    개행문자까지 읽어와서 개행문자를 버리고, 리턴한다.
	 *    
	 * 주의할것)
	 * next다음에 nextLine사용하는 경우, 
	 * next가 buffer에서 개행문자를 읽어가지 않으므로,
	 * nextLine사용전에 개행문자를 제거해야한다.    
	 * 
	 */
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 > ");
		String name = sc.next();
		System.out.println("당신의 이름은 [" + name + "]입니다.");
//		
//		System.out.println("나이를 입력하세요 > ");
//		int age = sc.nextInt(); // String -> int 형변환후 리턴
//		System.out.println("당신의 나이는 [" + age + "]살 입니다.");
//		
//		System.out.println("키를 입력하세요 (예: 180.5) > ");
//		double height = sc.nextDouble(); // String -> double로 형변환후 리턴
//		System.out.println("당신의 키는 [" + height + "]cm 입니다.ㅊ");
//		
//		System.out.println("결혼여부: 기혼이면, true를 미혼이면 false를 입력하세요 > ");
//		boolean isMarried = sc.nextBoolean(); // String -> boolean 형변환후 리턴
//		System.out.println("결혼여부 : " + isMarried);
		
		//개행문자제거
		sc.nextLine();
		
		//주소입력 : 공백이 포함되어 있는 문자열
		System.out.println("주소를 입력하세요 > ");
		String addr = sc.nextLine();
		System.out.println("주소 : [" + addr + "]");
	}
}
