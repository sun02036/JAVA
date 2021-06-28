package com.kh.test.loop;

import java.util.Scanner;

import kh.java.loop.ForStudy;

public class Test1 {
	public static void main (String [] args) {
		Test1 study = new Test1();
		
		study.test1();
	
//		1부터 사용자로부터 입력 받은 정수까지 존재하는 짝수의 합을 출력하세요. 
//	 	(for문 활용)
	}
	public void test1() {
		
	int sum = 0;
	Scanner sc = new Scanner(System.in) ;
	System.out.print("수를 입력하세요: ");
	int num = sc.nextInt();

	for (int i = 1; i < num; i++) {
		if(i % 2 == 0) {
			System.out.println(i);	
		}
	}
		}
}


