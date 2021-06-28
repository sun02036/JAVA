package kh.java.loop;

import java.util.Scanner;

public class HierarchicalMenuStudy {
	
	Scanner sc = new Scanner (System.in);

	public static void main (String [] args) {
		HierarchicalMenuStudy study = new HierarchicalMenuStudy ();
		study.mainMenu();
		System.out.println("--- 이용해주셔서 감사합니다. ---");
		
	}
	public void mainMenu () { // 메인 메뉴
		String mainMenu = "=== Main Menu ===\n"
				        + "1. 오늘의 식사\n"
				        + "2. 오늘의 코딩\n"
				        + "3. 오늘의 영어 한문장\n"
				        + " \n"
				        + "0. 종료\n"
				        + "=================\n"
				        + "선택: ";
		while (true) {
			System.out.print(mainMenu);
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: todayMealMenu(); break;
			case 2: todayCodingMenu(); break;
			case 3: todayEnglishMenu(); break;
			case 0: return;
			default:System.out.println("잘못 누르셨습니다.");
			}
		}
		
	}
	
	public void todayMealMenu() { // 1-1 오늘의 식사를 선택했을 때 메뉴
		String menu = "=== 오늘의 밥 ===\n"
		        + "1. 한식\n"
		        + "2. 중식\n"
		        + "3. 일식\n"
		        + " \n"
		        + "0. 메인 메뉴로 돌아가기\n"
		        + "=================\n"
		        + "선택: ";
		
		while (true) {
			System.out.println(menu);
			int choice = sc.nextInt();
			switch(choice) {
			case 1: koreanFoodMenu(); break;
			case 2: break;
			case 3: break;
			case 0: return; // return은 호출된 곳으로 돌아간다.
			default:System.out.println("잘못 누르셨습니다.");
			}
		}
	}
	
	public void koreanFoodMenu () { // 1-1-1 한식을 눌렀을 때 메뉴 
		String koreamenu = "=== 오늘의 한식 ===\n"
		        + "1. 제육볶음 정식\n"
		        + "2. 김치찌개 정식\n"
		        + "3. 육쌈냉면\n"
		        + " \n"
		        + "0. '오늘의 밥' 선택으로 돌아가기\n"
		        + "=================\n"
		        + "선택: ";
		
		while (true) {
			System.out.println(koreamenu);
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("제육볶음 정식을 선택하셨습니다.");break;
			case 2: System.out.println("김치찌개 정식을 선택하셨습니다."); break;
			case 3: System.out.println("육쌈냉면을 선택하셨습니다."); break;
			case 0: return; // return은 호출된 곳으로 돌아간다.
			default:System.out.println("잘못 누르셨습니다.");
			}
		}
	}
	
	public void todayCodingMenu() {
		
	}
	
	public void todayEnglishMenu() {
		
	}
	
	
	
	
	
}
