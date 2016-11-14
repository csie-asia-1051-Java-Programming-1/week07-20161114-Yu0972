package ex;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021045 ³¢·¶§e
 */
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		int a = scn.nextInt () ;
		System.out.println ( fun ( a ) ) ;
}
		public static int fun ( int b ) {
			if ( b == 1 ) {
				return b ;
			}else{
				return b * fun( b - 1 ) ;
		}
	}
}
