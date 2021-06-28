package com.kh.test.loop;

import java.util.Scanner;

import kh.java.loop.ForStudy;

public class Test2 {
	public static void main (String [] args) {
		Test2 study = new Test2();
		
		//study.test2();
		study.test2();
		
//		정수를 입력 받아 1부터 입력 받은 정수까지 수를 
//		홀수와 짝수를 나눠서 홀수면 "수", 짝수면 "박"을 
//		출력 하세요.
//	  	예) 4입력 : 수박수박 / 5입력 : 수박수박수 출력

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
			
		for(int odd = 1; odd <= num; odd++) {
			
			if(odd % 2 == 1) {
				System.out.print("수");
				}
			else if(odd % 2 == 0) {
				System.out.print("박");
			   }
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		String result = "";
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			if(i % 2 !=0 ) {
				result += "수";
			}
			else {
				result += "박";
			}
		}
		System.out.println(result);
	}
}