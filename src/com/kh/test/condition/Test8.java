package com.kh.test.condition;

import java.util.Scanner;

public class Test8 {
	
	public static void main (String [] args) {
	Test8 study = new Test8();
	
	study.test();
	
	}
	
	public void test() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("	********** 메  뉴 *********");	
		System.out.println("       1. 떡볶이 ---------------- 1000");	
		System.out.println("       2. 김밥 ------------------ 2000");	
		System.out.println("       3. 오뎅 ------------------ 1000");	
		System.out.println("       4. 순대 ------------------ 2000");	
		System.out.println("       5. 튀김 ------------------ 3000");	
		System.out.println("       6. 떡튀순 ------------------ 8000");
		System.out.println("	*************************");	
		System.out.println("메뉴번호 입력 : ");	
		
		int num = sc.nextInt();
		String menu = "";
		
			if(num == 1) {
			menu = "떡볶이는 1000원입니다.";
			}
			else if(num == 2) {
			menu = "김밥은 2000원입니다.";
			}
			else if(num == 3) {
			menu = "오뎅은 1000원입니다.";
			}
			else if(num == 4) {
			menu = "순대는 2000원입니다.";
			}
			else if(num == 5) {
			menu = "튀김은 3000원입니다.";
			}
			else if(num == 6) {
			menu = "떡튀순은 8000원입니다.";
			}
			else {
			menu = "번호가 잘못 입력되었습니다. 영업을 종료합니다.";
			}
			System.out.println(menu);	
					
			}
}
			
	



		
		

