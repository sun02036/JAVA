package array;

import java.util.Arrays;

public class Test10 {
	
	/* 
	 * 2차원 배열에 들어있는 데이터들 중 
	 * 3의 배수만 골라내서 
	 * 새로운 1차원배열에 기록하고 출력한다. 
	 * 단 중복 값은 하나만 기록되게 한다.
	 */
	
	public static void main (String [] args) {
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
		
		int[] copyAr = new int[array.length * array.length];
		int k = 0;
		System.out.print("copyAr: ");
		
		green:
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				int n = array[i][j];
				if (array[i][j] % 3 == 0) {
					for (int m = 0; m < k; m++) {
						if(copyAr[m] == n) 
							continue green;
					}
					copyAr[k++] = n;
				
					
				}
			
			}
		}
		System.out.println(Arrays.toString(copyAr));
	}
}