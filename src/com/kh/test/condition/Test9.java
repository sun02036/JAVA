package com.kh.test.condition;

import java.util.Scanner;

public class Test9 {
	
	public static void main (String [] args) {
	Test9 study = new Test9();
	
	study.test();
	
	}
	
	public void test() {
		Scanner sc = new Scanner (System.in);
		System.out.println("********* 주메뉴 *********");	
		printMenu("a", "불고기버거", 5000);  
		printMenu("b", "새우버거", 4000);
		printMenu("c", "치킨버거", 4500);
		printMenu("d", "한우버거", 10000);
		printMenu("e", "디버거", 7000);
		System.out.println("***********************	");
		System.out.println("   ");	
		System.out.println("********* 사이드메뉴 *********");	
		printMenu("1", "콜라", 1500);  
		printMenu("2", "사이다", 1500);
		printMenu("3", "밀크쉐이크", 2500);
		printMenu("4", "레드불", 3000);
		System.out.println("***********************	");
		System.out.print("주메뉴 번호 입력 : ");	
	    char mm = sc.next().charAt(0);
		System.out.print("사이드메뉴 번호 입력 : ");	
		int sm = sc.nextInt();
		
		String mn = "";
		String sn = "";
		
		int mp = 0;
		int sp = 0;
		
		String ms = "";
		String ss = "";
			
			if(mm == 'a') {
			mn = "불고기버거";
			mp = 5000;
			}
			else if(mm == 'b') {
			mn = "새우버거";
			mp = 4000;
			}
			else if(mm == 'c') {
			mn = "치킨버거";
			mp = 4500;
			}
			else if(mm == 'd') {
			mn = "한우버거";
			mp = 10000;
			}
			else if(mm == 'e') {
			mn = "디버거";
			mp = 7000;
			}
			
			if(sm == 1) {
			sn = "콜라";
			sp = 1500;
			}
			else if(sm == 2) {
			sn = "사이다";
			sp = 1500;
			}
			else if(sm == 3) {
			sn = "밀크쉐이크";
			sp = 2500;
			}
			else if(sm == 4) {
			sn = "레드불";
			sp = 3000;
			}
				
			
		if (mm == 'a' || mm == 'b' || mm == 'c' || mm == 'd' || mm == 'e' || sm == 1 || sm == 2 || sm == 3 || sm != 4 ){
		int sum = mp + sp;
		System.out.println("  ");
		System.out.printf("%s, %s는 총 %d원입니다.", mn, sn, sum);
		}
			
		else if (mm != 'a' || mm != 'b' || mm != 'c' || mm != 'd' || mm != 'e' || sm != 1 || sm != 2 || sm != 3 || sm != 4 ){
		System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
		}
			
	}

	public void printMenu(String number, String name, int price) { 
			
	System.out.printf("%s. %s ------------ %d%n", number, name, price);
	}
}