import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class segmentedSeive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> primes = new ArrayList<>();
        int n = sc.nextInt();
        int s = (int) Math.sqrt(n);
        boolean[] isPrime = new boolean[s + 1];
        boolean[] isPrimeRange = new boolean[n - 1]; // Change from s-1 to n-1
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= s; i++) { // Start the loop from 2 instead of 0
            if (isPrime[i]) {
                primes.add(i);
                for (int j = i * i; j <= s; j += i) { // Start from i * i instead of i
                    isPrime[j] = false;
                }
            }
        }
        Arrays.fill(isPrimeRange, true);
        for (int p : primes) {
            int st = (int) Math.ceil(2.0 / p) * p; // Correct the calculation to double
            for (int i = st; i <= n; i += p) { // Loop until n instead of s
                if (i != p) // Exclude the case when i equals p
                    isPrimeRange[i - 2] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrimeRange[i - 2]) {
                System.out.print(i + " ");
            }
        }
    }
}
