package array;

public class Test9 {
	
	/* 
	 * 2차원 배열에 들어있는 데이터중 가장 큰 값과 가장 작은 값을 구한다.
	 */
	
	public static void main (String [] args) {
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		
		int max = array[0][0];
		int min = array[0][0];
		
		for (int i = 0; i < array.length; i++) {
			for ( int j = 0; j < array.length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
				else if (array[i][j] < min) {
					min = array[i][j];
				}
			} 
			
		}System.out.println("가장 큰 값: " + max);
		System.out.println("가장 작은 값: " + min);
		
	}
}
		
	

	
	

