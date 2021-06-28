package com.kh.var;

import java.util.Scanner;

public class VarExample {

	/*
	 	1. 실행용 클래스
	      패키지 : kh.java.var
	      클래스명 : Run
		 추가메소드
	       public static void main(String[] args)
	      내용 : VarExample의 Example실행
	
	     기능제공 클래스
	      패키지 : kh.java.funtion
	 	 클래스명 : VarExample
	      추가 메소드
	       public void Example(){   }
	      내용 :  정수 두개를 입력받아 두수의 합, 차, 곱, 
	                 나누기 출력

	 */
	public void example() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 정수1를 입력하세요 => ");
		int num1 = sc.nextInt();
		
		System.out.print("> 정수2를 입력하세요 => ");
		int num2 = sc.nextInt();
		
		//결과출력 
		System.out.println("--------------------------");
		System.out.println("> 두수의 합 => "+(num1+num2));
		System.out.println("> 두수의 차 => "+(num1-num2));
		System.out.println("> 두수의 곱 => "+(num1*num2));
		System.out.println("> 두수의 나누기 => "+(num1/num2));
		
	}

	/*
		2.  1번 VarExample클래스에서 메소드 추가
		추가 메소드
	       public void Example2(){}
	       내용 : 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력
	
		계산공식
		  면적 : 가로 *세로
		  둘레 : (가로+세로) *2

	 */
	public void example2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 가로길이를 입력하세요 => ");
		double width = sc.nextDouble();
		
		System.out.print("> 세로길이를 입력하세요 => ");
		double height = sc.nextDouble();
		
		//결과출력 
		System.out.println("--------------------------");
		System.out.println("> 면적 => "+(width*height)+"cm2");
		System.out.println("> 둘레 => "+((width+height)*2+"cm"));
		
		
	}


	/*
	 	2.  1번 VariExample클래스에서 메소드 추가
		추가 메소드
	       public void Example3(){   }
	      내용 :  문자열을 키보드로 입력 받아 각 자리의 문자를 출력
	
	      출력 예) 입력 : apple 
                 첫번째 문자 : a
                 두번째 문자 : p
                 세번째 문자 : p

	 */
	public void example3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 문자열(3글자)을 입력하세요 => ");
		String str = sc.next();
		char c0 = str.charAt(0);
		char c1 = str.charAt(1);
		char c2 = str.charAt(2);
		
		//결과출력
		System.out.println("-------------------");
		System.out.println("> 사용자입력값 : "+str);
		System.out.println("> 첫번째 문자 : "+c0);
		System.out.println("> 두번째 문자 : "+c1);
		System.out.println("> 세번째 문자 : "+c2);
		
	}
	
}
