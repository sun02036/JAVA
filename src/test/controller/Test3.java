package test.controller;

public class Test3 {
	
	/*1부터 100까지의 모든 정수들의 합과 평균을 구하는 프로그램을 작성한다. 
	 * 단, while문이나 do while문을 이용하여 작성한다.
	 */
	
	public static void main (String [] args) {

		double a = 1.0;

		double sum = 0.0;
		double avg = 0.0;
		
		while (a <= 100) {
		sum += a;
		a++;
		avg = sum / a;
	
		}
		
		System.out.printf("합계: %.0f%n", sum);	
		System.out.printf("평균: %.1f", avg);		
	} 
}
