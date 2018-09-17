import static java.lang.Math.*;

import java.util.Scanner;

public class hw33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of numbers");
		int n = sc.nextInt();
		System.out.println("Enter all of them");
		int max = 0;
		int[] c = new int[n];
		for ( int i = 0; i < n; i++){
			c[i] = sc.nextInt()	;
		}	
			for (int i = 0; i < n; i++){
				if (i > 1 && c[i-1] > c[i-2] && c[i-1] > c[i]) {
					max++;
				}
			}	
	System.out.println("The amount of maxes is:");
	System.out.println(max);
	}
}
// if (i > 1 && c[i-1] > c[i-2] && c[i-1] > c[i]) {
	