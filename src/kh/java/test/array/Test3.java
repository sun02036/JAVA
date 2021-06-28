package kh.java.test.array;

import java.util.Scanner;

public class Test3 {

	public static void main (String [] args) {
		Test3 arrayTest = new Test3 ();
		arrayTest.test();
		
//	    문자열을 하나 입력 받아 문자 배열에 넣고 
//		검색할 문자를 하나 입력 받아 
//		검색 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을 작성하세요.
//		예) 입력값 : helloworld
//		검색값 :ㅣ
//		출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
		
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요: "); // 문자열을 하나 입력 받아 문자 배열에 넣고 
		String code = sc.nextLine();
		
		int cnt = 0;
		char [] arr = new char [code.length()];
		
		for (int i = 0; i < code.length(); i++) {
			arr[i] = code.charAt(i);
		}
		
		do {
			System.out.print("검색할 문자열을 입력하세요: "); // 검색할 문자를 하나 입력 받아 
			char search = sc.next().charAt(0);
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == search) {
					cnt++;
				}
			}
				System.out.printf("찾고자 하는 문자[%c]는 총 %d개 입니다.%n", search, cnt); break;
		}while(true);
	}
}

			
		
		

			
		
		
		
		
	
