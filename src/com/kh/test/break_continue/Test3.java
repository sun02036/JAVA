package com.kh.test.break_continue;

import java.util.Arrays;
import java.util.Scanner;

/*
 	 2보다 큰 정수를 입력 받고, 입력 받은 정수가 소수이면 “소수다“, 
 	 소수가 아니면 “소수가 아니다.” 출력하고 프로그램을 종료하는 코드를 작성하세요.

	단, 입력 받은 정수가 2보다 작은 경우 
	“잘못 입력하셨습니다. 다시 입력하세요.” 출력 후 다시 정수를 입력 받도록 하세요.

 	** 소수란? : 어떠한 정수를 1부터 자기 자신까지로 나누었을 때, 
 	나누어 떨어지는 수가 1과 자기 자신 뿐인 수를 소수라고 한다.

*/
public class Test3 {
	
	public static void main(String[] args){
		new Test3().test1();
	}
	
	public void test1(){
		Scanner sc = new Scanner(System.in);
				
		while(true){
			System.out.print("2보다 큰 정수를 입력하세요 ==> ");
			int num = sc.nextInt();
			
			//소수여부 
			//우선 소수라 가정하고, 소수가 아닌 상황에서 false값 대입.
			boolean flag = true;
			
			if (num <= 2) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}
			
			//홀/짝수여부
			//짝수인 경우
			if(num % 2 == 0){
				flag = false;
			}
			//홀수인경우
			else{
				//3부터 2씩증가하는 수(홀수)로 차례로 나누어본다.
				//나누어지는 수가 있으면, 소수가 아니다.
				//나누어 지는 수가 없으면, 1과 본인밖에 약수가 없으므로 소수이다.
				for (int i = 3; i < num / 2; i = i + 2) {
					if(num % i == 0){
						flag = false;
						break;
					}
				}
			}
			
			if(flag) System.out.println("소수입니다.");
			else System.out.println("소수가 아닙니다.");
			break;
		} 
	}
}

    
