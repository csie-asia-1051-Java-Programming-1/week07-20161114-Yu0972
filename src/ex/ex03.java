package ex;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021045 ³¢·¶§e
 */
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		int n = scn.nextInt ( ) ;
		int a , b , c , d , e , f ;
		int [] data = new int [n] ;
		for ( a = 0 ; a < n ; a ++ ) {
			data [ a ] = scn.nextInt ( ) ;
}
		System.out.println ( std ( n , data ) ) ;		
}
	public static double std ( int n , int [ ] f ) {
		return Math.sqrt ( var ( n , f ) ) ;
}
	public static double var( int n , int [ ] data ) {
		int s1 = 0 , s2 = 0 , a , b , c , d , f ;
		for ( a = 0 ; a < n ; a ++ ) {
			s1 = s1 + data [ a ] ;
}
		c = s1 / n ;
		for ( a = 0 ; a < n ; a ++ ) {
			b = c - data [ a ] ;
			d = b * b ;
			s2 = s2 + d ;
}
		f = s2 / n ;
		return f ;
	}
}
