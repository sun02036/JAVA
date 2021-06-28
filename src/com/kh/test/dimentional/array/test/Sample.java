package com.kh.test.dimentional.array.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sample {
public static void main (String [] args ) {
	Sample study = new Sample ();
	//study.exercise1();
	study.exercise2();
	//study.ex1();
	//study.ex2();
	
	/*  
	 	1. 	1. 3행짜리 2차원배열 선언 및 생성	
		2. 각 행별 열갯수는 키보드로 입력받아 생성함
		3. 1~100사이의 임의의 정수를 모든 방에 기록함
		4. 각 행별 열의 합계가 5의 배수인 행열값만 출력함
	 */
}

	public void exercise1() {
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random ();
		int num1 = (int)(rnd.nextInt(100) + 1);
		
		System.out.println("생성할 열의 수를 입력하세요: ");
		int num = sc.nextInt();
		
		int [][] random = new int [3][num];
		
		for (int i = 0; i < random.length; i++) {
			
			for (int j = 0; j < random[i].length; j++) {
				
				random[i][j] = (int)(rnd.nextInt(100) + 1);
		
				System.out.print(random[i][j] + " ");	
					
			
			} 	System.out.println(" "); // 개행 
		}
	}
	
	public void exercise2() {
		
		/*
		 * 	1. 3행4열 2차원배열 선언 및 생성
			2. 0행 0열부터 2행 2열까지 
			   1부터 100사이의 임의의 정수값 기록해 넣음
			3. 아래의 내용처럼 처리함
			0열	1열	2열	3열	
			0행	값	값	값 	0행 값들의 합계
			1행	값	값	값	1행 값들의 합계
			2행	값	값	값	2행 값들의 합계
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random ();
		int num1 = (int)(rnd.nextInt(100) + 1);

		int [][] threeFour = new int [3][4];
		
		for (int i = 0; i < threeFour.length; i++) {

			for (int j = 0; j < threeFour[i].length; j++) {
			
				
				threeFour[i][j] = (int)(rnd.nextInt(100) + 1);
		
				threeFour[0][3] = (threeFour[0][0] + threeFour[0][1] + threeFour[0][2]);
				threeFour[1][3] = (threeFour[1][0] + threeFour[1][1] + threeFour[1][2]);
				threeFour[2][3] = (threeFour[2][0] + threeFour[2][1] + threeFour[0][2]);
						
						System.out.print(threeFour[i][j] + " ");
					}System.out.println(" "); 
				
				
				}
				
				
			}
	
//------------------------------------------------------—	
	
	/*
	 * 강사님 풀이 
	 */
	
	private void ex1() {
		
		int[][] arr = new int[3][5];
		
		//1. 값쓰기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*100)+1;
			}
		}
		
		//2. 각행의 열의 수의 합이 5의 배수인지 검사
		//열의 합이 5의배수여부를 검사할 count변수 셋팅.
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int rowsum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				rowsum += arr[i][j];
			}
			//2. 5의배수여부 검사&출력
			if(rowsum % 5 == 0){
				count++;
				//출력
				for(int k = 0; k < arr[i].length; k++) {
					System.out.print(arr[i][k] + " ");
				}
				System.out.println(" -> 열의합계: "+rowsum);
			}
		}
		
		
		//5의배수인 열이 없을경우
		if(count==0) System.out.println("열의 합계가 5의 배수인 행이 없습니다");

		//생성된 난수배열 출력
		System.out.println("============================");
		System.out.println("arr[0]="+Arrays.toString(arr[0]));
		System.out.println("arr[1]="+Arrays.toString(arr[1]));
		System.out.println("arr[2]="+Arrays.toString(arr[2]));
		System.out.println("============================");
	}
	
	/**
	 * 1. 4행4열 2차원배열 선언 및 생성
	 * 2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
	 * 3. 아래의 내용처럼 처리함
     * 
     * <li> 		0열	1열	2열	3열</li>	
     * <li>0행	값	값	값 	0행 값들의 합계</li>
     * <li>1행	값	값	값	1행 값들의 합계</li>
     * <li>2행	값	값	값	2행 값들의 합계</li>
     * <li>3행	0열합계	1열합계	2열합계	가로+세로합계</li>
	 * 
	 * 
	 */
	
	/**
	 * 1. 3행 4열 2차원 배열 생성
	 * 2. 난수 대입
	 * 3. 행별 난수의 합을 구함
	 * 4. 4행 추가 및 열별 누적합 변수 선언 ex) int col0Sum = 0;...
	 * 5. 
	 */
	
	 public void ex2() {
	Random rnd = new Random();
	
	int[][] arr = new int[4][4];
	
	int col0Sum = 0;
	int col1Sum = 0; // 행 위에서 변수 선언해야 열의 합의 값 초기화 안됨 
	int col2Sum = 0;
	
	for(int i = 0; i < arr.length; i++) {
		
		int rowSum = 0; // 행의 누적합 변수. 행마다 초기화되어야 한다.
		
		for(int j = 0; j < arr[i].length; j++) {
			
			if(i < arr.length - 1) {
				// 난수 대입 행
				// 마지막 열의 index : 열의 수(arr[i].length) - 1
				
				if(j < arr[i].length - 1) {
					// 난수 대입
					arr[i][j] = rnd.nextInt(100) + 1;
					
					rowSum += arr[i][j];
					
					switch(j) {
					case 0: col0Sum += arr[i][j]; break; 
					case 1: col1Sum += arr[i][j]; break; 
					case 2: col2Sum += arr[i][j]; break; 
					}
					
				}
				else {
					// 마지막 열 : 각 행의 합 대입
					arr[i][j] = rowSum;
				}
			}
			else {
				// 마지막 행
				switch(j) {
				case 0: arr[i][j] = col0Sum; break;
				case 1: arr[i][j] = col1Sum; break;
				case 2: arr[i][j] = col2Sum; break;
				}
			}
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
}
	

}

		
		


		
	



		
		
		
		
		
		
		
	

