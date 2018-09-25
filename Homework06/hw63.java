import java.util.Scanner;

public class hw63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = 1;
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] == a[i]) {
                k++;
                if (k > max) max = k;
            } else {
                k = 1;
            }
        }
        System.out.println(max);
    }
}