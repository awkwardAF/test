import java.util.Scanner;

// сделал не рекурсией

public class taskH {
	
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int b = pow(n);
		switch (b){
			case 1:
				System.out.print("Compaund");
				break;
			case 0:
				System.out.print("Simple");
				break;
		}
	}
	
	public static int pow(int a){
		int l = 0;
		for (int i = 2; i < a; i++)
			if ( a % i == 0 ) {
				l = 1;
			} 
		return l;
	}
}