import java.util.Scanner;

public class hw52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";	
		String s = sc.nextLine();
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= '0' && a[i] <= '9') {
                a[i] = '*';
            }
            result += a[i];
        }
        System.out.println(result);
    }
}