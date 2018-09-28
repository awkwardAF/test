public class taskE {
    public static int rec(int n) {
		if (n < 10) {
            return n;
        }
        else {
            return n % 10 + rec(n / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(rec(12523));
    }
}