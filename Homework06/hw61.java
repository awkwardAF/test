import java.util.Scanner;

public class hw61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(" ");
        for (int i = 0; i < a; i++) {
            for (int n = a.length-1; n > i; n--) {
                if (a[n-1].length() > a[n].length()) {
                    String x = arr[n-1];
                    a[n-1]=a[n];
                    a[n] = x;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }

    }

}