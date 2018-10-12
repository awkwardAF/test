package ClassTest01;

import java.util.Scanner;

public class ClassTestTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int sum = a.charAt(0) - 48;
        for (int i = 1; i < a.length();
             i += 2) {
            if (a.charAt(i) == "-") {
                sum -= a.charAt(i + 1) - 48;
            }
            else {
                if (a.charAt(i) == "+") {
                    sum += a.charAt(i + 1) - 48;
                }
            }
        }
        System.out.println(sum);
    }
}
