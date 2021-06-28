package kh.java.test.array;

import java.util.Scanner;

public class Test5 {

	public static void main (String [] args) {
		Test5 arrayTest = new Test5 ();
		arrayTest.test();
		
//		    주민등록번호 성별자리 이후부터 *로 가리기.  
//			단, 원본 배열값은 변경 없이 배열 복사본으로 
//			변경하세요
//			힌트) 복사방법
//			   - for문이용 1:1대입
//			   - System.arraycopy() 매소드 이용
//			   - clone() 매소드 이용
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호를 입력하세요: "); 
		String num = sc.next();
		
		char [] arr1 = new char [13]; //13자리의 문자형배열에 저장한후,  
		
		for (int i = 0; i < 13; i++) {
			arr1[i] = num.charAt(i);
			
		}
		
		char [] arr2 = new char [arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		// 원본 배열, 시작 인덱스, 도착 배열, 시작 인덱스, 복사할 값의 갯수
	
		for (int i = 6; i < 13; i++) { // 3~6자리까지 *로 변형 
			arr2[i] = '*';
			
		}
		
		System.out.print("변경 전: ");
		for(char ch : arr1) {
			System.out.print(ch);
		}
		
		System.out.print("변경 후: ");
		for(char ch : arr2) {
			System.out.print(ch);
		}	
		
	}
		
	
}

		
		