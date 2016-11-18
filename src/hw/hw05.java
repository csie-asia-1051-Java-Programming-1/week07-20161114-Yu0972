package hw;
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		fun ( scn.nextInt ( ) ) ;
}
	public static long fun ( int n ) {
		if ( n > 0 ) {
			System.out.print ( n % 10 ) ;
			return fun ( n / 10 ) ;
	}else{
			return 0;
		}
	}
}
