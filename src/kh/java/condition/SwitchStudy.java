package kh.java.condition;

import java.util.Scanner;

/**
 * switch는 값에 따라 코드의 흐름을 분기함
 * 
 * - 값의 타입은 byte, short, char, int, Strung, enum으로 한정됨 
 * (boolean, long, float, double 불가함)
 * 
 * switch(변수 또는 계산식) {
 * case 값1: 실행문; break;
 * case 값2: 실행문; break;
 * ...
 * default: 실행문;
 * }
 * 
 * break의 의미: 현재 블럭을 탈출해라
 */

public class SwitchStudy {
public static void main (String [] args) {
	SwitchStudy study = new SwitchStudy ();
	// study.test1();
	//study.test2();
	//study.test3();
	//study.test4();
	study.test5();
	
	System.out.println("  ");
	System.out.println("----- 프로그램 종료 -----");
	}
	
	public void test1() {
		Scanner sc = new Scanner (System.in);
		System.out.print("좋아하는 과일을 선택하세요. 1. 사과 2. 바나나 3. 오렌지 4. 키위 > ");
		int num = sc.nextInt();
	
		// break가 없으면, fall through로 처리된다.
	
		switch(num) {
		case 1: System.out.println("사과는 빨간색입니다."); 
		System.out.println("사과 좋아요!");
		break;
		case 2: System.out.println("바나나는 노란색입니다."); break;
		case 3: System.out.println("오렌지는 주황색입니다."); break;
		case 4: System.out.println("키위는 갈색입니다."); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner (System.in);
		String menu = "====================\n"
				    + "가. 순대국 ------- 8000\n"
				    + "나. 곰국 -------- 9000\n"
				    + "다. 김치국 ------- 7000\n"
				    + "====================\n"
				    + "선택: ";
		System.out.print(menu);
		
		char userSelect = sc.next().charAt(0);
		int price = 0;
		switch(userSelect) {
		case '가': price = 8000; break;
		case '나': price = 9000; break;
		case '다': price = 7000; break;
		default: System.out.println("잘못 입력하셨습니다."); return;
		}
		System.out.printf("결제 금액은 [%d]원입니다.%n", price);
	}
	
	public void test3 () {
		Scanner sc = new Scanner(System.in);
		String userSelectMenuStr = "";
		int total = 0;
		//주메뉴선택후 처리
		String mainmenu = "*********주메뉴*********\n"
					+ "a. 불고기버거 ------------ 5000\n"
					+ "b. 새우버거 -------------- 4000\n"
					+ "c. 치킨버거 -------------- 4500\n"
					+ "d. 한우버거 -------------- 10000\n"
					+ "e. 디버거 --------------- 7000\n"
					+ "***********************\n"
					+ "버거 메뉴 번호를 입력하세요 => "; 
		System.out.print(mainmenu);
		char mainSelect = sc.next().charAt(0);
		String menuName = "";
		int price = 0;
		
		switch(mainSelect) {
		case 'a': menuName += "불고기버거, "; price += 5000; break;
		case 'b': menuName += "새우버거, "; price += 4000; break;
		case 'c': menuName += "치킨버거, "; price += 4500; break;
		case 'd': menuName += "한우버거, "; price += 10000; break;
		case 'e': menuName += "디버거, "; price += 7000; break;
		default: System.out.println("잘못 입력하셨습니다."); return;
		}
		
		//사이드메뉴선택후 처리
		String sidemenu = "*******사이드메뉴********\n"
				+ "1. 콜라 ------------------- 1500\n"
				+ "2. 사이다 ------------------ 1500\n"
				+ "3. 밀크쉐이크 --------------- 2500\n"
				+ "4. 레드불 ------------------ 3000\n"
				+ "***********************\n"
				+ "사이드 메뉴 번호를 입력하세요 => "; 
		System.out.print(sidemenu);
		//int sideSelect = sc.nextInt(); // 문자열을 읽어와서 (1), int로 형변환 (2)
		
		String sideSelectStr = sc.next();
		// 숫자인지 검사
		char ch = sideSelectStr.charAt(0);
		if (!Character.isDigit(ch)) {
			System.out.println("숫자를 입력하셔야 합니다.");
			return;
		}
		int sideSelect = Integer.parseInt(sideSelectStr); // 문자열을 읽어와서 (1)
		
		
		
		switch(sideSelect) {
		case 1: menuName += "콜라"; price += 1500; break;
		case 2: menuName += "사이다"; price += 1500; break;
		case 3: menuName += "밀크쉐이크"; price += 2500; break;
		case 4: menuName += "레드불"; price += 3000; break;
		default: System.out.println("잘못 입력하셨습니다."); return;
		}
		
		System.out.printf("선택하신 메뉴는 [%s]이고, 총금액은 [%d]원입니다.", menuName, price);
		}
	
	/**
	 * 90~100 A 
	 * 	90 91 92 93 ... - 점수 / 10 == 9, 점수 / 10 == 10
	 * 
	 * 80~89 B
	 * 	80 81 82 83 ... - 점수 / 10 == 8
	 * ...
	 */
	
	public void test4() {
		Scanner sc = new Scanner (System.in);
		System.out.println("점수를 입력하세요: ");
		int num = sc.nextInt();
		char grade = ' ';
		
		switch(num / 10) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		System.out.printf("점수: %d, 학점: %c%n", num, grade);
	}
	
	/**
	 * switch의 fall-through 사용
	 * 
	 * VIP: TV, 전자렌지, 휴지
	 * GOLD: 전자렌지, 휴지
	 * SILVER: 휴지 
	 */
	
	public void test5() {
		Scanner sc = new Scanner (System.in);
		System.out.println("회원등급을 입력하세요 (1. VIP | 2. GOLD | 3. SILVER): ");
		int membership = sc.nextInt();
		
		String present = "";
		switch(membership) {
		case 1: present += "TV, "; 
		case 2: present += "전자렌지, "; 
		case 3: present += "휴지"; break;
		default: System.out.println("잘못 입력하셨습니다."); return;
		}
		System.out.printf("[%s]를 증정합니다.%n", present);
	}
		
	
} // main

	    
	

