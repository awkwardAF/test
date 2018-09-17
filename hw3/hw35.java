import static java.lang.Math.*;

import java.util.Scanner;

public class hw35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of numbers");
		int n = sc.nextInt();
		System.out.println("Enter all of them");
		int[] c = new int[n];
		for ( int i = 0; i < n; i++){
			c[i] = sc.nextInt()	;
			}
		for ( int i = 0; i < n; i++ ) {
		System.out.print(c[i]);
	}
	}
}