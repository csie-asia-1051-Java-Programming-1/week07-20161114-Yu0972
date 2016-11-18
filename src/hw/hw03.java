package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		C ( scn.nextInt ( ) , scn.nextInt ( ) );
}
	public static void C( int m , int n ) {
		fun ( m ) ;
		fun ( n ) ;
		fun ( m - n ) ;
		System.out.print ( fun ( m ) / fun ( n ) / fun ( m - n ) ) ;
}
	public static int fun ( int a ) {
		if ( a == 1 ) {
			return a ;
	}else{
			return a * fun ( a - 1 ) ;
		}
	}
}
