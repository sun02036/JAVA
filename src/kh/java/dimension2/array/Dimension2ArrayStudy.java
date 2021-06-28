package kh.java.dimension2.array;

public class Dimension2ArrayStudy {

	public static void main (String [] args) {
		Dimension2ArrayStudy study = new Dimension2ArrayStudy ();
		//study.test1();
		//study.test2();
		//study.test3();
		//study.test4();
		//study.test5();
		//study.test6();
		study.test7();
	
	}
	
	public void test1() {
		
		// 1. 2차원 배열 변수를 선언
		int [][] arr;
		
//------------------------------------------------------—
		
		// 2. heap에 배열 객체 할당
		arr = new int [2][3];
		
//------------------------------------------------------—		

		// 3. 값 대입
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
//------------------------------------------------------—
		
		// 4. 확인
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		
		for (int i = 0; i < 2; i++) { // 행
			for(int j = 0; j < 3; j++) { //열
				System.out.println(arr[i][j]);
			}
		}
		
	}
	
//------------------------------------------------------—
	
	/**
	 * 우리반 2차원 배열 
	 */
	
	public void test2() {
		
		String[][] myClassmates = new String [5][6];
		
		myClassmates[0][0] = "최형구";
		myClassmates[0][1] = "이진표";
		myClassmates[0][2] = "최선영";
		myClassmates[0][3] = "김다현";
		myClassmates[0][4] = "권혜진";
		myClassmates[0][5] = "장영인";
		
		myClassmates[1][0] = "민태영";
		myClassmates[1][1] = "정예주";
		myClassmates[1][2] = "김경태";
		myClassmates[1][3] = "오채아";
		myClassmates[1][4] = "권나영";
		myClassmates[1][5] = "최지원";
		
		myClassmates[2][0] = "김진우";
		myClassmates[2][1] = "김태은";
		myClassmates[2][2] = "김은희";
		myClassmates[2][3] = "지수진";
		myClassmates[2][4] = "유지우";
		myClassmates[2][5] = "백지영";
		
		myClassmates[3][0] = "염진기";
		myClassmates[3][1] = "김정현";
		myClassmates[3][2] = "박종서";
		myClassmates[3][3] = "이윤희";
		myClassmates[3][4] = "유광현";
		myClassmates[3][5] = "이찬영";
		
		myClassmates[4][0] = "강구진";
		myClassmates[4][1] = "박수빈";
		myClassmates[4][2] = "임광수";
		myClassmates[4][3] = "염지영";
		myClassmates[4][4] = "정예리";
		myClassmates[4][5] = "고승완";

		for (int i = 0; i < myClassmates.length; i++) { // 행
			for(int j = 0; j < myClassmates[i].length; j++) { //열
				System.out.println(myClassmates[i][j]);
			}
			System.out.println();
		}
	}
	
//------------------------------------------------------—	
	
	/**
	 * 규칙적인 값이 연속되는 배열의 값 대입 
	 */

	// 10, 20, 30, 40, 50
	public void test3() {
		
//		int [] arr = new int [5];
//		int k = 10;
//		for (int i = 0; i < 5; i++) {
//			arr[i] = k;
//			k += 10;
//			System.out.println(i + ": " + arr[i]);
	
	// 10 20 30
	// 40 50 60 
		
		int [][] arr = new int [2][3];
		int x = 10; // x가 유지될 수 있는 건 반복문 밖에 있어서 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = x;
				x += 10;
				System.out.print(arr[i][j] + " ");
			}
			
		System.out.println(" "); // 개행 
		
		}
	}
	public void test4() {

//------------------------------------------------------—
	
	/**
	 * @실습문제: 알파벳 배열 2*26
	 */

	int[][] alpha = new int [2][26];
	char [][] arr = new char [2][26];
	char x = 65;
	char z = 71;
	
	
	for (int i = 0; i < alpha.length; i++) {
		
		for (int j = 0; j < alpha[i].length; j++) {
				
			arr[0][j] = x;
			x += 1; 
			
			arr[1][j] = z;
			z += 1; 
			
			System.out.print(arr[i][j] + " "); continue;
			
			} System.out.println(" "); // 개행 
		}
	}
	
//------------------------------------------------------—	
	// 강사님 풀이
	
	public void test5() {
		char[][] alphabet = new char[2][26];
		for(int i = 0; i < alphabet.length; i++) {
			for(int j = 0; j < alphabet[i].length; j++) {
				if(i == 0) {
					alphabet[i][j] = (char)('A' + j);
				}
				else {
					alphabet[i][j] = (char)('a' + j);
				}
				System.out.print(alphabet[i][j] + " ");
			}
			System.out.println();
		}
		
		// foreach문으로 열람하기
		
		for(char[] arr : alphabet) { // 2차원인데 1차원에 담고
			for(char ch : arr) { //그걸 또 다시 반복해서 
				System.out.print(ch + " "); // 꺼내는 구조 
			}
			System.out.println();
		}
	}
	
//------------------------------------------------------—
	
/**
 * 2차원 배열 초기화
 * 2차원 배열 객체 생성 및 값 대입을 한번에 끝내는 것
 */
	public void test6() {
		//int [][] arr = new int [][] {{1,2,3},{4,5,6}};
		int [][] arr = {{1,2,3},{4,5,6}}; // 위랑 같은 것
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
			} System.out.println();
		}
	
	
	char [][] charr = {{'a','b'},{'가','나'}};
	System.out.print(charr[0][0]);
	System.out.print(charr[0][1]);
	System.out.print(charr[1][0]);
	System.out.print(charr[1][1]);
	}

//------------------------------------------------------—	
	
/**
 * 가변 배열
 * 2차원 배열의 길이를 임의로 지정하는 것. 길이가 같지 않아도 됨.
 */
	
	public void test7 () {
		
	// 1. 1차원 배열만 생성 - 현재까지 값은 null
	int [][] arr = new int [3][];
	
	// 2. 2차원 배열 생성 - 자리만 만들어준 것이고, 현재까지 값은 0
	arr[0] = new int [4];
	arr[1] = new int [2];
	arr[2] = new int [3];
	
	System.out.println(arr);
	
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	
	// 3. 값 대입 
	
	for (int i = 0, k = 1; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			arr[i][j] = k++;
			System.out.print(arr[i][j] + " ");
			
			}System.out.println();
		}
	}

}

