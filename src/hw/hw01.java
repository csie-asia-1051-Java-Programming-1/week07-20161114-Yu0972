package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		int a = scn.nextInt ( ) ;
		int b = scn.nextInt ( ) ;
		int c = scn.nextInt ( ) ;
		System.out.println ( gcd ( a , b , c ) * ( a / gcd ( a , b , c ) ) * ( b / gcd ( a , b , c ) ) * ( c / gcd ( a , b , c ) ) ) ;			
}
	public static int gcd ( int a , int b ) {
		int d = a % b ;
		if ( d == 0 ) {
			return b ;
	}else{
			return gcd ( b , d ) ;
	}
}
	public static int gcd ( int a , int b , int c ) {
		return gcd ( gcd ( a , b ) , c ) ;
	}
}
