package kh.java.array.sort;

import java.util.Arrays;

public class ArraySortStudy {
	public static void main (String [] args) {
		ArraySortStudy study = new ArraySortStudy();
		//study.test1();
		//study.test2();
		study.test3();
}
	
//----------------------------------------------------------
	
	/**
	 * 변수의 값 교환
	 */
	
	public void test1() {
	
	// a와 b의 값을 바꿔라 
		
	int a = 10;
	int b = 20;
	
	int temp = a; // a의 값을 여기로 피신 
	a = b;
	b = temp;
	
	System.out.println("a = " + a);
	System.out.println("b = " + b);	
	
	
	// 배열에서 값 교환 
	// 213 -> 123으로
	int [] arr = {2, 1, 3};
	System.out.println(Arrays.toString(arr));
	
	swap(arr, 0, 1);
//	temp = arr[0];
//	arr[0] = arr[1];
//	arr[1] = temp;
	
	// 배열 요소 확인
	System.out.println(Arrays.toString(arr));
	}
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
//----------------------------------------------------------	

	/**
	 * 정렬 알고리즘
	 * - 시공간 효율성: 시간이 얼마나 걸리는가? 공간(Ram Memory)을 얼마나 사용하는가?
	 * 
	 * 1. 순차 정렬
	 * 2. 선택 정렬
	 * 3. 버블 정렬
	 * 4. 삽입 정렬
	 * 5. 퀵 정렬
	 * 6. 합병 정렬
	 * ...
	 */
	
	
	/*
	 * 순차 정렬
	 * Sequential Sort
	 * 회차에 해당하는 index에 알맞은 수를 찾음 
	 */
	
	public void test2() {
		int [] arr = {5,4,1,3,2};
		
		// i = 0, 1, 2, 3 (마지막은 자동으로 정렬됨 그래서 -1)
		for (int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) // i가 j보다 크다면
					swap(arr, i, j); // 자리를 바꿔줘
				
				print(i, arr);
			}
		}
		
	}
	
	public void print(int i, int[] arr) {
		System.out.printf("%d: %s%n", i, Arrays.toString(arr));
	}
	
	/**
	 * 선택 정렬
	 * Selection Sort
	 * 매 회차에 최소값을 찾고, 마지막에 자리 교환이 일어나는 것 
	 * 순차 정렬보다 자리 교환수가 훨씬 적음 
	 */
	
	public void test3() {
		int [] arr = {5,4,1,3,2};
		
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i; // 최소값 인덱스
			for (int j = i + 1; j < arr.length; j++) {
				if ( arr[min] > arr [j])
					min = j;
				print(i, arr);
			}
			System.out.println("min = " + min); // 최소값
			swap(arr, min, i);
			System.out.println();
		}print(0, arr);
	}
	

}
