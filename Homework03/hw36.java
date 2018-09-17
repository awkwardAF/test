import static java.lang.Math.*;

import java.util.Scanner;

public class hw36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of numbers");
		int n = sc.nextInt();
		System.out.println("Enter all of them");
		int[] c = new int[n];
		for ( int i = n - 1; i >= 0; i--){
			c[i] = sc.nextInt()	;
			}
		for ( int i = 0; i < n; i++ ) {
			if (i == n -1 ) {
				System.out.print(c[i] + ".");
			}
			else {
				System.out.print(c[i] + ", ");
			}
		}
	}
}