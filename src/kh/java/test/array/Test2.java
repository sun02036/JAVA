package kh.java.test.array;

public class Test2 {

	public static void main (String [] args) {
		Test2 arrayTest = new Test2 ();
		arrayTest.test();
		
//	    길이가 5인 String 배열을 선언하고, 
//		"딸기", "복숭아", "키위", "사과", "바나나" 로 초기화를 한 후, 
//		배열 인덱스를 활용해서 바나나를 출력해 보세요
		
	}
	
	public void test() {
		
		// "딸기", "복숭아", "키위", "사과", "바나나" 로 초기화를 한 후, 
		String[] arr1 = {"딸기", "복숭아", "키위", "사과", "바나나"};
		
		// 배열 인덱스를 활용해서 바나나를 출력해 보세요
		for(int i = 0; i < 1; i++) {
			System.out.println(arr1[4]);
		}
		
		
	}
}