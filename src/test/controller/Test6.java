package test.controller;

import java.util.Scanner;

public class Test6 {
	
	/* 
	 * 1부터 5까지의 숫자와 그 이외의 숫자가 입력되었을 때 아래와 같이 출력된다. 
	 * 1 : ** 입력이 정상적으로 되었습니다! ** 
	 * 2 : ** 조회가 시작되었습니다! ** 
	 * 3 : ** 수정이 정상적으로 되었습니다! ** 
	 * 4 : ** 삭제가 정상적으로 되었습니다! ** 
	 * 5 : ** 정상적으로 종료 되었습니다! ** 
	 * 1~5가 아닌 값이 입력 된 경우 : ** 다시 입력해 주세요! **
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: System.out.println("** 입력이 정상적으로 되었습니다! ** "); break;
		case 2: System.out.println("** 조회가 시작되었습니다! **"); break;
		case 3: System.out.println("** 수정이 정상적으로 되었습니다! **"); break;
		case 4: System.out.println("** 삭제가 정상적으로 되었습니다! **"); break;
		case 5: System.out.println("** 정상적으로 종료 되었습니다! ** "); break;
		default: System.out.println("** 다시 입력해 주세요! **"); break;
		}

	}
}

