package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main (String [] args) {
		Test1 study = new Test1();
		
		study.test1();
		study.test2();
		
	}
	
		public void test1() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("정수 입력: ");
			int num = sc.nextInt();
			
			int i = 1;
			int m = 1;
			while(i <= num) {
				if(i % 2 != 0)
					m *= i;
				i++;	
				continue;
					
			}
			
			System.out.print(m + " ");	
		}
		
		public void test2() {
			// 정수를 두 개 입력 받아서 작은 정수에서 큰 정수까지의 홀수의 합을 구하세요.
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 한개 입력: ");
			int big = sc.nextInt();
			
			System.out.print("다른 정수 한개 입력: ");
			int small = sc.nextInt();
			
			int sumOdd = 0; // 홀수들의 합을 넣을 공간
			
			if( big < small) {
				for(int i = big; i <= small; i++ ) {
					if(i % 2 == 1) {
						sumOdd += i;
						continue;
					}
				}
				System.out.println("=====================\n");
				System.out.printf("%d부터 %d까지의 홀수의 합은 %d입니다.", big, small, sumOdd);
			}
			
			else {
				for(int i = small; i <= big; i++ ) {
					if(i % 2 == 1) {
						sumOdd += i;
						continue;
					}
				}
				System.out.println("=====================\n");
				System.out.printf("%d부터 %d까지의 홀수의 합은 %d입니다.", small, big, sumOdd);
			}
		}
}