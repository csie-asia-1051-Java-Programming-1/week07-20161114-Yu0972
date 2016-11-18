package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		int n = scn.nextInt ( ) ;
		System.out.print ( fun ( n ) ) ;
}
	public static int fun ( int n ) {
		int m = 0 ;
		if ( n == 0 )
		return m ;
		else
			return ( m += 1 ) + fun ( n / 10 ) ;
	}
}
