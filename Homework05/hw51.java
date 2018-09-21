import java.util.Scanner;

public class hw51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
		double b = 0;
        String s, reset = "y";
        while (true) {
            if (reset.equals("y")) {
                System.out.println("Enter a number");
                a = sc.nextDouble();
            }
            System.out.println("Enter sign");
            s = sc.next();
            System.out.println("Enter a number");
            b = sc.nextDouble();
            if (s.equals("*")){
                a = a * b;
            }
            if (s.equals ("/")){
                    a = a / b;
			}
            if (s.equals("+")){
                    a = a + b;
            }
            if (s.equals("-")){
                    a = a - b;
            }
            System.out.println("Result is " + a);
            System.out.println("Reset? y/n");
            reset = sc.next();
        }
    }
}