package ex;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021045 ³¢·¶§e
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		System.out.print ( "¿é¤J¤@­Ón=" ) ;
		int a = scn.nextInt();
		int b [ ] = new int [ a ] ;
		for ( int c = 0 ; c < a ; c ++ ) {
			b [ c ] = scn.nextInt ( ) ;
}
		System.out.println ( fun ( b , a ) ) ;
}
		public static float fun ( int b [ ], int a ) {
		Scanner scn = new Scanner ( System.in ) ;
		float sum =  0 ;
		float d = 0 ;
		for ( int x = 0 ; x < b.length ; x ++ ) {
			sum += b [ x ] ;
}
		for ( int j = 0 ; j < b.length ; j ++ ) {
			d = ( float ) ( d + ( Math.pow ( b [ j ] - sum / a , 2 ) ) ) ;
}
		float y = d / a ;
		return y ;
	}
}
