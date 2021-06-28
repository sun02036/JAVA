package com.kh.test.loop;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Test6 t6= new Test6();
		t6.test();
	}
	
	public void test() {
		Scanner sc=new Scanner(System.in);
		 
		int pdSum = 0; // 상품 가격 합
		int pdAvg = 0; // 상품 가격 평균 
		
		String[] id; //상품id
		String[] kind; //종류
		String[] name; //상품명
		int[] price; //가격
		
		
		//회원수 입력 및 저장 
		System.out.print("저장할 상품 갯수 입력 : ");
		int ProductNum = sc.nextInt();
		sc.nextLine();
		
		id = new String[ProductNum];
		kind = new String[ProductNum];
		name = new String[ProductNum];
		price = new int[ProductNum];

		
		//회원정보 입력
		int i = 0;
		while (i < ProductNum) {

		System.out.printf("%n[%d]번째 상품 정보를 입력해주세요.%n",i+1);
		
		System.out.print("ID : ");
		id[i]=sc.next();
		
		System.out.print("종류 : ");
		kind[i]=sc.next();
			
		System.out.print("상품명 : ");
		name[i]=sc.next();
			
		System.out.print("가격 : ");
		price[i]=sc.nextInt();
		sc.nextLine();
		i++;

		}
		//회원정보 출력
		System.out.println("\n================ 저장 상품 ===============");
		int y=0;
		while(y<ProductNum) {
			System.out.printf("%s %s %s %d만원\n",id[y],kind[y],name[y],price[y]);
			pdSum+=price[y];
			y++;
		}
		
		//평균 나이,키,몸무게 계산 
		pdAvg = (int) ((double)pdSum / ProductNum);
		System.out.println("=======================================\n");
		System.out.printf("평균 상품가격: %d만원", pdAvg);
	}
}

