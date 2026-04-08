import java.util.*;

public class Main {
    public static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static boolean isPerfect(int x) {
        if (x <= 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                sum += i;
                if (i != x / i) sum += x / i;
            }
        }
        return sum == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            boolean p = isPrime(num);
            boolean pf = isPerfect(num);

            if (p && pf) {
                System.out.println("Both");
            } else if (p) {
                System.out.println("Prime");
            } else if (pf) {
                System.out.println("Perfect");
            } else {
                System.out.println("Neither");
            }
        }
    }
}
