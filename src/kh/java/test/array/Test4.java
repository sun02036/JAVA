package kh.java.test.array;


import java.util.Scanner;


public class Test4 {
	public static void main(String[] args){
		Test4 t = new Test4();
		//t.test1();
		//t.ex1();
		t.ex2();
	}

	/*
		4) 사용자의 전화번호를 입력받고, 
		11자리의 문자형배열에 저장한후,  
		가운데 4자리를 *로 가리기.  
		
	   단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
	 
		힌트) 복사 방법
	   - for문이용 1:1대입
	   - System.arraycopy() 매소드 이용
	   - clone() 매소드 이용
	 */
	
	   // 1. 문자 배열에 옮겨 담기
	   // 2. 배열 깊은 복사를 통해 복사본 생성
	   // 3. 복사본에 대해서 가운데 4자리 **** 처리하기 
	
	private void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 (-) 없이 입력하세요 (예시. 0101234578) ==> ");
		String phNum = sc.nextLine();
		
		//char[] cArr = phNum.toCharArray();//자바는 문자열을 char[]로 변환하는 메소드를 제공한다.
		char[] cArr = new char[phNum.length()];
		
		for (int i = 0; i < phNum.length(); i++) {
			cArr[i] = phNum.charAt(i); // 우항의 값을 좌항의 공간에 대입 
			//cArr 배열에 char로 변환된 phNum 값을 대입한 것  
		}
		
		//복제본 생성
		char[] cArrCopy = new char[cArr.length];
		
		//1.for문이용 깊은복사
		for (int i = 0; i < cArr.length; i++) {
			if (i>2 && i<7) {
				cArrCopy[i] = '*';
			}
			else cArrCopy[i] = cArr[i];
		}
		
		//2. System.arraycopy() 이용 깊은복사
		/*System.arraycopy(cArr, 0, cArrCopy, 0,11); //리턴값 없음.
		for (int i = 0; i < cArrCopy.length; i++) {
			if(ii>2 && i<7) cArrCopy[i] = '*';
		}*/
		
		//3. clone() 이용 깊은 복사
//		cArrCopy = cArr.clone();
//		for (int i = 0; i < cArrCopy.length; i++) {
//			if(i>2 && i<7) cArrCopy[i] = '*';
//		}
		
		//확인용
		//원본 cArr
		for (int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i]);
		}
		System.out.println("\n----------------------");

		//복사본 cArrCopy
		for (int i = 0; i < cArrCopy.length; i++) {
			System.out.print(cArrCopy[i]);
		}
	}
	
	// ** 강사님이 다시 풀어준 것 **
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 (-)없이 입력하세요 (예시.0101234578) ==> ");
		String phNum = sc.nextLine();
		//1. 문자배열에 옮겨담기
		// - 문자열 길이 str.length() 메소드
		// - 배열의 길이 arr.length 속성
		char[] phArr = new char[phNum.length()]; 
//		for(int i = 0; i < phNum.length(); i++) {
		for(int i = 0; i < phArr.length; i++) {
//			char ch = phNum.charAt(i); // 문자열에서 한글자 읽어오기
//			phArr[i] = ch; // 문자배열에 한글자 대입
			phArr[i] = phNum.charAt(i);
		}
		//2. 배열 깊은 복사를 통해 복사본생성
		//3. 복사본에 대해서 가운데 4자리 ****처리하기
		char[] phCopy = new char[phArr.length];
		for(int i = 0; i < phCopy.length; i++) {
			//우항의 값을 좌항의 공간에 대입
			if(i >= 3 && i <= 6)
				phCopy[i] = '*';
			else
				phCopy[i] = phArr[i];
		}
		System.out.println(phArr.hashCode());
		System.out.println(phCopy.hashCode());
		System.out.println(phArr);
		System.out.println(phCopy);
	}
	
	
/*
*     위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
* 		java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
* 		문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.
*/
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 (-)없이 입력하세요 (예시.01012345678) ==> ");
		String phNum = sc.nextLine();
			System.out.println(phNum);
		
		// beginIndex 포함 inclusive
		// endIndex 미포함 exclusive
		// beginIndex 이상 endIndex 미만
		String num1 = phNum.substring(0, 3);
		String num2 = "****";
		String num3 = phNum.substring(7);
		
		phNum = num1 + num2 + num3;
		System.out.println(phNum);
	}
}


    
