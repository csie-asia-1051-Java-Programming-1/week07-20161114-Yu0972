package ex;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021045 ³¢·¶§e
 */
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		int a = scn.nextInt ( ) ;
		int b [ ] = new int [ a ] ;
		for ( int c = 0 ; c < a ; c ++ ) {
			b [ c ] = scn.nextInt ( ) ;
}
		System.out.println ( std ( b , a ) ) ;
}
		public static float var ( int b [ ] , int a ) {
		float sum = 0 ;
		float d = 0 ;
		for ( int x = 0 ; x < b.length ; x ++ ) {
			sum += b [ x ] ;
}
		for ( int e = 0 ; e < b.length ; e ++ ) {
			d = ( float ) ( d + ( Math.pow ( b [ e ] - sum / a , 2 ) ) ) ;
}
		float y = d / a ;
		return y ;
}
		public static float std ( int b [ ] , int a ) {
		double f = var ( b , a ) ;
		return ( float ) Math.sqrt ( f ) ;
	}
}
