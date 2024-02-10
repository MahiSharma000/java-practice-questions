import java.util.Scanner;

public class EulerPhiAlgorithm {
    public static int phi(int n) {
        float result = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                    result *= (float) (1.0 - (1.0 / i));
                }
            }
        }
        if (n > 1) {
            result -= result / n;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(phi(n));
    }
}
