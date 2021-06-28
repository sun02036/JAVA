package com.kh.test.loop;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Test8 study = new Test8();
		study.test();
		
	}

	public void test() {
		// 분식집 주문 받는 프로그램 만들기
		
		Scanner sc = new Scanner(System.in);
		char yn = 'y';
		String menu = "        ==========메뉴========\n"
				+ "	김밥류 =================\n"
				+ "	1.원조김밥===========1500원\n"
				+ "	2.치즈김밥===========2000원\n"
				+ "	3.참치김밥===========2300원\n"
				+ "	라면류 ===================\n"
				+ "	4.그냥라면===========3000원\n"
				+ "	5.치즈라면===========3500원\n"
				+ "	6.짬뽕라면===========4000원\n"
				+ "	분식류 ===================\n"
				+ "	7.떡볶이=============2500원\n"
				+ "	8.순대==============2500원\n"
				+ "	9.오뎅==============1000원\n"
				+ "	기타 ====================\n"
				+ "	10.음료수===========1000원\n";
		
		int sum = 0; // 더한 각 가격들을 넣을 공간
		int totalPrice = 1;
		int price = 0; // 각 가격을 넣을 공간
		int total = 0; // 총 가격을 더한 값을 넣을 공간
		String result = " ";
		
		// 반복실행
		do {
			System.out.print(menu + "메뉴이름입력 : ");
			String choice = sc.next();
			
			switch(choice) {
			case "원조김밥" : price = 1500; break;
			case "치즈김밥" : price = 2000; break;
			case "참치김밥" : price = 2300; break;
			case "그냥라면" : price = 3000; break;
			case "치즈라면" : price = 3500; break;
			case "짬뽕라면" : price = 4000; break;
			case "떡볶이" : price = 2500; break;
			case "순대" : price = 2500; break;
			case "오뎅" : price = 1000; break;
			case "음료수" : price = 1000; break;
			}
			
			System.out.print("수량선택 : ");
			int amount = sc.nextInt();
			
			totalPrice = price * amount;
			total += totalPrice;
			
			result += choice + ": " + amount + "개 - " + totalPrice + "원\n"; 
			
			System.out.print("추가주문하시겠습니까? (y/n) : ");
			yn = sc.next().charAt(0);
			if (yn == 'n') {
				System.out.printf("==========결과==========%n"
						        + "주문하신 정보는 다음과 같습니다.%n"
						        + "-----------------------%n"
						        + "%s%n"
						        + "-----------------------%n", result);
						       
			}
		}
		while(yn == 'y');
		
		System.out.printf("합계 : %d원", total);
		
	}
}

    
