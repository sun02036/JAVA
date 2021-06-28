package kh.java.args;

public class ArgsStudy {

	/**
	 * 프로그램 시작 시에 사용자 입력값을 받아서 처리가 가능하다.
	 * main method의 매개변수 string[] args를 통해 확인할 수 있다.
	 * 
	 * "홍길동 39 true" -> {"홍길동", "39", "true"}
	 * 공백 기준으로 분리해서 string[]로 전달
	 * 
	 */
	
	public static void main (String [] args) {
		ArgsStudy study = new ArgsStudy();
		//study.test(args);

//		study.test(1, "hello");
//		study.test(2, "hello", "world");
//		study.test(3, "hello", "world", "byebye");
		
		study.sum(1, 2, 3);
		study.sum(5, 8);
		study.sum(1233, 45, 89, 100, 88);
	}
	
	/**
	 * 가변인자
	 * 해당 타입의 매개인자(값)를 개수 제한없이 처리할 수 있는 매개변수(공간)의 한 종류
	 * 매개변수 선언부의 마지막에만 한번 사용가능하다.
	 */
	
//	public void test(int a, String...str) {
//		
//		//String... -> String[]인 것처럼 사용가능
//		for(int i = 0; i < str.length; i++) {
//			System.out.printf("%d : %s%n", i, str[i]);
//		}
//	}
		
	public void sum(int... nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.print(nums[i]);
			System.out.print(i != nums.length - 1 ? " + " : " = ");
		}
		System.out.println(sum);
	}
//	public void test (String s) {}
//	public void test (String s1, String s2) {}
//	public void test (String s1, String s2, String s3) {}
	
//	public void test (String [] args) {
//		System.out.println(args);
//		
//		for(int i = 0; i < args.length; i++) {
//			System.out.printf("%d : %s%n", i, args[i]);
//		} 
//			
//	System.out.println("---- 종료 ----");
//	}
}
