package com.kh.test.nested.loop;


public class StarTest {
	public static void main ( String [] args ) {
		StarTest study = new StarTest ();
		study.test1();
		study.test2();
		
	}
	
	public void test1() {
		for (int i = 0; i < 5; i ++) {
			for (int j = 0 ; j < 5; j++) {
				if ( j >= i )
				System.out.print("*");
			}System.out.println();
		}System.out.println(" ");
	}
	
	
	
	public void test2() {
		for (int i = 0; i < 5; i ++) {
			for (int j = 0 ; j < 5; j++) {
				if ( j <= i )
				System.out.print("*");
			}System.out.println();
		}System.out.println(" ");
	}
	

}

	
		
		
	



