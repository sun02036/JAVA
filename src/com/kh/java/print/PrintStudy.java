package com.kh.java.print;

public class PrintStudy {
	
	
	public static void main(String[] args) {
	
		//1. 객체생성
		//2. 객체이용해서 test1 호출
		PrintStudy ps = new PrintStudy();
//		ps.test1();
		ps.test2();
		
	}
	
	/**
	 * escape문자
	 * 역슬래쉬와 특정문자를 조합해서 특정기능을 수행
	 * \n : 개행
	 * \t : 탭
	 * \\ : 역슬래시를 문자그대로 표현
	 * \" : 쌍따옴표를 문자그대로 표현
	 */
	public void test2() {
		// 문자열 + 숫자 -> 문자열
		System.out.println("안녕" + "abc" + 123); // "안녕abc123" 
		
		System.out.print(1 + "\n"); // "1\n"
		System.out.print("\t" + 2 + "\n"); 
		System.out.print("        " + 3 + "\n");
		System.out.println("D:\\Workspaces\\java_workspace");
		System.out.println("철수가 말했다.\"이제 곧 점심시간이야~\"");
	}
	
	
	/**
	 * javadoc주석 : class/method에 대한 설명
	 * 
	 * 출력 
	 * 	System.out.println
	 * 	System.out.print
	 */
	public void test1() {
		System.out.println(1); // 내용출력 + 개행
		System.out.println(2);
		System.out.println(3);
		
		System.out.print(1); // 내용출력
		System.out.print(2);
		System.out.print(3);
	}
	
	
}
