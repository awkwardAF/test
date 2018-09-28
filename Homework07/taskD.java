import java.util.Scanner;

public class taskD {
	
	public static void main (String [] args){
		int b = pow(5);
		switch (b){
			case 1:
				System.out.print("Yes");
				break;
			case 0:
				System.out.print("No");
				break;
		}
	}
	
	public static int pow(int a){
		int l = 0;
		for (int i = 0; i <= a; i++)
			if (Math.pow(2, i) == a) {
				l = 1;
			} 
		return l;
	}
}