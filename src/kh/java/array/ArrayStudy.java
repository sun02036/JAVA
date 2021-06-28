package kh.java.array;

public class ArrayStudy {

	public static void main (String [] args) {
		ArrayStudy study = new ArrayStudy ();
		//study.test1();
		//study.test2();
		//study.test3();
		//study.test4();
		//study.test5();
		//study.test6();
		study.test7();
		
	}
	
//-------------------------------------------------------------------	
	
	/**
	 * 동일한 자료형이 타입의 값을 여러개 보관할 수 있는 자료형  
	 */
	
	public void test1() {
		
		// 1. 배열 변수 apple 선언 
		// int[]은 참조형 변수: 배열 객체의 주소값 보관 
		// 현재 아무런 주소값이 담기지 않았다. -> null (참조하는 주소값 없음을 나타내는 키워드)
		int [] arr; // = int arr[];
		
//-------------------------------------------------------------------		
		
		// 2. 배열 할당
		// heap 영역은 이름이 아닌 주소값으로만 참조할 수 있다.
		// heap 영역에 int 값 3개를 담을 수 있는 공간을 할당.
		// 주소값을 apple에 대입하게 됨
		arr = new int[3];

//-------------------------------------------------------------------	

		// call stack 영역과 달리 heap, static 영역의 변수 공간은 타입별 기본값으로 초기화된다.
		// 타입별 기본값이란 타입별 0에 해당하는 값 
		// → int 0, double 0.0, char ' ', boolean false , 참조형 변수 null
		
		
		System.out.println("arr[0]= " + arr[0]);
		System.out.println("arr[0]= " + arr[1]);
		System.out.println("arr[0]= " + arr[2]);
		
//-------------------------------------------------------------------	
		
		// 3. 배열 값 대입 
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
//-------------------------------------------------------------------
		
		// 4. 배열 사용
		System.out.println("apple[0]= " + arr[0]);
		System.out.println("apple[1]= " + arr[1]);
		System.out.println("apple[2]= " + arr[2]);
	
	}
	
//-------------------------------------------------------------------	
	
	/**
	 * a p p l e 를 담기 위한 문자 배열 char [] 생성하고 값 대입 
	 */
	
	public void test2() {
		
		char [] apple = new char[5]; // 선언과 배열 할당을 동시에 
		
		// 배열 크기는 생성 후 변경 불가능
		
		//배열 값 대입 
		apple[0] = 'a';
		apple[1] = 'p';
		apple[2] = 'p'; // 우항의 값을 좌항의 공간에 담아라 
		apple[3] = 'l';
		apple[4] = 'e';
		
		// 사용
//		System.out.println(apple[0]); 
//		System.out.println(apple[1]); 
//		System.out.println(apple[2]); 
//		System.out.println(apple[3]); 
//		System.out.println(apple[4]); 
		
		// 존재하지 않는 배열 인덱스를 참조할 수 없다.
		//System.out.println(apple[5]);
//		오류값 -> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

		
		// 배열의 크기를 나타내는 속성 
		System.out.println("배열의 길이 속성: " + apple.length);
		for (int i = 0; i < apple.length; i++) { // <= 넣는 실수 조심
			System.out.println(apple[i]);
			
			// 문자열 길이 - str.length()
			// 배열 길이 - arr.length
			
		}
	}
	
//-------------------------------------------------------------------
	
	/**
	 * 철수의 평가 점수를 관리
	 * 국어 80
	 * 영어 75
	 * 수학 39 
	 * 총점과 평균은?
	 */
	
	public void test3() {
		int [] subjects;
		subjects = new int[3];
		subjects[0] = 80;
		subjects[1] = 75;
		subjects[2] = 39;
		
		int sum = 0;
	
		for (int i = 0; i < subjects.length; i++) {
			sum += subjects[i];
			System.out.printf("subjects[%d] = %d, sum = %d%n", i, subjects[i], sum);
		}
		double avg = (double) sum / subjects.length;
		
		System.out.printf("총점: %d점, 평균: %.1f점%n", sum, avg);
	
	}
	
//-------------------------------------------------------------------	
	
	/**
	 * 배열 초기화: 배열 생성 및 할당, 요소별 값 세팅까지 한번에 처리
	 * 
	 * foreach문(향상된 for문)
	 * for( 배열 요소를 담을 변수 선언 : 반복 접근할 객체){
	 * 
	 * }
	 * 
	 * foreach문은 증감변수를 사용하지 않는다.
	 */
	
	public void test4 () {
	 // int [] subjects = new int [] {80, 75, 39}; // 배열 크기는 지정하지 않는다.
		int [] subjects = {80, 75, 39};
		
		for(int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i]);
		}
		
		// 증감변수를 사용하지 않는다.
		// 요소의 갯수 만큼 자동으로 반복한다.
		for( int n : subjects ) {
		System.out.println(n);
		}
	
	}
	
//-------------------------------------------------------------------
	
	/**
	 * 배열 특징
	 * 1. heap 영역에 생성된 배열(객체)을 참조형 변수에 담아 제어한다.
	 * 2. 배열은 크기 변경이 불가하다.
	 * 3. 배열 삭제는 참조변수의 주소값을 제거한다.
	 */
	
	public void test5() {
		double[] arr1 = new double[5];
		double[] arr2 = new double[5];
		
		// toString 메소드는 객체를 문자열로 사용해야 할 때 자동 호출 
//		System.out.println(arr1); // [D@5c8da962 (16진수) -> hashCode값 - 객체를 구분하기 위한 고유값
//		System.out.println(arr2.toString());	
		
		// hashCode 값만 확인
		System.out.println(arr1.hashCode()); // 10진수 
	//	System.out.println(arr2.hashCode());
		
		double[] arr3 = arr1; // arr1의 주소값을 arr3 변수 공간에 대입하라는 의미 
		
		// ** 배열은 크기 변경이 불가하다. **
		arr1 = new double[10]; // 이건 크기가 바뀐 게 아니라 수가 아예 바뀐 것 
		System.out.println(arr1.hashCode());
		System.out.println(arr3.hashCode());
		
		// -배열의 삭제-
		// 자바에서 객체의 직접 삭제는 불가능
		// 객체 참조 변수의 값을 제거
		
		arr1 = null;
		
		// 주의점: 참조변수가 null인 경우는 참조변수로부터 어떤 것도 실행할 수 없다. (메소드 실행, 속성 참조...)
		// 해결 방법: .앞의 참조 변수가 null이여서 발생하는 문제
		System.out.println(arr1.length);
	}
	
//-------------------------------------------------------------------
		
		/**
		 * 배열 복사 1 - 얕은 복사 shallow copy
		 * 배열 주소값만 복사
		 */
		
		public void test6() {
			int[] arr1 = {1, 2, 3};
			int[] arr2 = arr1;
			
			arr1[1] = 100; // 이렇게 하면 arr1의 1번값과 arr2의 1번값 모두 바뀐다.
			
			for(int i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i] + " - " + arr2[i]);
			}
	}
		
//-------------------------------------------------------------------
		
		/**
		 * 배열 복사 2 - 깊은 복사
		 * heap의 배열 객체를 복사
		 */
		public void test7() {
			int [] arr1 = {1, 2, 3, 4};
		//	int [] arr2 = new int [3]; // magic number - arr1의 길이 3이라서 3을 작성
			int [] arr2 = new int [arr1.length]; // 여기까지는 arr2 0000
			
			for (int i = 0; i < arr1.length; i++) {
				// 우항의 값을 좌항의 공간에 대입 
				arr2[i] = arr1[i]; // 
			}
			
			arr1[2] *= 100; // arr1의 2번지를 *100해서 다시 대입해라.
			
			for (int i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i] + " - " + arr2[i]);
			}
			System.out.println(arr1.hashCode()); // 1552787810
			System.out.println(arr2.hashCode()); // 1361960727
		
			
			// - System.arraycopy
			char[] name = {'홍', '길', '동'};
			char[] copy = new char[name.length];
			
			// void java.lang.System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
			// 원본 배열, 시작 인덱스, 도착 배열, 시작 인덱스, 복사할 값의 갯수
			System.arraycopy(name, 0, copy, 0, name.length);
			for(int i = 0; i < name.length; i++) {
				System.out.println(name[i] + " - " + copy[i]);
			}
			
			
			// - clone
			boolean[] bools = {true, false, true, false};
			boolean[] boolsCopy = bools.clone();
			
			for(int i = 0; i < bools.length; i++) {
				System.out.println(bools[i] + " - " + boolsCopy[i]);
			}
		
		}
}
