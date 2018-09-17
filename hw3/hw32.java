import static java.lang.Math.*;

import java.util.Scanner;

public class hw32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of numbers");
		int n = sc.nextInt();
		System.out.println("Enter all of them");
		int max = 0;
		int[] c = new int[n];
		for ( int i = 0; i < n; i++){
			int x = sc.nextInt()	;
			if (Math.abs(x) > max) {
				max = Math.abs(x);
			}
		}		
		System.out.println("The max module is");
		System.out.println(max);
	}
}