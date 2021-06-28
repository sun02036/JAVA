package com.kh.java;

import com.kh.java.k.KWorld;


/*
 * 여러줄 주석 : compiler에 의해 처리되지 않는다.
 * package : directory 
 * 	관련있는 class끼리 묶어서 관리
 *  중복을 피하기위해 3레벨이상을 사용
 *  web application domain등을 뒤집어 고유하게 사용하는편. http://java.kh.com
 *  패키지 java는 사용할수 없다. 
 *  
 *  클래스의 원래이름은 패키지를 포함한다. com.kh.java.HelloWorld
 *  
 *  class명은 관례상 대문자로 시작하고, 연결된 단어의 첫글자는 대문자로 사용한다. 
 */

//comment를 입력하면 주석을 의미하므로 jvm을 실행하지 않는다.

//class

public class HelloWorld {

	// 실행 method
	// 프로그램의 시작을 의미함
	// main method가 끝나면 프로그램이 종료됨 
	// main method는 프로그램당 하나씩 반드시 존재함
	public static void main (String[] args) {

		// 출력문
		// 문자열: "쌍따옴표"로 감싸서 표현 
		System.out.println("Hello World~");
		System.out.println("Lotte World~");
		
		// 문자: '홑따옴표'로 감싸서 표현. 한글자
		System.out.println('김');
		System.out.println('ㅋ');

		//숫자
		System.out.println(123); //정수
		System.out.println(45.678); //실수
		System.out.println(3 + 7); //계산식

		//논리값 true | false
		System.out.println(true);	
		System.out.println(false);
		System.out.println(5 > 3);
		System.out.println(3 > 5);

	}	
}

