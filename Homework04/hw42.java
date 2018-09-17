import java.util.Scanner;


public class hw42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            s += s.charAt(s.length());
            s = s.substring(s.length()-1);
        }
        System.out.println(s);
    }
}