package com.kh.test.loop;

import java.util.Scanner;

 class Test5 {

	public static void main(String[] args) {
		Test5 t5=new Test5();
		//t5.test();
		t5.test2();
		
//		3명의 회원정보를 입력 받아 저장하고 출력하는 
//		프로그램을 만드세요
//		 입력 : 이름, 나이, 주소, 키, 몸무게, 연락처
//		출력 예) 
//		================ 저장회원===============
//		1 홍길동 19세 서울시 강남구 170cm 68kg 01012345678
//		2 임걱정 20세 경기도 수원시 180cm 75kg 01012345678
//		//기능추가1
//		//출력결과 마지막행에 다음 항목에 대한 평균을 구하시오.
//		============================================
//		평균나이 00세 / 평균 키 : 00CM / 평균 몸무게 : 00kg
//	
//		//기능추가2
//		//입력할 회원 수를 입력하고 그 수 만큼 회원을 입력 받게 업그레이드 하세요
	
	}
	public void test2() {
		Scanner sc=new Scanner(System.in);
		String result = "";
		double avgAge = 0.0;
		int sumAge = 0;
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("====== " + i + " ======");
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이: ");
			int age = sc.nextInt();
			sc.nextLine(); // 버퍼의 개행문자제거 (next 다음 nextLine 사용 시)
			System.out.print("주소: ");
			String addr = sc.nextLine();
			
			
			result += i + " " + name + " " + age + "세" + addr + "\n";
			
			// 평균을 위해 누적합
			sumAge += age;
		}
		avgAge = (double)sumAge / 3;
		
		System.out.println("====== 저장회원 ======");
		System.out.println(result);
		System.out.println("평균 나이: " + avgAge);
	}
	
	public void test() {
		Scanner sc=new Scanner(System.in);
		 
		int memberNo; //회원수
		int ageSum=0; //나이합계
		int heiSum=0; //키합계
		int weiSum=0; //몸무게합계
		int ageAvg=0; //나이평균
		int heiAvg=0; //키평균
		int weiAvg=0; //몸무게평균
		
		String[] name; //이름
		int[] age; //나이
		String[] address; //주소
		int[] height; //키
		int[] weight; //몸무게
		String[] phoneNum; //전화번호
		
		
		//회원수 입력 및 저장 
		System.out.print("회원수 입력 : ");
		memberNo=sc.nextInt();
		sc.nextLine();
		
		name=new String[memberNo];
		age=new int[memberNo];
		address=new String[memberNo];
		height=new int[memberNo];
		weight=new int[memberNo];
		phoneNum=new String[memberNo];
		
		//회원정보 입력
		for(int i=0;i<memberNo;i++) {
			System.out.printf("%n[%d]번째 회원정보를 입력해주세요.%n",i+1);
			System.out.print("이름 : ");
			name[i]=sc.nextLine();
			
			System.out.print("나이 : ");
			age[i]=sc.nextInt();
			sc.nextLine();
			
			System.out.print("주소 : ");
			address[i]=sc.nextLine();
			
			System.out.print("키 : ");
			height[i]=sc.nextInt();
			sc.nextLine();
			
			System.out.print("몸무게 : ");
			weight[i]=sc.nextInt();
			sc.nextLine();
			
			System.out.print("전화번호 : ");
			phoneNum[i]=sc.nextLine();
		}
		//회원정보 출력
		System.out.println("\n================ 저장회원===============");
		for(int i=0;i<memberNo;i++) {
			System.out.printf("%d %s %d세 %s %dcm %dkg %s\n",(i+1),name[i],age[i],address[i],height[i],weight[i],phoneNum[i]);
			ageSum+=age[i];
			heiSum+=height[i];
			weiSum+=weight[i];
		}
		
		//평균 나이,키,몸무게 계산 
		ageAvg=ageSum/memberNo;
		heiAvg=heiSum/memberNo;
		weiAvg=weiSum/memberNo;		
		
		System.out.println("\n======================================");
		System.out.printf("평균나이 %d세 / 평균 키 : %dCM / 평균 몸무게 : %dkg",ageAvg,heiAvg,weiAvg);
	}
}