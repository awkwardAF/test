import java.util.Scanner;

public class hw31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count of students");
		int n = sc.nextInt();
		System.out.println("Enter how tall they are:");
		double sum = 0;
		int higher = 0;
		int[] c = new int[n];
		for ( int i = 0; i < n; i++){
			int x = sc.nextInt()	;
			c[i] = x;
			sum = (sum + x);
			}
		double avrg = sum / n;
		for ( int a = 0; a < n; a++){
			if (c[a] > avrg) {
				higher++;
			}		
		}
		System.out.println("The average tallness is");
		System.out.println(avrg);
		System.out.println("Higher then average ");
		System.out.println(higher);
	}
}