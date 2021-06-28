package kh.java.test.array;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		Test6 t = new Test6();
		//t.test();
		t.test2();
	}

	/*
	배열의 크기로 홀수인 양의 정수를 입력 받아 배열을 만드세요. 
	배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 
	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하는 프로그램을 작성하세요.
	
	5
	{1,2,3,2,1}
	
	7
	{1,2,3,4,3,2,1}
	
	*/

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인 양의정수를 하나 입력하세요 ==> ");
		int num = sc.nextInt();
		
		//int배열생성,할당
		int[] intArr = new int[num];
		
		//홀수면 실행
		if(num%2 == 1){
			int mid = num/2; //몫의 값이 배열의 가운데 인덱스 값과 동일하다.
			
			for (int i = 0; i < num; i++) {
				if (i<=mid) {
					intArr[i] = i+1;
				}
				else{
					intArr[i] = num-i;
				}
			}
		} // end of if(num%2 == 1)
		
		//확인용
		System.out.print("[");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
			System.out.print(i!=intArr.length-1?", ":"");
		}
		System.out.print("]");
	}
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인 양의 정수를 하나 입력하세요 ==> ");
		int num = sc.nextInt();
		
		//유효성 검사
		if(num % 2 == 0) {
		System.out.println("짝수를 입력하셨습니다. 프로그램을 종료합니다.");
		return;
		}
		
		int[] arr = new int[num];
		
		// 요소값대입용 변수
		int k = 0;
		
		for(int i = 0; i < num; i++) {
			
			if(i <= num / 2) {
				// 증가
				arr[i] = ++k;
			}
			
			else {
				// 감소
				arr[i] = --k;
			}
			
			System.out.print(arr[i] + " ");
		}
	}
}



