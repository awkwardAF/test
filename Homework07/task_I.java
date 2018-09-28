import java.util.Scanner;

// не сделано
 
public class task_i {
    public static int rec(int f) {
		for (int i = 0; i < f; i++)
			if (i / f == 0){
				return i;
			}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int result = 0;
		for (int a = 0; a < n; a++)
			result = rec(n);
			System.out.println(result);
    }
}