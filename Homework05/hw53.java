import java.util.Scanner;

public class hw53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] a = s.toCharArray();
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = result*10 + a[i]-48;
        }
        System.out.println(result);
    }
}